package com.paypal.svcs.services;
import java.io.*;
import com.paypal.core.BaseService;
import com.paypal.exception.*;
import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.pt.CreateInvoiceRequest;
import com.paypal.svcs.types.pt.CreateInvoiceResponse;
import com.paypal.svcs.types.pt.SendInvoiceRequest;
import com.paypal.svcs.types.pt.SendInvoiceResponse;
import com.paypal.svcs.types.pt.CreateAndSendInvoiceRequest;
import com.paypal.svcs.types.pt.CreateAndSendInvoiceResponse;
import com.paypal.svcs.types.pt.UpdateInvoiceRequest;
import com.paypal.svcs.types.pt.UpdateInvoiceResponse;
import com.paypal.svcs.types.pt.GetInvoiceDetailsRequest;
import com.paypal.svcs.types.pt.GetInvoiceDetailsResponse;
import com.paypal.svcs.types.pt.CancelInvoiceRequest;
import com.paypal.svcs.types.pt.CancelInvoiceResponse;
import com.paypal.svcs.types.pt.SearchInvoicesRequest;
import com.paypal.svcs.types.pt.SearchInvoicesResponse;
import com.paypal.svcs.types.pt.MarkInvoiceAsPaidRequest;
import com.paypal.svcs.types.pt.MarkInvoiceAsPaidResponse;
import com.paypal.svcs.types.pt.MarkInvoiceAsUnpaidRequest;
import com.paypal.svcs.types.pt.MarkInvoiceAsUnpaidResponse;
import com.paypal.svcs.types.pt.MarkInvoiceAsRefundedRequest;
import com.paypal.svcs.types.pt.MarkInvoiceAsRefundedResponse;
import com.paypal.sdk.exceptions.OAuthException;

public class InvoiceService extends BaseService{


	// Service Version
	public static final String SERVICE_VERSION = "1.6.0";

	// Service Name
	public static final String SERVICE_NAME = "Invoice";

	
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
	 * AUTO_GENERATED
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
	 public CreateInvoiceResponse createInvoice(CreateInvoiceRequest createInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("CreateInvoice", createInvoiceRequest.toNVPString(), apiUsername);
		return CreateInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public CreateInvoiceResponse createInvoice(CreateInvoiceRequest createInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return createInvoice(createInvoiceRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public SendInvoiceResponse sendInvoice(SendInvoiceRequest sendInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("SendInvoice", sendInvoiceRequest.toNVPString(), apiUsername);
		return SendInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public SendInvoiceResponse sendInvoice(SendInvoiceRequest sendInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return sendInvoice(sendInvoiceRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public CreateAndSendInvoiceResponse createAndSendInvoice(CreateAndSendInvoiceRequest createAndSendInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("CreateAndSendInvoice", createAndSendInvoiceRequest.toNVPString(), apiUsername);
		return CreateAndSendInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public CreateAndSendInvoiceResponse createAndSendInvoice(CreateAndSendInvoiceRequest createAndSendInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return createAndSendInvoice(createAndSendInvoiceRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public UpdateInvoiceResponse updateInvoice(UpdateInvoiceRequest updateInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("UpdateInvoice", updateInvoiceRequest.toNVPString(), apiUsername);
		return UpdateInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public UpdateInvoiceResponse updateInvoice(UpdateInvoiceRequest updateInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return updateInvoice(updateInvoiceRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public GetInvoiceDetailsResponse getInvoiceDetails(GetInvoiceDetailsRequest getInvoiceDetailsRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("GetInvoiceDetails", getInvoiceDetailsRequest.toNVPString(), apiUsername);
		return GetInvoiceDetailsResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public GetInvoiceDetailsResponse getInvoiceDetails(GetInvoiceDetailsRequest getInvoiceDetailsRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return getInvoiceDetails(getInvoiceDetailsRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public CancelInvoiceResponse cancelInvoice(CancelInvoiceRequest cancelInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("CancelInvoice", cancelInvoiceRequest.toNVPString(), apiUsername);
		return CancelInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public CancelInvoiceResponse cancelInvoice(CancelInvoiceRequest cancelInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return cancelInvoice(cancelInvoiceRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public SearchInvoicesResponse searchInvoices(SearchInvoicesRequest searchInvoicesRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("SearchInvoices", searchInvoicesRequest.toNVPString(), apiUsername);
		return SearchInvoicesResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public SearchInvoicesResponse searchInvoices(SearchInvoicesRequest searchInvoicesRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return searchInvoices(searchInvoicesRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public MarkInvoiceAsPaidResponse markInvoiceAsPaid(MarkInvoiceAsPaidRequest markInvoiceAsPaidRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("MarkInvoiceAsPaid", markInvoiceAsPaidRequest.toNVPString(), apiUsername);
		return MarkInvoiceAsPaidResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public MarkInvoiceAsPaidResponse markInvoiceAsPaid(MarkInvoiceAsPaidRequest markInvoiceAsPaidRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return markInvoiceAsPaid(markInvoiceAsPaidRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public MarkInvoiceAsUnpaidResponse markInvoiceAsUnpaid(MarkInvoiceAsUnpaidRequest markInvoiceAsUnpaidRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("MarkInvoiceAsUnpaid", markInvoiceAsUnpaidRequest.toNVPString(), apiUsername);
		return MarkInvoiceAsUnpaidResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public MarkInvoiceAsUnpaidResponse markInvoiceAsUnpaid(MarkInvoiceAsUnpaidRequest markInvoiceAsUnpaidRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return markInvoiceAsUnpaid(markInvoiceAsUnpaidRequest, null);
	 }
		
	/**	
	 * AUTO_GENERATED
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
	 public MarkInvoiceAsRefundedResponse markInvoiceAsRefunded(MarkInvoiceAsRefundedRequest markInvoiceAsRefundedRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	String response = call("MarkInvoiceAsRefunded", markInvoiceAsRefundedRequest.toNVPString(), apiUsername);
		return MarkInvoiceAsRefundedResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * AUTO_GENERATED
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
	 public MarkInvoiceAsRefundedResponse markInvoiceAsRefunded(MarkInvoiceAsRefundedRequest markInvoiceAsRefundedRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return markInvoiceAsRefunded(markInvoiceAsRefundedRequest, null);
	 }


}