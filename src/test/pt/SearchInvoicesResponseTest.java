package test.pt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.pt.SearchInvoicesResponse;

public class SearchInvoicesResponseTest {
	SearchInvoicesResponse response;
	Map<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void beforeClass() {
		map.put("responseEnvelope.timestamp",
				"2011-06-22T23%3A40%3A52.346-07%3A00");
		map.put("responseEnvelope.ack", "Success");
		map.put("responseEnvelope.correlationId", "d2a6da01ad33d");
		map.put("responseEnvelope.build", "1967323");
		map.put("count", "1");
		map.put("invoiceList.invoice(0).invoiceID", "INV2-44FQ-MFNV-7Z7V-RSNA");
		map.put("invoiceList.invoice(0).merchantEmail",
				"jb-us-seller1%40paypal.com");
		map.put("invoiceList.invoice(0).payerEmail",
				"jbui-us-personal1%40paypal.com");
		map.put("invoiceList.invoice(0).number", "xuan140");
		map.put("invoiceList.invoice(0).totalAmount", "24.00");
		map.put("invoiceList.invoice(0).currencyCode", "USD");
		map.put("invoiceList.invoice(0).invoiceDate",
				"2011-06-22T12%3A00%3A00.000-07%3A00");
		map.put("invoiceList.invoice(0).dueDate",
				"2011-06-22T12%3A00%3A00.000-07%3A00");
		map.put("invoiceList.invoice(0).origin", "API");
		map.put("page", "1");
		map.put("hasNextPage", "false");
		map.put("hasPreviousPage", "false");
		response = SearchInvoicesResponse.createInstance(map, "", -1);
	}

	@AfterClass
	public void afterClass() {
		response = null;
	}

	@Test
	public void searchInvoicesResponseTest() {
		Assert.assertEquals("2011-06-22T23%3A40%3A52.346-07%3A00", response
				.getResponseEnvelope().getTimestamp());
		Assert.assertEquals(AckCode.SUCCESS, response.getResponseEnvelope()
				.getAck());
		Assert.assertEquals("d2a6da01ad33d", response.getResponseEnvelope()
				.getCorrelationId());
		Assert.assertEquals("1967323", response.getResponseEnvelope()
				.getBuild());
		System.out.println(response.getInvoiceList());
		Assert.assertEquals(1, response.getInvoiceList().getInvoice().size());
		Assert.assertEquals(1, response.getCount().intValue());
		Assert.assertEquals(1, response.getPage().intValue());
		Assert.assertEquals(false, response.getHasNextPage().booleanValue());
		Assert.assertEquals(false, response.getHasPreviousPage().booleanValue());
	}
}
