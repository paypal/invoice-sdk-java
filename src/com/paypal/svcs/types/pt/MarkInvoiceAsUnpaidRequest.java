
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;


/**
 * The request object for MarkInvoiceAsUnpaid.
 */
public class MarkInvoiceAsUnpaidRequest {

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
	 * ID of the invoice to mark as unpaid.
	 *
	 * @Required
	 */
	private String invoiceID;
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String value) {
		this.invoiceID = value;
	}


	public MarkInvoiceAsUnpaidRequest(RequestEnvelope requestEnvelope, String invoiceID) {
		this.requestEnvelope = requestEnvelope;
		this.invoiceID = invoiceID;
	}
	public MarkInvoiceAsUnpaidRequest() {
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
		return sb.toString();
	}

}
