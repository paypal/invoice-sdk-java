package test.pt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.pt.CreateInvoiceResponse;

public class CreateInvoiceResponseTest {

	CreateInvoiceResponse response;
	Map<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void beforeClass() {
		map.put("responseEnvelope.ack", "Success");
		map.put("responseEnvelope.timestamp",
				"2011-05-29T23%3A58%3A46.879-07%3A00");
		map.put("responseEnvelope.correlationId", "2eba4859262a9");
		map.put("responseEnvelope.build", "1917403");
		map.put("invoiceID", "INV2-GEKM-LTFQ-7NWN-9YDL");
		map.put("invoiceNumber", "0019");
		map.put("invoiceURL",
				"https%3A%2F%2Fwww.stage2sc5376.qa.paypal.com%2Fus%2Fcgi-bin%2F%3Fcmd%3D_inv-details%26id%3DINV2-GEKM-LTFQ-7NWN-9YDL");
		response = CreateInvoiceResponse.createInstance(map, "", -1);
	}

	@AfterClass
	public void afterClass() {
		response = null;
	}

	@Test
	public void createInvoiceResponseTest() {
		Assert.assertEquals(response.getResponseEnvelope().getTimestamp(),
				"2011-05-29T23%3A58%3A46.879-07%3A00");
		Assert.assertEquals(response.getResponseEnvelope().getAck(),
				AckCode.SUCCESS);
		Assert.assertEquals(response.getResponseEnvelope().getBuild(),
				"1917403");
		Assert.assertEquals(response.getResponseEnvelope().getCorrelationId(),
				"2eba4859262a9");
		Assert.assertEquals(response.getInvoiceID(), "INV2-GEKM-LTFQ-7NWN-9YDL");
		Assert.assertEquals(response.getInvoiceNumber(), "0019");
		/*
		Assert.assertEquals(
				response.getInvoiceURL(),
				"https%3A%2F%2Fwww.stage2sc5376.qa.paypal.com%2Fus%2Fcgi-bin%2F%3Fcmd%3D_inv-details%26id%3DINV2-GEKM-LTFQ-7NWN-9YDL");
	 	*/
	}
}
