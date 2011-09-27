package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.pt.DateRangeType;

public class DateRangeTypeTest {
	DateRangeType date;

	@BeforeClass
	public void beforeClass() {
		date = new DateRangeType();
		date.setEndDate("2021-06-30");
		date.setStartDate("2021-06-22");
	}

	@AfterClass
	public void afterClass() {
		date = null;
	}

	@Test
	public void toNVPString() throws UnsupportedEncodingException {
		Assert.assertEquals("startDate=2021-06-22&endDate=2021-06-30&",
				date.toNVPString());
	}

	@Test
	public void toNVPStringString() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"invoiceDate.startDate=2021-06-22&invoiceDate.endDate=2021-06-30&",
				date.toNVPString("invoiceDate."));
	}
}
