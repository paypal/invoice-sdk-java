package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.ResponseEnvelope;
import com.paypal.svcs.types.pt.InvoiceType;
import com.paypal.svcs.types.pt.InvoiceDetailsType;
import com.paypal.svcs.types.pt.PaymentDetailsType;
import com.paypal.svcs.types.pt.PaymentRefundDetailsType;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * The response object for CreateInvoice. 
 */
public class GetInvoiceDetailsResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * The requested invoice. 	  
	 *@Required	 
	 */ 
	private InvoiceType invoice;

	/**
	 * The requested invoice details. 	  
	 *@Required	 
	 */ 
	private InvoiceDetailsType invoiceDetails;

	/**
	 * The requested invoice payment details. 	 
	 */ 
	private PaymentDetailsType paymentDetails;

	/**
	 * The requested invoice refund details. 	 
	 */ 
	private PaymentRefundDetailsType refundDetails;

	/**
	 * The URL which lead merchant to view the invoice details on
	 * web. 	  
	 *@Required	 
	 */ 
	private String invoiceURL;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public GetInvoiceDetailsResponse (){
	}	

	/**
	 * Getter for responseEnvelope
	 */
	 public ResponseEnvelope getResponseEnvelope() {
	 	return responseEnvelope;
	 }
	 
	/**
	 * Setter for responseEnvelope
	 */
	 public void setResponseEnvelope(ResponseEnvelope responseEnvelope) {
	 	this.responseEnvelope = responseEnvelope;
	 }
	 
	/**
	 * Getter for invoice
	 */
	 public InvoiceType getInvoice() {
	 	return invoice;
	 }
	 
	/**
	 * Setter for invoice
	 */
	 public void setInvoice(InvoiceType invoice) {
	 	this.invoice = invoice;
	 }
	 
	/**
	 * Getter for invoiceDetails
	 */
	 public InvoiceDetailsType getInvoiceDetails() {
	 	return invoiceDetails;
	 }
	 
	/**
	 * Setter for invoiceDetails
	 */
	 public void setInvoiceDetails(InvoiceDetailsType invoiceDetails) {
	 	this.invoiceDetails = invoiceDetails;
	 }
	 
	/**
	 * Getter for paymentDetails
	 */
	 public PaymentDetailsType getPaymentDetails() {
	 	return paymentDetails;
	 }
	 
	/**
	 * Setter for paymentDetails
	 */
	 public void setPaymentDetails(PaymentDetailsType paymentDetails) {
	 	this.paymentDetails = paymentDetails;
	 }
	 
	/**
	 * Getter for refundDetails
	 */
	 public PaymentRefundDetailsType getRefundDetails() {
	 	return refundDetails;
	 }
	 
	/**
	 * Setter for refundDetails
	 */
	 public void setRefundDetails(PaymentRefundDetailsType refundDetails) {
	 	this.refundDetails = refundDetails;
	 }
	 
	/**
	 * Getter for invoiceURL
	 */
	 public String getInvoiceURL() {
	 	return invoiceURL;
	 }
	 
	/**
	 * Setter for invoiceURL
	 */
	 public void setInvoiceURL(String invoiceURL) {
	 	this.invoiceURL = invoiceURL;
	 }
	 
	/**
	 * Getter for error
	 */
	 public List<ErrorData> getError() {
	 	return error;
	 }
	 
	/**
	 * Setter for error
	 */
	 public void setError(List<ErrorData> error) {
	 	this.error = error;
	 }
	 


	
	public static GetInvoiceDetailsResponse createInstance(Map<String, String> map, String prefix, int index) {
		GetInvoiceDetailsResponse getInvoiceDetailsResponse = null;
		int i = 0;
		if (index != -1) {
				if (!prefix.isEmpty() && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (!prefix.isEmpty() && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		ResponseEnvelope responseEnvelope =  ResponseEnvelope.createInstance(map, prefix + "responseEnvelope", -1);
		if (responseEnvelope != null) {
			getInvoiceDetailsResponse = (getInvoiceDetailsResponse == null) ? new GetInvoiceDetailsResponse() : getInvoiceDetailsResponse;
			getInvoiceDetailsResponse.setResponseEnvelope(responseEnvelope);
		}
		InvoiceType invoice =  InvoiceType.createInstance(map, prefix + "invoice", -1);
		if (invoice != null) {
			getInvoiceDetailsResponse = (getInvoiceDetailsResponse == null) ? new GetInvoiceDetailsResponse() : getInvoiceDetailsResponse;
			getInvoiceDetailsResponse.setInvoice(invoice);
		}
		InvoiceDetailsType invoiceDetails =  InvoiceDetailsType.createInstance(map, prefix + "invoiceDetails", -1);
		if (invoiceDetails != null) {
			getInvoiceDetailsResponse = (getInvoiceDetailsResponse == null) ? new GetInvoiceDetailsResponse() : getInvoiceDetailsResponse;
			getInvoiceDetailsResponse.setInvoiceDetails(invoiceDetails);
		}
		PaymentDetailsType paymentDetails =  PaymentDetailsType.createInstance(map, prefix + "paymentDetails", -1);
		if (paymentDetails != null) {
			getInvoiceDetailsResponse = (getInvoiceDetailsResponse == null) ? new GetInvoiceDetailsResponse() : getInvoiceDetailsResponse;
			getInvoiceDetailsResponse.setPaymentDetails(paymentDetails);
		}
		PaymentRefundDetailsType refundDetails =  PaymentRefundDetailsType.createInstance(map, prefix + "refundDetails", -1);
		if (refundDetails != null) {
			getInvoiceDetailsResponse = (getInvoiceDetailsResponse == null) ? new GetInvoiceDetailsResponse() : getInvoiceDetailsResponse;
			getInvoiceDetailsResponse.setRefundDetails(refundDetails);
		}
		if (map.containsKey(prefix + "invoiceURL")) {
				getInvoiceDetailsResponse = (getInvoiceDetailsResponse == null) ? new GetInvoiceDetailsResponse() : getInvoiceDetailsResponse;
				getInvoiceDetailsResponse.setInvoiceURL(map.get(prefix + "invoiceURL"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				getInvoiceDetailsResponse = (getInvoiceDetailsResponse == null) ? new GetInvoiceDetailsResponse() : getInvoiceDetailsResponse;
				getInvoiceDetailsResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return getInvoiceDetailsResponse;
	}
 
}