package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for CreateInvoice. 
 */
public class CreateInvoiceResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * The created invoice's ID. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * The created invoice's number. 	  
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
	 * The total amount of the invoice (cost of items, shipping and
	 * tax, less any discount). 	  
	 *@Required	 
	 */ 
	private Integer totalAmount;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public CreateInvoiceResponse (){
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
	 * Getter for totalAmount
	 */
	 public Integer getTotalAmount() {
	 	return totalAmount;
	 }
	 
	/**
	 * Setter for totalAmount
	 */
	 public void setTotalAmount(Integer totalAmount) {
	 	this.totalAmount = totalAmount;
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
	 


	
	public static CreateInvoiceResponse createInstance(Map<String, String> map, String prefix, int index) {
		CreateInvoiceResponse createInvoiceResponse = null;
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
			createInvoiceResponse = (createInvoiceResponse == null) ? new CreateInvoiceResponse() : createInvoiceResponse;
			createInvoiceResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "invoiceID")) {
				createInvoiceResponse = (createInvoiceResponse == null) ? new CreateInvoiceResponse() : createInvoiceResponse;
				createInvoiceResponse.setInvoiceID(map.get(prefix + "invoiceID"));
		}
		if (map.containsKey(prefix + "invoiceNumber")) {
				createInvoiceResponse = (createInvoiceResponse == null) ? new CreateInvoiceResponse() : createInvoiceResponse;
				createInvoiceResponse.setInvoiceNumber(map.get(prefix + "invoiceNumber"));
		}
		if (map.containsKey(prefix + "invoiceURL")) {
				createInvoiceResponse = (createInvoiceResponse == null) ? new CreateInvoiceResponse() : createInvoiceResponse;
				createInvoiceResponse.setInvoiceURL(map.get(prefix + "invoiceURL"));
		}
		if (map.containsKey(prefix + "totalAmount")) {
				createInvoiceResponse = (createInvoiceResponse == null) ? new CreateInvoiceResponse() : createInvoiceResponse;
				createInvoiceResponse.setTotalAmount(Integer.valueOf(map.get(prefix + "totalAmount")));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				createInvoiceResponse = (createInvoiceResponse == null) ? new CreateInvoiceResponse() : createInvoiceResponse;
				createInvoiceResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return createInvoiceResponse;
	}
 
}