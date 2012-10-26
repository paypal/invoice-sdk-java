package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.DetailLevelCode;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.SendInvoiceRequest;

public class SendInvoiceRequestTest {
	SendInvoiceRequest req;
	RequestEnvelope env;

	@BeforeClass
	public void beforeClass() {
		env = new RequestEnvelope("en_US");
		env.setDetailLevel(DetailLevelCode.RETURNALL);
		req = new SendInvoiceRequest(env, "INV2-SASU-MTRT-DCDS-WJMY");
	}

	@AfterClass
	public void afterClass() {
		env = null;
		req = null;
	}

	@Test
	public void toNVPStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"requestEnvelope.detailLevel=ReturnAll&requestEnvelope.errorLanguage=en_US&invoiceID=INV2-SASU-MTRT-DCDS-WJMY&",
				req.toNVPString());
	}

}
