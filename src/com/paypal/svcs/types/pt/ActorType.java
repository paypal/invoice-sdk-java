/**
 * Auto generated code
 * Specifies the merchant or payer.
 */
package com.paypal.svcs.types.pt;

public enum ActorType {

 		MERCHANT("Merchant"),
 		PAYER("Payer"),
		;
		private String value;
		ActorType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ActorType fromValue(String v) {
			for (ActorType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
