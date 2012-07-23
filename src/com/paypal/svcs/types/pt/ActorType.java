package com.paypal.svcs.types.pt;

/**
 * 
 *  Specifies the merchant or payer.
 * 
 */
public enum  ActorType {

	MERCHANT("Merchant"),

	PAYER("Payer");

	private String value;

	private ActorType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ActorType fromValue(String v) {
		for (ActorType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}