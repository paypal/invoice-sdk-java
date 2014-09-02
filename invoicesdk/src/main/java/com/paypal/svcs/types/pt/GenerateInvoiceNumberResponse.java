package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for GenerateInvoiceNumber. 
 */
public class GenerateInvoiceNumberResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * Next Invoice NUmber for the Merchant. 	  
	 *@Required	 
	 */ 
	private String invoiceNumber;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public GenerateInvoiceNumberResponse (){
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
	 


	
	public static GenerateInvoiceNumberResponse createInstance(Map<String, String> map, String prefix, int index) {
		GenerateInvoiceNumberResponse generateInvoiceNumberResponse = null;
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
			generateInvoiceNumberResponse = (generateInvoiceNumberResponse == null) ? new GenerateInvoiceNumberResponse() : generateInvoiceNumberResponse;
			generateInvoiceNumberResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "invoiceNumber")) {
				generateInvoiceNumberResponse = (generateInvoiceNumberResponse == null) ? new GenerateInvoiceNumberResponse() : generateInvoiceNumberResponse;
				generateInvoiceNumberResponse.setInvoiceNumber(map.get(prefix + "invoiceNumber"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				generateInvoiceNumberResponse = (generateInvoiceNumberResponse == null) ? new GenerateInvoiceNumberResponse() : generateInvoiceNumberResponse;
				generateInvoiceNumberResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return generateInvoiceNumberResponse;
	}
 
}