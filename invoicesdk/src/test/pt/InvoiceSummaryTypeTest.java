package test.pt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import com.paypal.svcs.types.pt.InvoiceSummaryType;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.StatusType;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class InvoiceSummaryTypeTest {
	InvoiceSummaryType invSummary;
	Map<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void beforeClass() {
		map.put("invoiceID", "INV2-44FQ-MFNV-7Z7V-RSNA");
		map.put("merchantEmail", "jb-us-seller1%40paypal.com");
		map.put("payerEmail", "jbui-us-personal1%40paypal.com");
		map.put("number", "xuan140");
		map.put("totalAmount", "24.00");
		map.put("currencyCode", "USD");
		map.put("invoiceDate", "2011-06-22T12%3A00%3A00.000-07%3A00");
		map.put("dueDate", "2011-06-22T12%3A00%3A00.000-07%3A00");
		map.put("origin", "API");
		map.put("status", "Sent");
		invSummary = InvoiceSummaryType.createInstance(map, "", -1);

	}

	@AfterClass
	public void afterClass() {
		invSummary = null;
	}

	@Test
	public void invoiceSummaryTypeTest() {
		Assert.assertEquals("USD", invSummary.getCurrencyCode());
		Assert.assertEquals("2011-06-22T12%3A00%3A00.000-07%3A00",
				invSummary.getDueDate());
		Assert.assertEquals("2011-06-22T12%3A00%3A00.000-07%3A00",
				invSummary.getInvoiceDate());
		Assert.assertEquals("INV2-44FQ-MFNV-7Z7V-RSNA",
				invSummary.getInvoiceID());
		Assert.assertEquals("jb-us-seller1%40paypal.com",
				invSummary.getMerchantEmail());
		Assert.assertEquals("xuan140", invSummary.getNumber());
		Assert.assertEquals("jbui-us-personal1%40paypal.com",
				invSummary.getPayerEmail());
		Assert.assertEquals(OriginType.API, invSummary.getOrigin());
		Assert.assertEquals(24.00, invSummary.getTotalAmount());
		Assert.assertEquals(StatusType.SENT, invSummary.getStatus());

	}
}
