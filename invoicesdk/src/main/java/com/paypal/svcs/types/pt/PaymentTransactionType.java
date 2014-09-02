package com.paypal.svcs.types.pt;

/**
 * Specifies the payment transaction type.
 *                     
 */
public enum  PaymentTransactionType {

	AUTHORIZATION("Authorization"),

	CAPTURE("Capture"),

	SALE("Sale");

	private String value;

	private PaymentTransactionType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PaymentTransactionType fromValue(String v) {
		for (PaymentTransactionType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}