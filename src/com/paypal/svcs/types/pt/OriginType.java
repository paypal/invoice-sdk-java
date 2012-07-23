package com.paypal.svcs.types.pt;

/**
 * 
 *  Specifies the merchant or payer.
 * 
 */
public enum  OriginType {

	WEB("Web"),

	API("API");

	private String value;

	private OriginType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static OriginType fromValue(String v) {
		for (OriginType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}