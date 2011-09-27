
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.OtherPaymentDetailsType;
import java.io.UnsupportedEncodingException;


/**
 * The request object for MarkInvoiceAsPaid.
 */
public class MarkInvoiceAsPaidRequest {

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
	 * ID of the invoice to mark as paid.
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
	 * Details of the payment made against this invoice.
	 *
	 * @Required
	 */
	private OtherPaymentDetailsType payment;
	public OtherPaymentDetailsType getPayment() {
		return payment;
	}
	public void setPayment(OtherPaymentDetailsType value) {
		this.payment = value;
	}


	public MarkInvoiceAsPaidRequest(RequestEnvelope requestEnvelope, String invoiceID, OtherPaymentDetailsType payment) {
		this.requestEnvelope = requestEnvelope;
		this.invoiceID = invoiceID;
		this.payment = payment;
	}
	public MarkInvoiceAsPaidRequest() {
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
		if( payment != null ) {
			String newPrefix = prefix + "payment.";
			sb.append(payment.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}
