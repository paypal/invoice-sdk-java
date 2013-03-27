package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 *  The response object for DeleteInvoice. 
 */
public class DeleteInvoiceResponse{


	/**
	*  	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	*  	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public DeleteInvoiceResponse (){
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
	 


	
	public static DeleteInvoiceResponse createInstance(Map<String, String> map, String prefix, int index) {
		DeleteInvoiceResponse deleteInvoiceResponse = null;
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
			deleteInvoiceResponse = (deleteInvoiceResponse == null) ? new DeleteInvoiceResponse() : deleteInvoiceResponse;
			deleteInvoiceResponse.setResponseEnvelope(responseEnvelope);
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				deleteInvoiceResponse = (deleteInvoiceResponse == null) ? new DeleteInvoiceResponse() : deleteInvoiceResponse;
				deleteInvoiceResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return deleteInvoiceResponse;
	}
 
}