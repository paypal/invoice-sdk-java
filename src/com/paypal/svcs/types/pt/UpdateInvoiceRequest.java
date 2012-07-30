package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.InvoiceType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * The request object for UpdateInvoice. 
 */
public class UpdateInvoiceRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * invoice's ID 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * Data to populate the newly created invoice. 	  
	 *@Required	 
	 */ 
	private InvoiceType invoice;

	

	/**
	 * Constructor with arguments
	 */
	public UpdateInvoiceRequest (RequestEnvelope requestEnvelope, String invoiceID, InvoiceType invoice){
		this.requestEnvelope = requestEnvelope;
		this.invoiceID = invoiceID;
		this.invoice = invoice;
	}	

	/**
	 * Default Constructor
	 */
	public UpdateInvoiceRequest (){
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
	 * Getter for invoice
	 */
	 public InvoiceType getInvoice() {
	 	return invoice;
	 }
	 
	/**
	 * Setter for invoice
	 */
	 public void setInvoice(InvoiceType invoice) {
	 	this.invoice = invoice;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(requestEnvelope.toNVPString(newPrefix));
		}
		if (invoiceID != null) {
			sb.append(prefix).append("invoiceID=").append(NVPUtil.encodeUrl(invoiceID));
			sb.append("&");
		}
		if (invoice != null) {
			String newPrefix = prefix + "invoice.";
			sb.append(invoice.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}