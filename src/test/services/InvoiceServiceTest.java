package test.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import test.UnitTestConstants;
import test.core.DataProviderClass;

import com.paypal.core.ConfigManager;
import com.paypal.core.Constants;
import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;

import com.paypal.sdk.exceptions.OAuthException;
import com.paypal.svcs.services.InvoiceService;
import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.common.DetailLevelCode;
import com.paypal.svcs.types.common.ErrorData;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.CancelInvoiceRequest;
import com.paypal.svcs.types.pt.CancelInvoiceResponse;
import com.paypal.svcs.types.pt.CreateAndSendInvoiceRequest;
import com.paypal.svcs.types.pt.CreateAndSendInvoiceResponse;
import com.paypal.svcs.types.pt.CreateInvoiceRequest;
import com.paypal.svcs.types.pt.CreateInvoiceResponse;
import com.paypal.svcs.types.pt.GetInvoiceDetailsRequest;
import com.paypal.svcs.types.pt.GetInvoiceDetailsResponse;
import com.paypal.svcs.types.pt.InvoiceItemListType;
import com.paypal.svcs.types.pt.InvoiceItemType;
import com.paypal.svcs.types.pt.InvoiceType;
import com.paypal.svcs.types.pt.MarkInvoiceAsPaidRequest;
import com.paypal.svcs.types.pt.MarkInvoiceAsPaidResponse;
import com.paypal.svcs.types.pt.OtherPaymentDetailsType;
import com.paypal.svcs.types.pt.PaymentTermsType;
import com.paypal.svcs.types.pt.SearchInvoicesRequest;
import com.paypal.svcs.types.pt.SearchInvoicesResponse;
import com.paypal.svcs.types.pt.SearchParametersType;
import com.paypal.svcs.types.pt.SendInvoiceRequest;
import com.paypal.svcs.types.pt.SendInvoiceResponse;
import com.paypal.svcs.types.pt.UpdateInvoiceRequest;
import com.paypal.svcs.types.pt.UpdateInvoiceResponse;

public class InvoiceServiceTest {

	InvoiceService invService;
	InvoiceItemType item;
	InvoiceType invType;
	RequestEnvelope env;
	InvoiceItemListType invoiceItem;
	List<InvoiceItemType> lst = new ArrayList<InvoiceItemType>();
	String invoiceId = Constants.EMPTY_STRING;
	String invoiceNumber = Constants.EMPTY_STRING;
	String invoiceIdForCancel = Constants.EMPTY_STRING;

	@BeforeClass
	public void beforeClass() throws FileNotFoundException, IOException {
		invService = new InvoiceService(UnitTestConstants.FILE_PATH);
		env = new RequestEnvelope("en_US");
		env.setDetailLevel(DetailLevelCode.RETURNALL);
		item = new InvoiceItemType("product1", 10.0, 1.2);
		lst.add(item);
		invoiceItem = new InvoiceItemListType(lst);
		invType = new InvoiceType("jb-us-seller@paypal.com",
				"jbui-us-personal1@paypal.com", invoiceItem, "USD",
				PaymentTermsType.DUEONRECEIPT);

	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 10)
	public void createInvoiceForPermissionHeadersTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			IOException, HttpErrorException, InvalidResponseDataException,
			ClientActionRequiredException, MissingCredentialException,
			InterruptedException, OAuthException {
		env = new RequestEnvelope();
		env.setErrorLanguage("en_US");
		env.setDetailLevel(DetailLevelCode.RETURNALL);

		item = new InvoiceItemType();
		item.setName("product1");
		item.setQuantity(10.0);
		item.setUnitPrice(1.2);

		invType = new InvoiceType();
		invType.setCurrencyCode("USD");

		invType.setMerchantEmail(UnitTestConstants.THIRD_PARTY_MERCHANT);
		invType.setPayerEmail("jbui-us-personal1@paypal.com");

		lst.add(item);
		invoiceItem = new InvoiceItemListType(lst);
		invType.setItemList(invoiceItem);

		invType.setPaymentTerms(PaymentTermsType.DUEONRECEIPT);
		invService.setAccessToken(UnitTestConstants.ACCESS_TOKEN);
		invService.setTokenSecret(UnitTestConstants.TOKEN_SECRET);
		CreateInvoiceRequest req = new CreateInvoiceRequest();
		req.setInvoice(invType);
		req.setRequestEnvelope(env);

		CreateInvoiceResponse response = invService.createInvoice(req,
				UnitTestConstants.API_USER_NAME);
		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
		assert (response.getInvoiceID() != null);
		assert (response.getInvoiceNumber() != null);
		assert (response.getInvoiceID().contains("INV"));

	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 1)
	public void createInvoiceUsingConstructorTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			IOException, HttpErrorException, InvalidResponseDataException,
			ClientActionRequiredException, MissingCredentialException,
			InterruptedException, OAuthException {

		CreateInvoiceRequest req = new CreateInvoiceRequest(env, invType);
		CreateInvoiceResponse response = invService.createInvoice(req);

		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
		assert (response.getInvoiceID() != null);
		assert (response.getInvoiceNumber() != null);
		assert (response.getInvoiceID().contains("INV"));
		invoiceId = response.getInvoiceID();
		invoiceNumber = response.getInvoiceNumber();
	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 2)
	public void sendInvoiceServiceTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			UnsupportedEncodingException, HttpErrorException,
			InvalidResponseDataException, ClientActionRequiredException,
			MissingCredentialException, IOException, InterruptedException,
			OAuthException {
		SendInvoiceRequest req = new SendInvoiceRequest(env, invoiceId);
		SendInvoiceResponse response = invService.sendInvoice(req,
				UnitTestConstants.API_USER_NAME);
		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
		assert (response.getInvoiceID() != null);
		assert (response.getInvoiceID().contains("INV"));
	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 3)
	public void createAndSendInvoiceTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			IOException, HttpErrorException, InvalidResponseDataException,
			ClientActionRequiredException, MissingCredentialException,
			InterruptedException, OAuthException {

		CreateAndSendInvoiceRequest req = new CreateAndSendInvoiceRequest(env,
				invType);

		CreateAndSendInvoiceResponse response = invService
				.createAndSendInvoice(req, UnitTestConstants.API_USER_NAME);
		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
		assert (response.getInvoiceID() != null);
		invoiceIdForCancel = response.getInvoiceID();
		assert (response.getInvoiceNumber() != null);
		assert (response.getInvoiceID().contains("INV"));
	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 5)
	public void getInvoiceDetailsTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			UnsupportedEncodingException, HttpErrorException,
			InvalidResponseDataException, ClientActionRequiredException,
			MissingCredentialException, IOException, InterruptedException,
			OAuthException {
		GetInvoiceDetailsRequest req = new GetInvoiceDetailsRequest(env,
				invoiceId);
		GetInvoiceDetailsResponse response = invService.getInvoiceDetails(req,
				UnitTestConstants.API_USER_NAME);
		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 6)
	public void searchInvoicesTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			UnsupportedEncodingException, HttpErrorException,
			InvalidResponseDataException, ClientActionRequiredException,
			MissingCredentialException, IOException, InterruptedException,
			OAuthException {
		SearchParametersType parameters = new SearchParametersType();
		parameters.setInvoiceNumber(invoiceNumber);
		SearchInvoicesRequest req = new SearchInvoicesRequest(env,
				"jb-us-seller@paypal.com", parameters, 1, 1);
		SearchInvoicesResponse response = invService.searchInvoices(req,
				UnitTestConstants.API_USER_NAME);
		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 8)
	public void cancelInvoiceTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			UnsupportedEncodingException, HttpErrorException,
			InvalidResponseDataException, ClientActionRequiredException,
			MissingCredentialException, IOException, InterruptedException,
			OAuthException {
		CancelInvoiceRequest req = new CancelInvoiceRequest(env);
		req.setInvoiceID(invoiceIdForCancel);
		req.setNoteForPayer("Cancel");
		req.setSendCopyToMerchant(true);
		req.setSubject("Invoicing");
		CancelInvoiceResponse response = invService.cancelInvoice(req,
				UnitTestConstants.API_USER_NAME);
		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 4)
	public void updateInvoiceTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			UnsupportedEncodingException, HttpErrorException,
			InvalidResponseDataException, ClientActionRequiredException,
			MissingCredentialException, IOException, InterruptedException,
			OAuthException {
		UpdateInvoiceRequest req = new UpdateInvoiceRequest(env, invoiceId,
				invType);
		UpdateInvoiceResponse response = invService.updateInvoice(req,
				UnitTestConstants.API_USER_NAME);
		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
	}

	@Test(dataProvider = "configParams", dataProviderClass = DataProviderClass.class, priority = 7)
	public void markInvoiceAsPaidTest(ConfigManager conf)
			throws SSLConfigurationException, InvalidCredentialException,
			UnsupportedEncodingException, HttpErrorException,
			InvalidResponseDataException, ClientActionRequiredException,
			MissingCredentialException, IOException, InterruptedException,
			OAuthException {
		OtherPaymentDetailsType payment = new OtherPaymentDetailsType();
		payment.setDate("2011-06-22");
		MarkInvoiceAsPaidRequest req = new MarkInvoiceAsPaidRequest(env,
				invoiceId, payment);
		MarkInvoiceAsPaidResponse response = invService.markInvoiceAsPaid(req,
				UnitTestConstants.API_USER_NAME);
		Assert.assertNotNull(response);
		assert (response.getResponseEnvelope().getAck() != null);
		assert (response.getResponseEnvelope().getAck().equals(AckCode.SUCCESS));
	}

	@AfterClass
	public void afterClass() {
		invService = null;
		env = null;
		item = null;
		invType = null;
	}
}
