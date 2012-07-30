package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.OtherPaymentDetailsType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * The request object for MarkInvoiceAsPaid. 
 */
public class MarkInvoiceAsPaidRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * ID of the invoice to mark as paid. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * Details of the payment made against this invoice. 	  
	 *@Required	 
	 */ 
	private OtherPaymentDetailsType payment;

	

	/**
	 * Constructor with arguments
	 */
	public MarkInvoiceAsPaidRequest (RequestEnvelope requestEnvelope, String invoiceID, OtherPaymentDetailsType payment){
		this.requestEnvelope = requestEnvelope;
		this.invoiceID = invoiceID;
		this.payment = payment;
	}	

	/**
	 * Default Constructor
	 */
	public MarkInvoiceAsPaidRequest (){
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
	 * Getter for payment
	 */
	 public OtherPaymentDetailsType getPayment() {
	 	return payment;
	 }
	 
	/**
	 * Setter for payment
	 */
	 public void setPayment(OtherPaymentDetailsType payment) {
	 	this.payment = payment;
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
		if (payment != null) {
			String newPrefix = prefix + "payment.";
			sb.append(payment.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}