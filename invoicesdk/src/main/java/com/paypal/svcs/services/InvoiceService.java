package com.paypal.svcs.services;
import java.io.*;
import java.util.Map;
import java.util.Properties;
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
import com.paypal.svcs.types.pt.RemindInvoiceRequest;
import com.paypal.svcs.types.pt.RemindInvoiceResponse;
import com.paypal.svcs.types.pt.GenerateInvoiceNumberRequest;
import com.paypal.svcs.types.pt.GenerateInvoiceNumberResponse;
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
import com.paypal.svcs.types.pt.DeleteInvoiceRequest;
import com.paypal.svcs.types.pt.DeleteInvoiceResponse;
import com.paypal.sdk.exceptions.OAuthException;

public class InvoiceService extends BaseService {


	// Service Version
	public static final String SERVICE_VERSION = "1.12.0";

	// Service Name
	public static final String SERVICE_NAME = "Invoice";

	//SDK Name
	private static final String SDK_NAME = "invoice-java-sdk";
	
	//SDK Version
	private static final String SDK_VERSION = "2.6.117";


	/**
	 * Default <code>InvoiceService</code> Constructor.
	 * Initializes the SDK system with the default configuration file named
	 * 'sdk_config.properties' found in the class-path
	 * 
	 */
	public InvoiceService() {
		super();
	}
	
	/**
	 * <code>InvoiceService</code> that uses the supplied path
	 * to initialize the SDK system. The initialization context is maintained
	 * only for this instance of the class. To initialize the SDK system
	 * globally use the default constructor.
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param configFilePath
	 *            Absolute path to a {@link Properties} file
	 * @throws IOException
	 */
	public InvoiceService(String configFilePath) throws IOException {
		this(new File(configFilePath));
	}
	
	/**
	 * <code>InvoiceService</code> that uses the supplied
	 * {@link File} object to initialize the SDK system. The initialization
	 * context is maintained only for this instance of the class. To initialize
	 * the SDK system globally use the default constructor
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param configFile
	 *            Configuration file in {@link Properties} format
	 * @throws IOException
	 */
	public InvoiceService(File configFile) throws IOException {
		this(new FileInputStream(configFile));
	}		

	/**
	 * <code>InvoiceService</code> that uses the supplied
	 * {@link InputStream} object to initialize the SDK system. The
	 * initialization context is maintained only for this instance of the class.
	 * To initialize the SDK system globally use the default constructor.
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param inputStream
	 *            InputStream of a {@link Properties} file
	 * @throws IOException
	 */
	public InvoiceService(InputStream inputStream) throws IOException {
		super(inputStream);
	}

	/**
	 * <code>InvoiceService</code> that uses the supplied
	 * {@link Properties} to initialize the SDK system. For values that the
	 * properties should hold consult the sample 'sdk_config.properties' file
	 * bundled with the SDK. The initialization context is maintained only for
	 * this instance of the class. To initialize the SDK system globally use the
	 * default constructor.
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param properties
	 *            {@link Properties} object
	 */	
	public InvoiceService(Properties properties) {
		super(properties);
	}
	
	/**
	 * <code>PayPalAPIInterfaceServiceService</code> that uses the supplied
	 * {@link Map} to initialize the SDK system. For values that the map should
	 * hold consult the sample 'sdk_config.properties' file bundled with the
	 * SDK. The initialization context is maintained only for this instance of
	 * the class. To initialize the SDK system globally use the default
	 * constructor.
	 * 
	 * @see PayPalAPIInterfaceServiceService
	 * @param configurationMap
	 *            {@link Map} object
	 */
	public InvoiceService(Map<String, String> configurationMap) {
		super(configurationMap);
	}




	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(createInvoiceRequest.toNVPString(), SERVICE_NAME, "CreateInvoice", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return CreateInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(createInvoiceRequest.toNVPString(), SERVICE_NAME, "CreateInvoice", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return CreateInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(sendInvoiceRequest.toNVPString(), SERVICE_NAME, "SendInvoice", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return SendInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(sendInvoiceRequest.toNVPString(), SERVICE_NAME, "SendInvoice", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return SendInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 public RemindInvoiceResponse remindInvoice(RemindInvoiceRequest remindInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return remindInvoice(remindInvoiceRequest, (String) null);
	 }

	/** 
	 * 
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
	 public RemindInvoiceResponse remindInvoice(RemindInvoiceRequest remindInvoiceRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(remindInvoiceRequest.toNVPString(), SERVICE_NAME, "RemindInvoice", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return RemindInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
	 public RemindInvoiceResponse remindInvoice(RemindInvoiceRequest remindInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(remindInvoiceRequest.toNVPString(), SERVICE_NAME, "RemindInvoice", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return RemindInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 public GenerateInvoiceNumberResponse generateInvoiceNumber(GenerateInvoiceNumberRequest generateInvoiceNumberRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return generateInvoiceNumber(generateInvoiceNumberRequest, (String) null);
	 }

	/** 
	 * 
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
	 public GenerateInvoiceNumberResponse generateInvoiceNumber(GenerateInvoiceNumberRequest generateInvoiceNumberRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(generateInvoiceNumberRequest.toNVPString(), SERVICE_NAME, "GenerateInvoiceNumber", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return GenerateInvoiceNumberResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
	 public GenerateInvoiceNumberResponse generateInvoiceNumber(GenerateInvoiceNumberRequest generateInvoiceNumberRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(generateInvoiceNumberRequest.toNVPString(), SERVICE_NAME, "GenerateInvoiceNumber", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return GenerateInvoiceNumberResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(createAndSendInvoiceRequest.toNVPString(), SERVICE_NAME, "CreateAndSendInvoice", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return CreateAndSendInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(createAndSendInvoiceRequest.toNVPString(), SERVICE_NAME, "CreateAndSendInvoice", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return CreateAndSendInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(updateInvoiceRequest.toNVPString(), SERVICE_NAME, "UpdateInvoice", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return UpdateInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(updateInvoiceRequest.toNVPString(), SERVICE_NAME, "UpdateInvoice", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return UpdateInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(getInvoiceDetailsRequest.toNVPString(), SERVICE_NAME, "GetInvoiceDetails", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return GetInvoiceDetailsResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(getInvoiceDetailsRequest.toNVPString(), SERVICE_NAME, "GetInvoiceDetails", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return GetInvoiceDetailsResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(cancelInvoiceRequest.toNVPString(), SERVICE_NAME, "CancelInvoice", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return CancelInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(cancelInvoiceRequest.toNVPString(), SERVICE_NAME, "CancelInvoice", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return CancelInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(searchInvoicesRequest.toNVPString(), SERVICE_NAME, "SearchInvoices", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return SearchInvoicesResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(searchInvoicesRequest.toNVPString(), SERVICE_NAME, "SearchInvoices", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return SearchInvoicesResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsPaidRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsPaid", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return MarkInvoiceAsPaidResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsPaidRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsPaid", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return MarkInvoiceAsPaidResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsUnpaidRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsUnpaid", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return MarkInvoiceAsUnpaidResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsUnpaidRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsUnpaid", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return MarkInvoiceAsUnpaidResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsRefundedRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsRefunded", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return MarkInvoiceAsRefundedResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(markInvoiceAsRefundedRequest.toNVPString(), SERVICE_NAME, "MarkInvoiceAsRefunded", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return MarkInvoiceAsRefundedResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

	/** 
	 * 
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
	 public DeleteInvoiceResponse deleteInvoice(DeleteInvoiceRequest deleteInvoiceRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return deleteInvoice(deleteInvoiceRequest, (String) null);
	 }

	/** 
	 * 
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
	 public DeleteInvoiceResponse deleteInvoice(DeleteInvoiceRequest deleteInvoiceRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(deleteInvoiceRequest.toNVPString(), SERVICE_NAME, "DeleteInvoice", credential, SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return DeleteInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	
	/**	
	 * 
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
	 public DeleteInvoiceResponse deleteInvoice(DeleteInvoiceRequest deleteInvoiceRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		APICallPreHandler apiCallPreHandler = new PlatformAPICallPreHandler(deleteInvoiceRequest.toNVPString(), SERVICE_NAME, "DeleteInvoice", apiUsername, getAccessToken(), getTokenSecret(), SDK_NAME, SDK_VERSION, "Invoice", this.configurationMap);
	 	String response = call(apiCallPreHandler);
		return DeleteInvoiceResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }

}