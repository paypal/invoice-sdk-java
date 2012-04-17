/**
 * Auto generated code
 * Specifies the payment methods that can be used to mark an invoice as paid.
 */
package com.paypal.svcs.types.pt;

public enum PaymentMethodsType {

 		BANKTRANSFER("BankTransfer"),
 		CASH("Cash"),
 		CHECK("Check"),
 		CREDITCARD("CreditCard"),
 		DEBITCARD("DebitCard"),
 		OTHER("Other"),
 		PAYPAL("PayPal"),
 		WIRETRANSFER("WireTransfer"),
		;
		private String value;
		PaymentMethodsType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PaymentMethodsType fromValue(String v) {
			for (PaymentMethodsType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
