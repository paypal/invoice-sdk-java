package com.paypal.svcs.services;
import java.io.*;
import com.paypal.core.BaseService;
import com.paypal.exception.*;
import com.paypal.core.credential.ICredential;
import com.paypal.core.APICallPreHandler;
import com.paypal.core.NVPUtil;
import com.paypal.core.nvp.PlatformAPICallPreHandler;
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

	//SDK Name
	private static final String SDK_NAME="sdkname";
	
	//SDK Version
	private static final String SDK_VERSION="sdkversion";

	
	public InvoiceService(File configFile) throws IOException {
		initConfig(configFile);
	}		

	public InvoiceService(InputStream config) throws IOException {
		initConfig(config);
	}

	public InvoiceService(String configFilePath) throws IOException {
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
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(createInvoiceRequest.toNVPString(), SERVICE_NAME, "CreateInvoice", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return createInvoice(createInvoiceRequest, (String) null);
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
	 public CreateInvoiceResponse createInvoice(CreateInvoiceRequest createInvoiceRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(createInvoiceRequest.toNVPString(), SERVICE_NAME, "CreateInvoice", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public SendInvoiceResponse sendInvoice(SendInvoiceRequest sendInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(sendInvoiceRequest.toNVPString(), SERVICE_NAME, "SendInvoice", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return sendInvoice(sendInvoiceRequest, (String) null);
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
	 public SendInvoiceResponse sendInvoice(SendInvoiceRequest sendInvoiceRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(sendInvoiceRequest.toNVPString(), SERVICE_NAME, "SendInvoice", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public CreateAndSendInvoiceResponse createAndSendInvoice(CreateAndSendInvoiceRequest createAndSendInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(createAndSendInvoiceRequest.toNVPString(), SERVICE_NAME, "CreateAndSendInvoice", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return createAndSendInvoice(createAndSendInvoiceRequest, (String) null);
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
	 public CreateAndSendInvoiceResponse createAndSendInvoice(CreateAndSendInvoiceRequest createAndSendInvoiceRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(createAndSendInvoiceRequest.toNVPString(), SERVICE_NAME, "CreateAndSendInvoice", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public UpdateInvoiceResponse updateInvoice(UpdateInvoiceRequest updateInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(updateInvoiceRequest.toNVPString(), SERVICE_NAME, "UpdateInvoice", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return updateInvoice(updateInvoiceRequest, (String) null);
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
	 public UpdateInvoiceResponse updateInvoice(UpdateInvoiceRequest updateInvoiceRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(updateInvoiceRequest.toNVPString(), SERVICE_NAME, "UpdateInvoice", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public GetInvoiceDetailsResponse getInvoiceDetails(GetInvoiceDetailsRequest getInvoiceDetailsRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(getInvoiceDetailsRequest.toNVPString(), SERVICE_NAME, "GetInvoiceDetails", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return getInvoiceDetails(getInvoiceDetailsRequest, (String) null);
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
	 public GetInvoiceDetailsResponse getInvoiceDetails(GetInvoiceDetailsRequest getInvoiceDetailsRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(getInvoiceDetailsRequest.toNVPString(), SERVICE_NAME, "GetInvoiceDetails", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public CancelInvoiceResponse cancelInvoice(CancelInvoiceRequest cancelInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(cancelInvoiceRequest.toNVPString(), SERVICE_NAME, "CancelInvoice", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return cancelInvoice(cancelInvoiceRequest, (String) null);
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
	 public CancelInvoiceResponse cancelInvoice(CancelInvoiceRequest cancelInvoiceRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(cancelInvoiceRequest.toNVPString(), SERVICE_NAME, "CancelInvoice", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public SearchInvoicesResponse searchInvoices(SearchInvoicesRequest searchInvoicesRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(searchInvoicesRequest.toNVPString(), SERVICE_NAME, "SearchInvoices", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return searchInvoices(searchInvoicesRequest, (String) null);
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
	 public SearchInvoicesResponse searchInvoices(SearchInvoicesRequest searchInvoicesRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(searchInvoicesRequest.toNVPString(), SERVICE_NAME, "SearchInvoices", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public MarkInvoiceAsPaidResponse markInvoiceAsPaid(MarkInvoiceAsPaidRequest markInvoiceAsPaidRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsPaidRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsPaid", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return markInvoiceAsPaid(markInvoiceAsPaidRequest, (String) null);
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
	 public MarkInvoiceAsPaidResponse markInvoiceAsPaid(MarkInvoiceAsPaidRequest markInvoiceAsPaidRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsPaidRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsPaid", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public MarkInvoiceAsUnpaidResponse markInvoiceAsUnpaid(MarkInvoiceAsUnpaidRequest markInvoiceAsUnpaidRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsUnpaidRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsUnpaid", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return markInvoiceAsUnpaid(markInvoiceAsUnpaidRequest, (String) null);
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
	 public MarkInvoiceAsUnpaidResponse markInvoiceAsUnpaid(MarkInvoiceAsUnpaidRequest markInvoiceAsUnpaidRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsUnpaidRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsUnpaid", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 public MarkInvoiceAsRefundedResponse markInvoiceAsRefunded(MarkInvoiceAsRefundedRequest markInvoiceAsRefundedRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsRefundedRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsRefunded", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
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
	 	return markInvoiceAsRefunded(markInvoiceAsRefundedRequest, (String) null);
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
	 public MarkInvoiceAsRefundedResponse markInvoiceAsRefunded(MarkInvoiceAsRefundedRequest markInvoiceAsRefundedRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
		apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsRefundedRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsRefunded", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
	 	String response = call(apiCallPreHandler);
		return MarkInvoiceAsRefundedResponse.createInstance(NVPUtil.decode(response), "", -1);
	}

}