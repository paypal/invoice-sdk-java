This application contains API based samples for Invoicing. 

Prerequisites:
---------------
*	Java jdk-1.5 or higher
*	Apache Maven 3 or higher
* Please refer http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html for any help in Maven.

To build and run this application:
----------------------------------

*   Update the 'sdk_config.properties' in the 'invoicesample/src/main/resources' directory with your API credentials.
*	Simply run `mvn install` to build war file.
*	Run `mvn jetty:run` to run the war file.
*	Access `http://localhost:<jetty-port>/invoicesample-2.3.103/` in your browser to play with the test pages.`<jetty-port>` is configurable in `pom.xml`.
