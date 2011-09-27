/**
 * Auto generated code
 * Specifies the type of payment.
 */
package com.paypal.svcs.types.pt;

public enum OtherPaymentMethodType {

BANKTRANSFER("Bank_transfer"),
CASH("Cash"),
CHECK("Check"),
CREDITCARD("Credit_card"),
DEBITCARD("Debit_card"),
PAYPAL("PayPal"),
WIRETRANSFER("Wire_transfer"),
OTHER("Other"),
	;
private String value;
OtherPaymentMethodType(String val){
value=val;
}public String getValue(){
return value;
}
public static OtherPaymentMethodType fromValue(String v) {
		for (OtherPaymentMethodType c : values())
			if (c.value.equals(v))
				return c;
throw new IllegalArgumentException(v);
}
}
