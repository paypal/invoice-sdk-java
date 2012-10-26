package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.OtherPaymentRefundDetailsType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * The request object for MarkInvoiceAsRefunded. 
 */
public class MarkInvoiceAsRefundedRequest{

	private static final String nameSpace="com.paypal.svcs.types.pt";
	private static final String preferredPrefix="";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * ID of the invoice to mark as refunded. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * Details of the refund made against this invoice. 	  
	 *@Required	 
	 */ 
	private OtherPaymentRefundDetailsType refundDetail;

	

	/**
	 * Constructor with arguments
	 */
	public MarkInvoiceAsRefundedRequest (RequestEnvelope requestEnvelope, String invoiceID, OtherPaymentRefundDetailsType refundDetail){
		this.requestEnvelope = requestEnvelope;
		this.invoiceID = invoiceID;
		this.refundDetail = refundDetail;
	}	

	/**
	 * Default Constructor
	 */
	public MarkInvoiceAsRefundedRequest (){
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
	 * Getter for refundDetail
	 */
	 public OtherPaymentRefundDetailsType getRefundDetail() {
	 	return refundDetail;
	 }
	 
	/**
	 * Setter for refundDetail
	 */
	 public void setRefundDetail(OtherPaymentRefundDetailsType refundDetail) {
	 	this.refundDetail = refundDetail;
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
		if (refundDetail != null) {
			String newPrefix = prefix + "refundDetail.";
			sb.append(refundDetail.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}