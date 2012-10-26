package test.pt;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.pt.GetInvoiceDetailsResponse;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.StatusType;

public class GetInvoiceDetailsResponseTest {
	GetInvoiceDetailsResponse response;
	Map<String, String> map = new HashMap<String, String>();

	@BeforeClass
	public void beforeClass() {
		map.put("responseEnvelope.timestamp",
				"2011-06-22T23%3A40%3A52.346-07%3A00");
		map.put("responseEnvelope.ack", "Success");
		map.put("responseEnvelope.correlationId", "d2a6da01ad33d");
		map.put("responseEnvelope.build", "1967323");
		map.put("invoice.merchantEmail", "jb-us-seller1%40paypal.com");
		map.put("invoice.payerEmail", "jbui-us-personal1%40paypal.com");
		map.put("invoice.number", "xuan134");
		map.put("invoice.itemList.item(0).name", "product1");
		map.put("invoice.itemList.item(0).quantity", "10");
		map.put("invoice.itemList.item(0).unitPrice", "1.20");
		map.put("invoice.itemList.item(1).name", "product1");
		map.put("invoice.itemList.item(1).quantity", "10");
		map.put("invoice.itemList.item(1).unitPrice", "1.20");
		map.put("invoice.currencyCode", "USD");
		map.put("invoice.invoiceDate", "2011-06-22T12%3A00%3A00.000-07%3A00");
		map.put("invoice.dueDate", "2011-06-22T12%3A00%3A00.000-07%3A00l");
		map.put("invoice.paymentTerms", "DueOnReceipt");
		map.put("invoice.discountAmount", "0.00");
		map.put("invoice.shippingAmount", "0.00");
		map.put("invoiceDetails.totalAmount", "0.00");
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
		map.put("invoiceURL",
				"https%3A%2F%2Fwww.stage2sc5376.qa.paypal.com%2Fus%2Fcgi-bin%2F%3Fcmd%3D_inv-details%26id%3DINV2-25W4-DYND-677H-3UK6");
		response = GetInvoiceDetailsResponse.createInstance(map, "", -1);
	}

	@AfterClass
	public void afterClass() {
		response = null;
	}

	@Test
	public void GetInvoiceDetailsResponse() {
		Assert.assertEquals("2011-06-22T23%3A40%3A52.346-07%3A00", response
				.getResponseEnvelope().getTimestamp());
		Assert.assertEquals(AckCode.SUCCESS, response.getResponseEnvelope()
				.getAck());
		Assert.assertEquals("d2a6da01ad33d", response.getResponseEnvelope()
				.getCorrelationId());
		Assert.assertEquals("1967323", response.getResponseEnvelope()
				.getBuild());
		Assert.assertEquals("2011-06-22T23%3A40%3A44.000-07%3A00", response
				.getInvoiceDetails().getFirstSentDate());
		Assert.assertEquals("2011-06-22T23%3A40%3A47.000-07%3A00", response
				.getInvoiceDetails().getLastSentDate());
		Assert.assertEquals(StatusType.SENT, response.getInvoiceDetails()
				.getStatus());
		Assert.assertEquals(OriginType.API, response.getInvoiceDetails()
				.getOrigin());
		Assert.assertEquals("2011-06-22T23%3A40%3A43.000-07%3A00", response
				.getInvoiceDetails().getCreatedDate());
		Assert.assertEquals("2011-06-22T23%3A40%3A47.000-07%3A00", response
				.getInvoiceDetails().getLastUpdatedDate());
		Assert.assertEquals("USD", response.getInvoice().getCurrencyCode());
		Assert.assertEquals("2011-06-22T12%3A00%3A00.000-07%3A00l", response
				.getInvoice().getDueDate());
		Assert.assertEquals("2011-06-22T12%3A00%3A00.000-07%3A00", response
				.getInvoice().getInvoiceDate());
		Assert.assertEquals("jb-us-seller1%40paypal.com", response.getInvoice()
				.getMerchantEmail());
		Assert.assertEquals("jbui-us-personal1%40paypal.com", response
				.getInvoice().getPayerEmail());
		Assert.assertEquals(0.0, response.getInvoice().getDiscountAmount());
		Assert.assertEquals(0.0, response.getInvoice().getShippingAmount());
		Assert.assertEquals("xuan134", response.getInvoice().getNumber());
		Assert.assertEquals(2, response.getInvoice().getItemList().getItem()
		 .size());
		Assert.assertEquals(
				"https%3A%2F%2Fwww.stage2sc5376.qa.paypal.com%2Fus%2Fcgi-bin%2F%3Fcmd%3D_inv-details%26id%3DINV2-25W4-DYND-677H-3UK6",
				response.getInvoiceURL());

	}
}
