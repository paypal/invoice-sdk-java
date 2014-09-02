package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * The request object for GetInvoiceDetails. 
 */
public class GetInvoiceDetailsRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * ID of the invoice to retrieve. 	 
	 */ 
	private String invoiceID;

	/**
	 * Invoice number of the invoice to retrieve. 	 
	 */ 
	private String invoiceNumber;

	

	/**
	 * Constructor with arguments
	 */
	public GetInvoiceDetailsRequest (RequestEnvelope requestEnvelope){
		this.requestEnvelope = requestEnvelope;
	}	

	/**
	 * Default Constructor
	 */
	public GetInvoiceDetailsRequest (){
	}	

	/**
	 * Getter for requestEnvelope
	 */
	 public RequestEnvelope getRequestEnvelope() {
	 	return requestEnvelope;
	 }
	 
	/**
	 * Setter for requestEnvelope
	 */
	 public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
	 	this.requestEnvelope = requestEnvelope;
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
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.invoiceID != null) {
			sb.append(prefix).append("invoiceID=").append(NVPUtil.encodeUrl(this.invoiceID));
			sb.append("&");
		}
		if (this.invoiceNumber != null) {
			sb.append(prefix).append("invoiceNumber=").append(NVPUtil.encodeUrl(this.invoiceNumber));
			sb.append("&");
		}
		return sb.toString();
	}

}