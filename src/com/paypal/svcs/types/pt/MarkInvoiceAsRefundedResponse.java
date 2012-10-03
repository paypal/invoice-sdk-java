package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for MarkInvoiceAsRefunded. 
 */
public class MarkInvoiceAsRefundedResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * The invoice ID of the invoice that was marked as refunded. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * The invoice number of the invoice that was marked as
	 * refunded. 	  
	 *@Required	 
	 */ 
	private String invoiceNumber;

	/**
	 * The URL of the details page of the invoice that was marked
	 * as refunded. 	  
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
	public MarkInvoiceAsRefundedResponse (){
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
	 


	
	public static MarkInvoiceAsRefundedResponse createInstance(Map<String, String> map, String prefix, int index) {
		MarkInvoiceAsRefundedResponse markInvoiceAsRefundedResponse = null;
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
			markInvoiceAsRefundedResponse = (markInvoiceAsRefundedResponse == null) ? new MarkInvoiceAsRefundedResponse() : markInvoiceAsRefundedResponse;
			markInvoiceAsRefundedResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "invoiceID")) {
				markInvoiceAsRefundedResponse = (markInvoiceAsRefundedResponse == null) ? new MarkInvoiceAsRefundedResponse() : markInvoiceAsRefundedResponse;
				markInvoiceAsRefundedResponse.setInvoiceID(map.get(prefix + "invoiceID"));
		}
		if (map.containsKey(prefix + "invoiceNumber")) {
				markInvoiceAsRefundedResponse = (markInvoiceAsRefundedResponse == null) ? new MarkInvoiceAsRefundedResponse() : markInvoiceAsRefundedResponse;
				markInvoiceAsRefundedResponse.setInvoiceNumber(map.get(prefix + "invoiceNumber"));
		}
		if (map.containsKey(prefix + "invoiceURL")) {
				markInvoiceAsRefundedResponse = (markInvoiceAsRefundedResponse == null) ? new MarkInvoiceAsRefundedResponse() : markInvoiceAsRefundedResponse;
				markInvoiceAsRefundedResponse.setInvoiceURL(map.get(prefix + "invoiceURL"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				markInvoiceAsRefundedResponse = (markInvoiceAsRefundedResponse == null) ? new MarkInvoiceAsRefundedResponse() : markInvoiceAsRefundedResponse;
				markInvoiceAsRefundedResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return markInvoiceAsRefundedResponse;
	}
 
}