package test.pt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.pt.UpdateInvoiceResponse;

public class UpdateInvoiceResponseTest {
	UpdateInvoiceResponse response;
	Map<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void beforeClass() {
		map.put("responseEnvelope.timestamp",
				"2011-06-22T23%3A40%3A52.346-07%3A00");
		map.put("responseEnvelope.ack", "Success");
		map.put("responseEnvelope.correlationId", "d2a6da01ad33d");
		map.put("responseEnvelope.build", "1967323");
		map.put("invoiceID", "INV2-25W4-DYND-677H-3UK6");
		map.put("invoiceNumber", "xuan135");
		map.put("invoiceURL",
				"https%3A%2F%2Fwww.stage2sc5376.qa.paypal.com%2Fus%2Fcgi-bin%2F%3Fcmd%3D_inv-details%26id%3DINV2-25W4-DYND-677H-3UK6");
		response = UpdateInvoiceResponse.createInstance(map, "", -1);

	}

	@AfterClass
	public void afterClass() {
		response = null;
	}

	@Test
	public void updateInvoiceResponseTest() {
		Assert.assertEquals("2011-06-22T23%3A40%3A52.346-07%3A00", response
				.getResponseEnvelope().getTimestamp());
		Assert.assertEquals(AckCode.SUCCESS, response.getResponseEnvelope()
				.getAck());
		Assert.assertEquals("d2a6da01ad33d", response.getResponseEnvelope()
				.getCorrelationId());
		Assert.assertEquals("1967323", response.getResponseEnvelope()
				.getBuild());
		Assert.assertEquals("INV2-25W4-DYND-677H-3UK6", response.getInvoiceID());
		Assert.assertEquals("xuan135", response.getInvoiceNumber());
		Assert.assertEquals(
				"https%3A%2F%2Fwww.stage2sc5376.qa.paypal.com%2Fus%2Fcgi-bin%2F%3Fcmd%3D_inv-details%26id%3DINV2-25W4-DYND-677H-3UK6",
				response.getInvoiceURL());
	}
}
