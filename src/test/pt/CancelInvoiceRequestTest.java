package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.CancelInvoiceRequest;

public class CancelInvoiceRequestTest {

	CancelInvoiceRequest req;

	@BeforeClass
	public void beforeClass() {
		req = new CancelInvoiceRequest(new RequestEnvelope("en_US"));
		req.setInvoiceID("INV2-SASU-MTRT-DCDS-WJMY");
		req.setNoteForPayer("Invoice");
		req.setSendCopyToMerchant(true);
		req.setSubject("Cancel");

	}

	@AfterClass
	public void afterClass() {
		req = null;
	}

	@Test
	public void toNVPString() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"requestEnvelope.errorLanguage=en_US&invoiceID=INV2-SASU-MTRT-DCDS-WJMY&subject=Cancel&noteForPayer=Invoice&sendCopyToMerchant=true&",
				req.toNVPString());
	}

}
