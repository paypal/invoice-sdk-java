This repository contains java sdk and samples for Invoicing API.

Prerequisites:
---------------
*	Java jdk-1.5 or higher
*	Apache Maven 2 or higher

To build sdk and samples:
--------------------------
*	First, build core files in https://github.com/paypal/sdk-core-java, because it is a dependency for sdk.
*	Then, run 'mvn install' to build sdk jar and sample war files.

SDK Integration:
----------------
*	Create a new maven application.

*	Add dependency to sdk in your application's pom.xml as below.
		
		<dependency>
			<groupId>com.paypal.sdk</groupId>
			<artifactId>invoicesdk</artifactId>
			<version>2.0.96</version>
		</dependency>

To make an API call:
--------------------		
*	Import InvoiceService.java into your code.
		
*	Copy the configuration file 'sdk_config.properties' in 'invoicesample/src/main/resources' folder to your application 'src/main/resources'. And load it using,  
		  
		new InvoiceService(this.getClass().getResourceAsStream("/sdk_config.properties"));
	
*	Or load the configuration file from any location using absolute path with the below method calls as required.

          new InvoiceService(new File(" .../sdk_config.properties"));
                                 Or
		  new InvoiceService(new InputStream(new File(" .../sdk_config.properties")));
                                 Or
          new InvoiceService(" .../sdk_config.properties");
  
*	Create a service wrapper object.

*	Create a request object as per your project needs. 

*	Invoke the appropriate method on the service wrapper object.

For example,

          
	  import com.paypal.svcs.services.InvoiceService;
	  import com.paypal.svcs.types.common.RequestEnvelope;
	  import com.paypal.svcs.types.pt.CreateInvoiceRequest;
	  import com.paypal.svcs.types.pt.CreateInvoiceResponse;
	  import com.paypal.svcs.types.pt.InvoiceItemType;
	  import com.paypal.svcs.types.pt.InvoiceType;
	  ...
	  
          
          
          RequestEnvelope env = new RequestEnvelope();
	      env.setErrorLanguage("en_US");
          ...
          
		  List<InvoiceItemType> items = new ArrayList<InvoiceItemType>();
		  InvoiceItemListType invoiceItem = new InvoiceItemListType();
          InvoiceItemType item = new InvoiceItemType();
	      item.setName("product1");
		  invoiceItem.setItem(item);
          ...
          
          InvoiceType invo = new InvoiceType();
	      invo.setCurrencyCode("USD");
		  invo.setItemList(invoiceItem);
	      ...
	  
	      CreateInvoiceRequest createInvoiceRequest = new CreateInvoiceRequest();
	      createInvoiceRequest.setInvoice(invo);
	      createInvoiceRequest.setRequestEnvelope(env);
          ...

          InvoiceService invoiceService = new InvoiceService(this.getClass().getResourceAsStream("/sdk_config.properties"));
		  //userName is optional
	      CreateInvoiceResponse createInvoiceResponse = invoiceService.createInvoice(createInvoiceRequest,userName);

		  

SDK Logging:
------------
*	For logging - java.util.logging has been used. To change the default configuration, edit the logging.properties file in 'jre/lib' folder under your JDK root.		  

		  
SDK Configuration:
------------------
The SDK uses .properties format configuration file. Sample of this file is at 
 
'invoicesample/src/main/resources/'. You can use the 'sdk_config.properties' configuration file to configure

*	(Multiple) API account credentials.

*	HTTP connection parameters.

*	Service configuration.


For additional information on Invoicing API, please refer to https://www.x.com/developers/paypal/documentation-tools/api




