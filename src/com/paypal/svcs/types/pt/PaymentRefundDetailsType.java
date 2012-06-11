
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.svcs.types.pt.OtherPaymentRefundDetailsType;
import com.paypal.svcs.types.pt.PayPalPaymentRefundDetailsType;
import java.util.Map;


/**
 * Payment refund details about the invoice.
 */
public class PaymentRefundDetailsType {

	/**
	 * True if the invoice was refunded using PayPal.
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
	 * Other payment refund details.
	 */
	private PayPalPaymentRefundDetailsType paypalPayment;
	public PayPalPaymentRefundDetailsType getPaypalPayment() {
		return paypalPayment;
	}
	public void setPaypalPayment(PayPalPaymentRefundDetailsType value) {
		this.paypalPayment = value;
	}

	/**
	 * details.
	 */
	private OtherPaymentRefundDetailsType otherPayment;
	public OtherPaymentRefundDetailsType getOtherPayment() {
		return otherPayment;
	}
	public void setOtherPayment(OtherPaymentRefundDetailsType value) {
		this.otherPayment = value;
	}


	public PaymentRefundDetailsType() {
	}
	public PaymentRefundDetailsType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "viaPayPal") ) {
			this.viaPayPal = Boolean.valueOf(map.get(prefix + "viaPayPal"));
		}
		if( map.containsKey(prefix + "paypalPayment" + ".") ) {
			String newPrefix = prefix + "paypalPayment" + '.';
			this.paypalPayment =  new PayPalPaymentRefundDetailsType(map, newPrefix);
		}
		if( map.containsKey(prefix + "otherPayment" + ".note") ) {
			String newPrefix = prefix + "otherPayment" + '.';
			this.otherPayment =  new OtherPaymentRefundDetailsType(map, newPrefix);
		}
	}
}
