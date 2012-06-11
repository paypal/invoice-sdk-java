/**
 * InvoiceService wrapper class
 * Auto generated code
 */
package com.paypal.svcs.services;

import com.paypal.core.BaseService;
import com.paypal.core.NVPUtil;
import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;
import com.paypal.svcs.types.pt.CancelInvoiceRequest;
import com.paypal.svcs.types.pt.CancelInvoiceResponse;
import com.paypal.svcs.types.pt.CreateAndSendInvoiceRequest;
import com.paypal.svcs.types.pt.CreateAndSendInvoiceResponse;
import com.paypal.svcs.types.pt.CreateInvoiceRequest;
import com.paypal.svcs.types.pt.CreateInvoiceResponse;
import com.paypal.svcs.types.pt.GetInvoiceDetailsRequest;
import com.paypal.svcs.types.pt.GetInvoiceDetailsResponse;
import com.paypal.svcs.types.pt.MarkInvoiceAsPaidRequest;
import com.paypal.svcs.types.pt.MarkInvoiceAsPaidResponse;
import com.paypal.svcs.types.pt.MarkInvoiceAsRefundedRequest;
import com.paypal.svcs.types.pt.MarkInvoiceAsRefundedResponse;
import com.paypal.svcs.types.pt.MarkInvoiceAsUnpaidRequest;
import com.paypal.svcs.types.pt.MarkInvoiceAsUnpaidResponse;
import com.paypal.svcs.types.pt.SearchInvoicesRequest;
import com.paypal.svcs.types.pt.SearchInvoicesResponse;
import com.paypal.svcs.types.pt.SendInvoiceRequest;
import com.paypal.svcs.types.pt.SendInvoiceResponse;
import com.paypal.svcs.types.pt.UpdateInvoiceRequest;
import com.paypal.svcs.types.pt.UpdateInvoiceResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;


public class InvoiceService extends BaseService {

	private static final String SERVICE_VERSION = "1.6.0";
	private static final String SERVICE_NAME = "Invoice";

	public InvoiceService(File configFile) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(configFile);
	}
	public InvoiceService(InputStream config) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(config);
	}
	public InvoiceService(String configFilePath) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(configFilePath);
		
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public CreateInvoiceResponse createInvoice (CreateInvoiceRequest CreateInvoiceRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("CreateInvoice", CreateInvoiceRequest.toNVPString(), apiUsername);
		return new CreateInvoiceResponse(NVPUtil.decode(response), "");
	}

	public CreateInvoiceResponse createInvoice (CreateInvoiceRequest CreateInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return createInvoice(CreateInvoiceRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public SendInvoiceResponse sendInvoice (SendInvoiceRequest SendInvoiceRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("SendInvoice", SendInvoiceRequest.toNVPString(), apiUsername);
		return new SendInvoiceResponse(NVPUtil.decode(response), "");
	}

	public SendInvoiceResponse sendInvoice (SendInvoiceRequest SendInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return sendInvoice(SendInvoiceRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public CreateAndSendInvoiceResponse createAndSendInvoice (CreateAndSendInvoiceRequest CreateAndSendInvoiceRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("CreateAndSendInvoice", CreateAndSendInvoiceRequest.toNVPString(), apiUsername);
		return new CreateAndSendInvoiceResponse(NVPUtil.decode(response), "");
	}

	public CreateAndSendInvoiceResponse createAndSendInvoice (CreateAndSendInvoiceRequest CreateAndSendInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return createAndSendInvoice(CreateAndSendInvoiceRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public UpdateInvoiceResponse updateInvoice (UpdateInvoiceRequest UpdateInvoiceRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("UpdateInvoice", UpdateInvoiceRequest.toNVPString(), apiUsername);
		return new UpdateInvoiceResponse(NVPUtil.decode(response), "");
	}

	public UpdateInvoiceResponse updateInvoice (UpdateInvoiceRequest UpdateInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return updateInvoice(UpdateInvoiceRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public GetInvoiceDetailsResponse getInvoiceDetails (GetInvoiceDetailsRequest GetInvoiceDetailsRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("GetInvoiceDetails", GetInvoiceDetailsRequest.toNVPString(), apiUsername);
		return new GetInvoiceDetailsResponse(NVPUtil.decode(response), "");
	}

	public GetInvoiceDetailsResponse getInvoiceDetails (GetInvoiceDetailsRequest GetInvoiceDetailsRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return getInvoiceDetails(GetInvoiceDetailsRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public CancelInvoiceResponse cancelInvoice (CancelInvoiceRequest CancelInvoiceRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("CancelInvoice", CancelInvoiceRequest.toNVPString(), apiUsername);
		return new CancelInvoiceResponse(NVPUtil.decode(response), "");
	}

	public CancelInvoiceResponse cancelInvoice (CancelInvoiceRequest CancelInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return cancelInvoice(CancelInvoiceRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public SearchInvoicesResponse searchInvoices (SearchInvoicesRequest SearchInvoicesRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("SearchInvoices", SearchInvoicesRequest.toNVPString(), apiUsername);
		return new SearchInvoicesResponse(NVPUtil.decode(response), "");
	}

	public SearchInvoicesResponse searchInvoices (SearchInvoicesRequest SearchInvoicesRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return searchInvoices(SearchInvoicesRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public MarkInvoiceAsPaidResponse markInvoiceAsPaid (MarkInvoiceAsPaidRequest MarkInvoiceAsPaidRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("MarkInvoiceAsPaid", MarkInvoiceAsPaidRequest.toNVPString(), apiUsername);
		return new MarkInvoiceAsPaidResponse(NVPUtil.decode(response), "");
	}

	public MarkInvoiceAsPaidResponse markInvoiceAsPaid (MarkInvoiceAsPaidRequest MarkInvoiceAsPaidRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return markInvoiceAsPaid(MarkInvoiceAsPaidRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public MarkInvoiceAsUnpaidResponse markInvoiceAsUnpaid (MarkInvoiceAsUnpaidRequest MarkInvoiceAsUnpaidRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("MarkInvoiceAsUnpaid", MarkInvoiceAsUnpaidRequest.toNVPString(), apiUsername);
		return new MarkInvoiceAsUnpaidResponse(NVPUtil.decode(response), "");
	}

	public MarkInvoiceAsUnpaidResponse markInvoiceAsUnpaid (MarkInvoiceAsUnpaidRequest MarkInvoiceAsUnpaidRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return markInvoiceAsUnpaid(MarkInvoiceAsUnpaidRequest, null);
	}

	/**
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	public MarkInvoiceAsRefundedResponse markInvoiceAsRefunded (MarkInvoiceAsRefundedRequest MarkInvoiceAsRefundedRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("MarkInvoiceAsRefunded", MarkInvoiceAsRefundedRequest.toNVPString(), apiUsername);
		return new MarkInvoiceAsRefundedResponse(NVPUtil.decode(response), "");
	}

	public MarkInvoiceAsRefundedResponse markInvoiceAsRefunded (MarkInvoiceAsRefundedRequest MarkInvoiceAsRefundedRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return markInvoiceAsRefunded(MarkInvoiceAsRefundedRequest, null);
	}

}
