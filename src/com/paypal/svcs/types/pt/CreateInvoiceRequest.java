
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.InvoiceType;
import java.io.UnsupportedEncodingException;


/**
 * The request object for CreateInvoice.
 */
public class CreateInvoiceRequest {

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


	public CreateInvoiceRequest(RequestEnvelope requestEnvelope, InvoiceType invoice) {
		this.requestEnvelope = requestEnvelope;
		this.invoice = invoice;
	}
	public CreateInvoiceRequest() {
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
		if( invoice != null ) {
			String newPrefix = prefix + "invoice.";
			sb.append(invoice.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}
