package test.common;

import java.io.UnsupportedEncodingException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.paypal.svcs.types.common.DetailLevelCode;
import com.paypal.svcs.types.common.RequestEnvelope;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class RequestEnvelopeTest {

	RequestEnvelope env;

	@BeforeClass
	public void beforeClass() {
		env = new RequestEnvelope("en_US");
		env.setDetailLevel(DetailLevelCode.RETURNALL);
	}

	@AfterClass
	public void afterClass() {
		env = null;
	}

	@Test
	public void toNVPStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals("detailLevel=ReturnAll&errorLanguage=en_US&",
				env.toNVPString());
	}

	@Test
	public void toNVPStringStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"requestEnvelope.detailLevel=ReturnAll&requestEnvelope.errorLanguage=en_US&",
				env.toNVPString("requestEnvelope."));
	}
}
