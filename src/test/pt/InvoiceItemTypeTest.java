package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.pt.InvoiceItemType;

public class InvoiceItemTypeTest {
	InvoiceItemType invItem;

	@BeforeClass
	public void beforeClass() {
		invItem = new InvoiceItemType("product1", 10.0, 1.2);
		invItem.setDate("23-Jun-2011");
		invItem.setDescription("New Product");
		invItem.setTaxName("product");
		invItem.setTaxRate(12.5);
	}

	@AfterClass
	public void afterClass() {
		invItem = null;
	}

	@Test
	public void toNVPStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"name=product1&description=New+Product&date=23-Jun-2011&quantity=10.0&unitPrice=1.2&taxName=product&taxRate=12.5&",
				invItem.toNVPString());
	}

	@Test
	public void toNVPStringStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"item.name=product1&item.description=New+Product&item.date=23-Jun-2011&item.quantity=10.0&item.unitPrice=1.2&item.taxName=product&item.taxRate=12.5&",
				invItem.toNVPString("item."));
	}
}
