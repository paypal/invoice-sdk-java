package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.OtherPaymentRefundDetailsType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * The request object for MarkInvoiceAsRefunded. 
 */
public class MarkInvoiceAsRefundedRequest{


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
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.invoiceID != null) {
			sb.append(prefix).append("invoiceID=").append(NVPUtil.encodeUrl(this.invoiceID));
			sb.append("&");
		}
		if (this.refundDetail != null) {
			String newPrefix = prefix + "refundDetail.";
			sb.append(this.refundDetail.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}