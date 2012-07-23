package com.paypal.svcs.types.pt;

/**
 * 
 *  Specifies the payment terms for this invoice.
 * 
 */
public enum  PaymentTermsType {

	DUEONRECEIPT("DueOnReceipt"),

	DUEONDATESPECIFIED("DueOnDateSpecified"),

	NET1("Net10"),

	NET2("Net15"),

	NET3("Net30"),

	NET4("Net45");

	private String value;

	private PaymentTermsType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static PaymentTermsType fromValue(String v) {
		for (PaymentTermsType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}