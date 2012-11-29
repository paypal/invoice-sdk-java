package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * The request object for CancelInvoice. 
 */
public class CancelInvoiceRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * invoice's ID 	 
	 */ 
	private String invoiceID;

	/**
	 * Subject of the cancellation notification 	 
	 */ 
	private String subject;

	/**
	 * Note to send payer within the cancellation notification 	 
	 */ 
	private String noteForPayer;

	/**
	 * send a copy of cancellation notification to merchant 	 
	 */ 
	private Boolean sendCopyToMerchant;

	

	/**
	 * Constructor with arguments
	 */
	public CancelInvoiceRequest (RequestEnvelope requestEnvelope){
		this.requestEnvelope = requestEnvelope;
	}	

	/**
	 * Default Constructor
	 */
	public CancelInvoiceRequest (){
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
	 * Getter for subject
	 */
	 public String getSubject() {
	 	return subject;
	 }
	 
	/**
	 * Setter for subject
	 */
	 public void setSubject(String subject) {
	 	this.subject = subject;
	 }
	 
	/**
	 * Getter for noteForPayer
	 */
	 public String getNoteForPayer() {
	 	return noteForPayer;
	 }
	 
	/**
	 * Setter for noteForPayer
	 */
	 public void setNoteForPayer(String noteForPayer) {
	 	this.noteForPayer = noteForPayer;
	 }
	 
	/**
	 * Getter for sendCopyToMerchant
	 */
	 public Boolean getSendCopyToMerchant() {
	 	return sendCopyToMerchant;
	 }
	 
	/**
	 * Setter for sendCopyToMerchant
	 */
	 public void setSendCopyToMerchant(Boolean sendCopyToMerchant) {
	 	this.sendCopyToMerchant = sendCopyToMerchant;
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
		if (subject != null) {
			sb.append(prefix).append("subject=").append(NVPUtil.encodeUrl(subject));
			sb.append("&");
		}
		if (noteForPayer != null) {
			sb.append(prefix).append("noteForPayer=").append(NVPUtil.encodeUrl(noteForPayer));
			sb.append("&");
		}
		if (sendCopyToMerchant != null) {
			sb.append(prefix).append("sendCopyToMerchant=").append(sendCopyToMerchant);
			sb.append("&");
		}
		return sb.toString();
	}

}