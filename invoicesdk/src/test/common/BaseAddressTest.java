package test.common;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.BaseAddress;

public class BaseAddressTest {
	BaseAddress addr;

	@BeforeClass
	public void beforeClass() {
		addr = new BaseAddress("Main St", "San Jose", "US");
		addr.setLine2("6th Avenue");
		addr.setPostalCode("2345667");
		addr.setState("California");
	}

	@AfterClass
	public void afterClass() {
		addr = null;
	}

	@Test
	public void toNVPStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"line1=Main+St&line2=6th+Avenue&city=San+Jose&state=California&postalCode=2345667&countryCode=US&",
				addr.toNVPString());
	}

	@Test
	public void toNVPStringStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"addr.line1=Main+St&addr.line2=6th+Avenue&addr.city=San+Jose&addr.state=California&addr.postalCode=2345667&addr.countryCode=US&",
				addr.toNVPString("addr."));
	}
}
