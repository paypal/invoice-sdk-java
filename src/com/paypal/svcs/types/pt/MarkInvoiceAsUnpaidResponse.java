package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for MarkInvoiceAsUnpaid. 
 */
public class MarkInvoiceAsUnpaidResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * The invoice ID of the invoice that was marked as unpaid. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * The invoice number of the invoice that was marked as unpaid.
	 * 	  
	 *@Required	 
	 */ 
	private String invoiceNumber;

	/**
	 * The URL of the details page of the invoice that was marked
	 * as unpaid. 	  
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
	public MarkInvoiceAsUnpaidResponse (){
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
	 


	
	public static MarkInvoiceAsUnpaidResponse createInstance(Map<String, String> map, String prefix, int index) {
		MarkInvoiceAsUnpaidResponse markInvoiceAsUnpaidResponse = null;
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
			markInvoiceAsUnpaidResponse = (markInvoiceAsUnpaidResponse == null) ? new MarkInvoiceAsUnpaidResponse() : markInvoiceAsUnpaidResponse;
			markInvoiceAsUnpaidResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "invoiceID")) {
				markInvoiceAsUnpaidResponse = (markInvoiceAsUnpaidResponse == null) ? new MarkInvoiceAsUnpaidResponse() : markInvoiceAsUnpaidResponse;
				markInvoiceAsUnpaidResponse.setInvoiceID(map.get(prefix + "invoiceID"));
		}
		if (map.containsKey(prefix + "invoiceNumber")) {
				markInvoiceAsUnpaidResponse = (markInvoiceAsUnpaidResponse == null) ? new MarkInvoiceAsUnpaidResponse() : markInvoiceAsUnpaidResponse;
				markInvoiceAsUnpaidResponse.setInvoiceNumber(map.get(prefix + "invoiceNumber"));
		}
		if (map.containsKey(prefix + "invoiceURL")) {
				markInvoiceAsUnpaidResponse = (markInvoiceAsUnpaidResponse == null) ? new MarkInvoiceAsUnpaidResponse() : markInvoiceAsUnpaidResponse;
				markInvoiceAsUnpaidResponse.setInvoiceURL(map.get(prefix + "invoiceURL"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				markInvoiceAsUnpaidResponse = (markInvoiceAsUnpaidResponse == null) ? new MarkInvoiceAsUnpaidResponse() : markInvoiceAsUnpaidResponse;
				markInvoiceAsUnpaidResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return markInvoiceAsUnpaidResponse;
	}
 
}