
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.svcs.types.common.ErrorData;
import com.paypal.svcs.types.common.ResponseEnvelope;
import com.paypal.svcs.types.pt.InvoiceDetailsType;
import com.paypal.svcs.types.pt.InvoiceType;
import com.paypal.svcs.types.pt.PaymentDetailsType;
import com.paypal.svcs.types.pt.PaymentRefundDetailsType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * The response object for CreateInvoice.
 */
public class GetInvoiceDetailsResponse {

	/**
	 *
	 * @Required
	 */
	private ResponseEnvelope responseEnvelope;
	public ResponseEnvelope getResponseEnvelope() {
		return responseEnvelope;
	}
	public void setResponseEnvelope(ResponseEnvelope value) {
		this.responseEnvelope = value;
	}

	/**
	 * The requested invoice.
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

	/**
	 * The requested invoice details.
	 *
	 * @Required
	 */
	private InvoiceDetailsType invoiceDetails;
	public InvoiceDetailsType getInvoiceDetails() {
		return invoiceDetails;
	}
	public void setInvoiceDetails(InvoiceDetailsType value) {
		this.invoiceDetails = value;
	}

	/**
	 * The requested invoice payment details.
	 */
	private PaymentDetailsType paymentDetails;
	public PaymentDetailsType getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDetailsType value) {
		this.paymentDetails = value;
	}

	/**
	 * The requested invoice refund details.
	 */
	private PaymentRefundDetailsType refundDetails;
	public PaymentRefundDetailsType getRefundDetails() {
		return refundDetails;
	}
	public void setRefundDetails(PaymentRefundDetailsType value) {
		this.refundDetails = value;
	}

	/**
	 * The URL which lead merchant to view the invoice details on web.
	 *
	 * @Required
	 */
	private String invoiceURL;
	public String getInvoiceURL() {
		return invoiceURL;
	}
	public void setInvoiceURL(String value) {
		this.invoiceURL = value;
	}

	/**
	 */
	private List<ErrorData> error = new ArrayList<ErrorData>();
	public List<ErrorData> getError() {
		return error;
	}
	public void setError(List<ErrorData> value) {
		this.error = value;
	}


	public GetInvoiceDetailsResponse() {
	}
	public GetInvoiceDetailsResponse(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "responseEnvelope" + ".timestamp") ) {
			String newPrefix = prefix + "responseEnvelope" + '.';
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if( map.containsKey(prefix + "invoice" + ".merchantEmail") ) {
			String newPrefix = prefix + "invoice" + '.';
			this.invoice =  new InvoiceType(map, newPrefix);
		}
		if( map.containsKey(prefix + "invoiceDetails" + ".totalAmount") ) {
			String newPrefix = prefix + "invoiceDetails" + '.';
			this.invoiceDetails =  new InvoiceDetailsType(map, newPrefix);
		}
		if( map.containsKey(prefix + "paymentDetails" + ".viaPayPal") ) {
			String newPrefix = prefix + "paymentDetails" + '.';
			this.paymentDetails =  new PaymentDetailsType(map, newPrefix);
		}
		if( map.containsKey(prefix + "refundDetails" + ".viaPayPal") ) {
			String newPrefix = prefix + "refundDetails" + '.';
			this.refundDetails =  new PaymentRefundDetailsType(map, newPrefix);
		}
		if( map.containsKey(prefix + "invoiceURL") ) {
			this.invoiceURL = map.get(prefix + "invoiceURL");
		}
		 i=0; 
		 while(true) {
			if( map.containsKey(prefix + "error" + '(' + i + ')'+ ".errorId") ) {
				String newPrefix = prefix + "error" + '(' + i + ')' + '.';
				this.error.add(new ErrorData(map, newPrefix));
			}
			else break;
			i++;
		}
	}
}
