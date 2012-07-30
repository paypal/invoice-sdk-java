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
	 


	public GetInvoiceDetailsResponse(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "responseEnvelope" + ".timestamp")){
			String newPrefix = prefix + "responseEnvelope" + ".";
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if(map.containsKey(prefix + "invoice" + ".merchantEmail")){
			String newPrefix = prefix + "invoice" + ".";
			this.invoice =  new InvoiceType(map, newPrefix);
		}
		if(map.containsKey(prefix + "invoiceDetails" + ".createdDate")){
			String newPrefix = prefix + "invoiceDetails" + ".";
			this.invoiceDetails =  new InvoiceDetailsType(map, newPrefix);
		}
		if(map.containsKey(prefix + "paymentDetails" + ".viaPayPal")){
			String newPrefix = prefix + "paymentDetails" + ".";
			this.paymentDetails =  new PaymentDetailsType(map, newPrefix);
		}
		if(map.containsKey(prefix + "refundDetails" + ".viaPayPal")){
			String newPrefix = prefix + "refundDetails" + ".";
			this.refundDetails =  new PaymentRefundDetailsType(map, newPrefix);
		}
		if(map.containsKey(prefix + "invoiceURL")){
			this.invoiceURL = map.get(prefix + "invoiceURL");
		}
		i = 0;
		while(true) {
			if(map.containsKey(prefix + "error" + "(" + i + ")" + ".errorId")){
				String newPrefix = prefix + "error" + "(" + i + ")" + ".";
				this.error.add(new ErrorData(map, newPrefix));
			} else {
				break;
			}
			i++;
		}
	}

}