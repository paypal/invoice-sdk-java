/**
 * Auto generated code
 * Specifies the payment terms for this invoice.
 */
package com.paypal.svcs.types.pt;

public enum PaymentTermsType {

 		DUEONRECEIPT("DueOnReceipt"),
 		DUEONDATESPECIFIED("DueOnDateSpecified"),
 		NET1("Net10"),
 		NET2("Net15"),
 		NET3("Net30"),
 		NET4("Net45"),
		;
		private String value;
		PaymentTermsType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static PaymentTermsType fromValue(String v) {
			for (PaymentTermsType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
