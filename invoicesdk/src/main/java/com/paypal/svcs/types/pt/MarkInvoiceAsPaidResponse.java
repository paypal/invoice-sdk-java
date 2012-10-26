package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for MarkInvoiceAsPaid. 
 */
public class MarkInvoiceAsPaidResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * The paid invoice ID. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * The paid invoice number. 	  
	 *@Required	 
	 */ 
	private String invoiceNumber;

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
	public MarkInvoiceAsPaidResponse (){
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
	 * Getter for invoiceNumber
	 */
	 public String getInvoiceNumber() {
	 	return invoiceNumber;
	 }
	 
	/**
	 * Setter for invoiceNumber
	 */
	 public void setInvoiceNumber(String invoiceNumber) {
	 	this.invoiceNumber = invoiceNumber;
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
	 


	
	public static MarkInvoiceAsPaidResponse createInstance(Map<String, String> map, String prefix, int index) {
		MarkInvoiceAsPaidResponse markInvoiceAsPaidResponse = null;
		int i = 0;
		if (index != -1) {
				if (prefix != null && prefix.length() != 0 && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (prefix != null && prefix.length() != 0 && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		ResponseEnvelope responseEnvelope =  ResponseEnvelope.createInstance(map, prefix + "responseEnvelope", -1);
		if (responseEnvelope != null) {
			markInvoiceAsPaidResponse = (markInvoiceAsPaidResponse == null) ? new MarkInvoiceAsPaidResponse() : markInvoiceAsPaidResponse;
			markInvoiceAsPaidResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "invoiceID")) {
				markInvoiceAsPaidResponse = (markInvoiceAsPaidResponse == null) ? new MarkInvoiceAsPaidResponse() : markInvoiceAsPaidResponse;
				markInvoiceAsPaidResponse.setInvoiceID(map.get(prefix + "invoiceID"));
		}
		if (map.containsKey(prefix + "invoiceNumber")) {
				markInvoiceAsPaidResponse = (markInvoiceAsPaidResponse == null) ? new MarkInvoiceAsPaidResponse() : markInvoiceAsPaidResponse;
				markInvoiceAsPaidResponse.setInvoiceNumber(map.get(prefix + "invoiceNumber"));
		}
		if (map.containsKey(prefix + "invoiceURL")) {
				markInvoiceAsPaidResponse = (markInvoiceAsPaidResponse == null) ? new MarkInvoiceAsPaidResponse() : markInvoiceAsPaidResponse;
				markInvoiceAsPaidResponse.setInvoiceURL(map.get(prefix + "invoiceURL"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				markInvoiceAsPaidResponse = (markInvoiceAsPaidResponse == null) ? new MarkInvoiceAsPaidResponse() : markInvoiceAsPaidResponse;
				markInvoiceAsPaidResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return markInvoiceAsPaidResponse;
	}
 
}