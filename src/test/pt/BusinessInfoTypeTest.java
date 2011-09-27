package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.BaseAddress;
import com.paypal.svcs.types.pt.BusinessInfoType;

public class BusinessInfoTypeTest {
	BusinessInfoType busInfo;

	@BeforeClass
	public void beforeClass() {
		busInfo = new BusinessInfoType();
		busInfo.setFirstName("John");
		busInfo.setLastName("Smith");
		busInfo.setAddress(new BaseAddress("Main St", "San Jose", "US"));
		busInfo.setBusinessName("Invoicing");
		busInfo.setCustomValue("Invoicing");
		busInfo.setFax("348678903");
		busInfo.setPhone("235566788");
		busInfo.setWebsite("www.invoicing.com");
	}

	@AfterClass
	public void afterClass() {
		busInfo = null;
	}

	@Test
	public void toNVPStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"firstName=John&lastName=Smith&businessName=Invoicing&phone=235566788&fax=348678903&website=www.invoicing.com&customValue=Invoicing&address.line1=Main+St&address.city=San+Jose&address.countryCode=US&",
				busInfo.toNVPString());
	}

	@Test
	public void toNVPStringStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"businessInfo.firstName=John&businessInfo.lastName=Smith&businessInfo.businessName=Invoicing&businessInfo.phone=235566788&businessInfo.fax=348678903&businessInfo.website=www.invoicing.com&businessInfo.customValue=Invoicing&businessInfo.address.line1=Main+St&businessInfo.address.city=San+Jose&businessInfo.address.countryCode=US&",
				busInfo.toNVPString("businessInfo."));
	}
}
