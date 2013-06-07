package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.InvoiceType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * The request object for CreateAndSendInvoice. 
 */
public class CreateAndSendInvoiceRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * Data to populate the newly created invoice. 	  
	 *@Required	 
	 */ 
	private InvoiceType invoice;

	

	/**
	 * Constructor with arguments
	 */
	public CreateAndSendInvoiceRequest (RequestEnvelope requestEnvelope, InvoiceType invoice){
		this.requestEnvelope = requestEnvelope;
		this.invoice = invoice;
	}	

	/**
	 * Default Constructor
	 */
	public CreateAndSendInvoiceRequest (){
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
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.invoice != null) {
			String newPrefix = prefix + "invoice.";
			sb.append(this.invoice.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}