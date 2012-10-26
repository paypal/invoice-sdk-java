package test.pt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.pt.PaymentDetailsType;

public class PaymentDetailsTypeTest {
	PaymentDetailsType type;
	Map<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void beforeClass() {
		map.put("viaPayPal", "true");
		map.put("paypalPayment.transactionID", "383768938");
		map.put("paypalPayment.date", "2021-06-31");
		type = PaymentDetailsType.createInstance(map, "", -1);
	}

	@AfterClass
	public void afterClass() {
		type = null;
	}

	@Test
	public void paymentDetailsTypeTest() {
		Assert.assertEquals(true, type.getViaPayPal().booleanValue());
		Assert.assertEquals("383768938", type.getPaypalPayment()
				.getTransactionID());
		Assert.assertEquals("2021-06-31", type.getPaypalPayment().getDate());
	}
}
