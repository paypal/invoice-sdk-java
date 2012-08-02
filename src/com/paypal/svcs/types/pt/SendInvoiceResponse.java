package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for SendInvoice. 
 */
public class SendInvoiceResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * The sent invoice's ID. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * The URL which lead merchant to view the invoice details on
	 * web. 	  
	 *@Required	 
	 */ 
	private String invoiceURL;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public SendInvoiceResponse (){
	}	

	/**
	 * Getter for responseEnvelope
	 */
	 public ResponseEnvelope getResponseEnvelope() {
	 	return responseEnvelope;
	 }
	 
	/**
	 * Setter for responseEnvelope
	 */
	 public void setResponseEnvelope(ResponseEnvelope responseEnvelope) {
	 	this.responseEnvelope = responseEnvelope;
	 }
	 
	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for invoiceURL
	 */
	 public String getInvoiceURL() {
	 	return invoiceURL;
	 }
	 
	/**
	 * Setter for invoiceURL
	 */
	 public void setInvoiceURL(String invoiceURL) {
	 	this.invoiceURL = invoiceURL;
	 }
	 
	/**
	 * Getter for error
	 */
	 public List<ErrorData> getError() {
	 	return error;
	 }
	 
	/**
	 * Setter for error
	 */
	 public void setError(List<ErrorData> error) {
	 	this.error = error;
	 }
	 


	
	public static SendInvoiceResponse createInstance(Map<String, String> map, String prefix, int index) {
		SendInvoiceResponse sendInvoiceResponse = null;
		int i = 0;
		if (index != -1) {
				if (!prefix.isEmpty() && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (!prefix.isEmpty() && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		ResponseEnvelope responseEnvelope =  ResponseEnvelope.createInstance(map, prefix + "responseEnvelope", -1);
		if (responseEnvelope != null) {
			sendInvoiceResponse = (sendInvoiceResponse == null) ? new SendInvoiceResponse() : sendInvoiceResponse;
			sendInvoiceResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "invoiceID")) {
				sendInvoiceResponse = (sendInvoiceResponse == null) ? new SendInvoiceResponse() : sendInvoiceResponse;
				sendInvoiceResponse.setInvoiceID(map.get(prefix + "invoiceID"));
		}
		if (map.containsKey(prefix + "invoiceURL")) {
				sendInvoiceResponse = (sendInvoiceResponse == null) ? new SendInvoiceResponse() : sendInvoiceResponse;
				sendInvoiceResponse.setInvoiceURL(map.get(prefix + "invoiceURL"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				sendInvoiceResponse = (sendInvoiceResponse == null) ? new SendInvoiceResponse() : sendInvoiceResponse;
				sendInvoiceResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return sendInvoiceResponse;
	}
 
}