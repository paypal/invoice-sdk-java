
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.OtherPaymentRefundDetailsType;
import java.io.UnsupportedEncodingException;


/**
 * The request object for MarkInvoiceAsRefunded.
 */
public class MarkInvoiceAsRefundedRequest {

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
	 * ID of the invoice to mark as refunded.
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
	 * Details of the refund made against this invoice.
	 *
	 * @Required
	 */
	private OtherPaymentRefundDetailsType refundDetail;
	public OtherPaymentRefundDetailsType getRefundDetail() {
		return refundDetail;
	}
	public void setRefundDetail(OtherPaymentRefundDetailsType value) {
		this.refundDetail = value;
	}


	public MarkInvoiceAsRefundedRequest(RequestEnvelope requestEnvelope, String invoiceID, OtherPaymentRefundDetailsType refundDetail) {
		this.requestEnvelope = requestEnvelope;
		this.invoiceID = invoiceID;
		this.refundDetail = refundDetail;
	}
	public MarkInvoiceAsRefundedRequest() {
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
		if( refundDetail != null ) {
			String newPrefix = prefix + "refundDetail.";
			sb.append(refundDetail.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}
