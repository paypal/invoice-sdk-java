
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import java.util.Map;


/**
 * PayPal payment details about the invoice.
 */
public class PayPalPaymentDetailsType {

	/**
	 * Transaction ID of the PayPal payment.
	 *
	 * @Required
	 */
	private String transactionID;
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String value) {
		this.transactionID = value;
	}

	/**
	 * Date when the invoice was paid.
	 */
	private String date;
	public String getDate() {
		return date;
	}
	public void setDate(String value) {
		this.date = value;
	}


	public PayPalPaymentDetailsType() {
	}
	public PayPalPaymentDetailsType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "transactionID") ) {
			this.transactionID = map.get(prefix + "transactionID");
		}
		if( map.containsKey(prefix + "date") ) {
			this.date = map.get(prefix + "date");
		}
	}
}
