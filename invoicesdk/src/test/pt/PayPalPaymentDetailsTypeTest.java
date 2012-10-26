package test.pt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.pt.PayPalPaymentDetailsType;

public class PayPalPaymentDetailsTypeTest {
	PayPalPaymentDetailsType type;
	Map<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void beforeClass() {
		map.put("transactionID", "383768938");
		map.put("date", "2021-06-31");
		type = PayPalPaymentDetailsType.createInstance(map, "", -1);
	}

	@AfterClass
	public void afterClass() {
		type = null;
	}

	@Test
	public void payPalPaymentDetailsTypeTest() {
		Assert.assertEquals("383768938", type.getTransactionID());
		Assert.assertEquals("2021-06-31", type.getDate());
	}
}
