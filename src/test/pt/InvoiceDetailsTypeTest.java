package test.pt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.paypal.svcs.types.pt.ActorType;
import com.paypal.svcs.types.pt.InvoiceDetailsType;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.StatusType;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class InvoiceDetailsTypeTest {
	InvoiceDetailsType invDetails;
	Map<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void beforeClass() {
		map.put("invoiceDetails.status", "Sent");
		map.put("invoiceDetails.origin", "API");
		map.put("invoiceDetails.createdDate",
				"2011-06-22T23%3A40%3A43.000-07%3A00");
		map.put("invoiceDetails.lastUpdatedDate",
				"2011-06-22T23%3A40%3A47.000-07%3A00");
		map.put("invoiceDetails.firstSentDate",
				"2011-06-22T23%3A40%3A44.000-07%3A00");
		map.put("invoiceDetails.lastSentDate",
				"2011-06-22T23%3A40%3A47.000-07%3A00");
		map.put("invoiceDetails.lastUpdatedBy", "jb-us-seller1%40paypal.com");
		map.put("invoiceDetails.createdBy", "jb-us-seller1%40paypal.com");
		map.put("invoiceDetails.canceledByActor", "Merchant");
		map.put("invoiceDetails.lastSentBy", "jb-us-seller1%40paypal.com");
		map.put("invoiceDetails.canceledBy", "jb-us-seller1%40paypal.com");
		map.put("invoiceDetails.paidDate",
				"2011-06-22T23%3A40%3A47.000-07%3A00");
		invDetails = InvoiceDetailsType.createInstance(map, "invoiceDetails", -1);
	}

	@AfterClass
	public void afterClass() {
		invDetails = null;
	}

	@Test
	public void invoiceDetailsTypeTest() {
		Assert.assertEquals("2011-06-22T23%3A40%3A44.000-07%3A00",
				invDetails.getFirstSentDate());
		Assert.assertEquals("2011-06-22T23%3A40%3A47.000-07%3A00",
				invDetails.getLastSentDate());
		Assert.assertEquals(StatusType.SENT, invDetails.getStatus());
		Assert.assertEquals(OriginType.API, invDetails.getOrigin());
		Assert.assertEquals("2011-06-22T23%3A40%3A43.000-07%3A00",
				invDetails.getCreatedDate());
		Assert.assertEquals("2011-06-22T23%3A40%3A47.000-07%3A00",
				invDetails.getLastUpdatedDate());
		Assert.assertEquals("2011-06-22T23%3A40%3A47.000-07%3A00",
				invDetails.getPaidDate());
		Assert.assertEquals(ActorType.MERCHANT, invDetails.getCanceledByActor());
		Assert.assertEquals("jb-us-seller1%40paypal.com",
				invDetails.getCanceledBy());
		Assert.assertEquals("jb-us-seller1%40paypal.com",
				invDetails.getCreatedBy());
		Assert.assertEquals("jb-us-seller1%40paypal.com",
				invDetails.getLastUpdatedBy());
		Assert.assertEquals("jb-us-seller1%40paypal.com",
				invDetails.getLastSentBy());
	}
}
