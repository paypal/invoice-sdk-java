
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;


/**
 * The request object for CancelInvoice.
 */
public class CancelInvoiceRequest {

	/**
	 *
	 * @Required
	 */
	private RequestEnvelope requestEnvelope;
	public RequestEnvelope getRequestEnvelope() {
		return requestEnvelope;
	}
	public void setRequestEnvelope(RequestEnvelope value) {
		this.requestEnvelope = value;
	}

	/**
	 * invoice's ID
	 */
	private String invoiceID;
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String value) {
		this.invoiceID = value;
	}

	/**
	 * Subject of the cancellation notification
	 */
	private String subject;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String value) {
		this.subject = value;
	}

	/**
	 * Note to send payer within the cancellation notification
	 */
	private String noteForPayer;
	public String getNoteForPayer() {
		return noteForPayer;
	}
	public void setNoteForPayer(String value) {
		this.noteForPayer = value;
	}

	/**
	 * send a copy of cancellation notification to merchant
	 */
	private Boolean sendCopyToMerchant;
	public Boolean getSendCopyToMerchant() {
		return sendCopyToMerchant;
	}
	public void setSendCopyToMerchant(Boolean value) {
		this.sendCopyToMerchant = value;
	}


	public CancelInvoiceRequest(RequestEnvelope requestEnvelope) {
		this.requestEnvelope = requestEnvelope;
	}
	public CancelInvoiceRequest() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( requestEnvelope != null ) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(requestEnvelope.toNVPString(newPrefix));
		}
		if( invoiceID != null ) {
			sb.append(prefix).append("invoiceID=").append(NVPUtil.encodeUrl(invoiceID));
			sb.append('&');
		}
		if( subject != null ) {
			sb.append(prefix).append("subject=").append(NVPUtil.encodeUrl(subject));
			sb.append('&');
		}
		if( noteForPayer != null ) {
			sb.append(prefix).append("noteForPayer=").append(NVPUtil.encodeUrl(noteForPayer));
			sb.append('&');
		}
		if( sendCopyToMerchant != null ) {
			sb.append(prefix).append("sendCopyToMerchant=").append(sendCopyToMerchant);
			sb.append('&');
		}
		return sb.toString();
	}

}
