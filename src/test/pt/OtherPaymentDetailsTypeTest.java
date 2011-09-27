package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.pt.OtherPaymentDetailsType;
import com.paypal.svcs.types.pt.PaymentMethodsType;

public class OtherPaymentDetailsTypeTest {
	OtherPaymentDetailsType payment;

	@BeforeClass
	public void beforeClass() {
		payment = new OtherPaymentDetailsType();
		payment.setDate("2011-06-22");
		payment.setMethod(PaymentMethodsType.PAYPAL);
		payment.setNote("Invoice");
	}

	@AfterClass
	public void afterClass() {
		payment = null;
	}

	@Test
	public void toNVPString() throws UnsupportedEncodingException {
		Assert.assertEquals("method=PayPal&note=Invoice&date=2011-06-22&",
				payment.toNVPString());
	}

	@Test
	public void toNVPStringString() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"payment.method=PayPal&payment.note=Invoice&payment.date=2011-06-22&",
				payment.toNVPString("payment."));
	}
}
