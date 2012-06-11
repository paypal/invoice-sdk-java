/**
 * Auto generated code
 * Specifies the invoice status.
 */
package com.paypal.svcs.types.pt;

public enum StatusType {

 		DRAFT("Draft"),
 		SENT("Sent"),
 		PAID("Paid"),
 		MARKEDASPAID("MarkedAsPaid"),
 		CANCELED("Canceled"),
 		REFUNDED("Refunded"),
 		PARTIALLYREFUNDED("PartiallyRefunded"),
 		MARKEDASREFUNDED("MarkedAsRefunded"),
		;
		private String value;
		StatusType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static StatusType fromValue(String v) {
			for (StatusType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
