
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.InvoiceType;
import java.io.UnsupportedEncodingException;


/**
 * The request object for UpdateInvoice.
 */
public class UpdateInvoiceRequest {

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

	/**
	 * Data to populate the newly created invoice.
	 *
	 * @Required
	 */
	private InvoiceType invoice;
	public InvoiceType getInvoice() {
		return invoice;
	}
	public void setInvoice(InvoiceType value) {
		this.invoice = value;
	}


	public UpdateInvoiceRequest(RequestEnvelope requestEnvelope, String invoiceID, InvoiceType invoice) {
		this.requestEnvelope = requestEnvelope;
		this.invoiceID = invoiceID;
		this.invoice = invoice;
	}
	public UpdateInvoiceRequest() {
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
		if( invoice != null ) {
			String newPrefix = prefix + "invoice.";
			sb.append(invoice.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}
