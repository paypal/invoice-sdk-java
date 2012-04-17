/**
 * Auto generated code
 * Specifies the merchant or payer.
 */
package com.paypal.svcs.types.pt;

public enum OriginType {

 		WEB("Web"),
 		API("API"),
		;
		private String value;
		OriginType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static OriginType fromValue(String v) {
			for (OriginType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}
