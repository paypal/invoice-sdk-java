package com.paypal.svcs.types.pt;

/**
 * 
 *  Specifies the payment methods that can be used to mark an
 * invoice as paid.
 * 
 */
public enum  PaymentMethodsType {

	BANKTRANSFER("BankTransfer"),

	CASH("Cash"),

	CHECK("Check"),

	CREDITCARD("CreditCard"),

	DEBITCARD("DebitCard"),

	OTHER("Other"),

	PAYPAL("PayPal"),

	WIRETRANSFER("WireTransfer");

	private String value;

	private PaymentMethodsType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PaymentMethodsType fromValue(String v) {
		for (PaymentMethodsType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}