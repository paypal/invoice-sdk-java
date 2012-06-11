Prerequisites:
--------------
*	Java jdk-1.5 or higher

Using SDK:
----------
SDK Integration:
----------------
*	Download the project from github, build project using build.xml with default ant target, which will create 			    'invoicing-java-sdk-1.2.90.jar' inside 'dist' folder.

*	Copy 'invoicing-java-sdk-1.2.90.jar' inside 'dist' folder under SDK root, to your class path.

*	Copy the configuration file 'sdk_config.properties' in SDK 'resource' folder to your project.

*	Import InvoiceService.java into your code.

*	Load the configuration file into your application with the below method calls as required.

          new InvoiceService(new File(" .../sdk_config.properties"));
                                 Or
          new InvoiceService(new InputStream(new File(" .../sdk_config.properties")));
                                 Or
          new InvoiceService(" .../sdk_config.properties");

Eg. if your sdk_config.properties file is in your WEB-INF/ folder, you can initialize the InvoiceService as below:	
	
		  new InvoiceService(this.getServletContext().getRealPath("/") + "/WEB-INF/sdk_config.properties");
		

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
	  
	      CreateInvoiceRequest request = new CreateInvoiceRequest();
	      request.setInvoice(invo);
	      request.setRequestEnvelope(env);
          ...

          //userName is optional
          InvoiceService invc = new InvoiceService(".../sdk_config.properties");
	      CreateInvoiceResponse ret = invc.createInvoice(req,userName);


SDK Testing:
-----------

*	To run test cases, 'testng.jar' in SDK lib folder is required in class path.

*	Run default ant target "dist" to compile and test the sdk classes.

*	Junit reports are generated in testReport folder.

*   'UnitTestConstants.java' in test folder contains constants for testing. It will mimic the API User Details and resource details in properties file. Replace the constants with your own appropriate values.


SDK Logging:
------------
*	For logging - java.util.logging has been used. To change the default configuration, edit the
 
logging.properties file in 'jre/lib' folder under your JDK root.


SDK Configuration:
------------------
The SDK uses .properties format configuration file. Sample of this file is at 
 
'resource/'. You can use the 'sdk_config.properties' configuration file to configure

*	(Multiple) API account credentials.

*	HTTP connection parameters.

*	Service configuration.

Please refer to the sample config file provided with this bundle.

