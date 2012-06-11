
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.svcs.types.pt.OtherPaymentDetailsType;
import com.paypal.svcs.types.pt.PayPalPaymentDetailsType;
import java.util.Map;


/**
 * Payment details about the invoice.
 */
public class PaymentDetailsType {

	/**
	 * True if the invoice was paid using PayPal.
	 *
	 * @Required
	 */
	private Boolean viaPayPal;
	public Boolean getViaPayPal() {
		return viaPayPal;
	}
	public void setViaPayPal(Boolean value) {
		this.viaPayPal = value;
	}

	/**
	 * PayPal payment details.
	 */
	private PayPalPaymentDetailsType paypalPayment;
	public PayPalPaymentDetailsType getPaypalPayment() {
		return paypalPayment;
	}
	public void setPaypalPayment(PayPalPaymentDetailsType value) {
		this.paypalPayment = value;
	}

	/**
	 * Other payment details.
	 */
	private OtherPaymentDetailsType otherPayment;
	public OtherPaymentDetailsType getOtherPayment() {
		return otherPayment;
	}
	public void setOtherPayment(OtherPaymentDetailsType value) {
		this.otherPayment = value;
	}


	public PaymentDetailsType() {
	}
	public PaymentDetailsType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "viaPayPal") ) {
			this.viaPayPal = Boolean.valueOf(map.get(prefix + "viaPayPal"));
		}
		if( map.containsKey(prefix + "paypalPayment" + ".transactionID") ) {
			String newPrefix = prefix + "paypalPayment" + '.';
			this.paypalPayment =  new PayPalPaymentDetailsType(map, newPrefix);
		}
		if( map.containsKey(prefix + "otherPayment" + ".note") ) {
			String newPrefix = prefix + "otherPayment" + '.';
			this.otherPayment =  new OtherPaymentDetailsType(map, newPrefix);
		}
	}
}
