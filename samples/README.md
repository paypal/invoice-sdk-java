PayPal Java Invoicing API sample using the sdk
============================================
	The invoicing-sample project is a API scratch pad application that allows you to test Invoicing APIs. This application is a handy complement to the API reference guides available on cms.paypal.com and x.com. The samples also demonstrate how you can use the SDK to call the API methods in your own application.

To build and run the invoicing-sample:
------------------------------------
* 	update the sdk_config.properties in the invoicing-sample/WebContent/WEB-INF/ directory with your API credentials.
*	simply run ant in the invoicing-sample directory - it would rebuild the SDK if the sdk jar file doesn't exist already.
*	copy the dist/invoicing-sample.war into your tomcat/webapps directory
*	start your tomcat if it's not already running
*	access http://<your-server-host:port>/invoicing-sample/ in your browser to play with the test pages.

