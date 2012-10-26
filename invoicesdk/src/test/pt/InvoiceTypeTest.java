package test.pt;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.BaseAddress;
import com.paypal.svcs.types.pt.BusinessInfoType;
import com.paypal.svcs.types.pt.InvoiceItemListType;
import com.paypal.svcs.types.pt.InvoiceItemType;
import com.paypal.svcs.types.pt.InvoiceType;
import com.paypal.svcs.types.pt.PaymentTermsType;

public class InvoiceTypeTest {
	List<InvoiceItemType> lst = new ArrayList<InvoiceItemType>();
	InvoiceType invType;
	InvoiceItemType invItem;
	BusinessInfoType busInfo;
	InvoiceItemListType invoiceItem;

	@BeforeClass
	public void beforeClass() {
		invItem = new InvoiceItemType("product1", 10.0, 1.2);
		lst.add(invItem);
		invoiceItem = new InvoiceItemListType(lst);
		invType = new InvoiceType("jb-us-seller@paypal.com",
				"jbui-us-personal1@paypal.com", invoiceItem, "USD",
				PaymentTermsType.DUEONRECEIPT);
		busInfo = new BusinessInfoType();
		busInfo.setFirstName("John");
		busInfo.setLastName("Smith");
		busInfo.setAddress(new BaseAddress("Main St", "San Jose", "US"));
		invType.setBillingInfo(busInfo);
		invType.setDiscountAmount(100.0);
		invType.setDiscountPercent(12.0);
		invType.setDueDate("30-Jun-2011");
		invType.setInvoiceDate("23-Jun-2011");
		invType.setMerchantInfo(busInfo);
		invType.setMerchantMemo("Invoicing Product");
		invType.setNote("Invoicing Product");
		invType.setNumber("INV-2011");
		invType.setShippingAmount(200.0);
		invType.setShippingInfo(busInfo);
		invType.setShippingTaxName("Invoicing Product");
		invType.setShippingTaxRate(12.5);
		invType.setTerms("Invoice");
	}

	@AfterClass
	public void afterClass() {
		invType = null;
	}

	@Test
	public void toNVPStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"merchantEmail=jb-us-seller%40paypal.com&payerEmail=jbui-us-personal1%40paypal.com&number=INV-2011&merchantInfo.firstName=John&merchantInfo.lastName=Smith&merchantInfo.address.line1=Main+St&merchantInfo.address.city=San+Jose&merchantInfo.address.countryCode=US&itemList.item(0).name=product1&itemList.item(0).quantity=10.0&itemList.item(0).unitPrice=1.2&currencyCode=USD&invoiceDate=23-Jun-2011&dueDate=30-Jun-2011&paymentTerms=DueOnReceipt&discountPercent=12.0&discountAmount=100.0&terms=Invoice&note=Invoicing+Product&merchantMemo=Invoicing+Product&billingInfo.firstName=John&billingInfo.lastName=Smith&billingInfo.address.line1=Main+St&billingInfo.address.city=San+Jose&billingInfo.address.countryCode=US&shippingInfo.firstName=John&shippingInfo.lastName=Smith&shippingInfo.address.line1=Main+St&shippingInfo.address.city=San+Jose&shippingInfo.address.countryCode=US&shippingAmount=200.0&shippingTaxName=Invoicing+Product&shippingTaxRate=12.5&",
				invType.toNVPString());
	}

	@Test
	public void toNVPStringStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"invoice.merchantEmail=jb-us-seller%40paypal.com&invoice.payerEmail=jbui-us-personal1%40paypal.com&invoice.number=INV-2011&invoice.merchantInfo.firstName=John&invoice.merchantInfo.lastName=Smith&invoice.merchantInfo.address.line1=Main+St&invoice.merchantInfo.address.city=San+Jose&invoice.merchantInfo.address.countryCode=US&invoice.itemList.item(0).name=product1&invoice.itemList.item(0).quantity=10.0&invoice.itemList.item(0).unitPrice=1.2&invoice.currencyCode=USD&invoice.invoiceDate=23-Jun-2011&invoice.dueDate=30-Jun-2011&invoice.paymentTerms=DueOnReceipt&invoice.discountPercent=12.0&invoice.discountAmount=100.0&invoice.terms=Invoice&invoice.note=Invoicing+Product&invoice.merchantMemo=Invoicing+Product&invoice.billingInfo.firstName=John&invoice.billingInfo.lastName=Smith&invoice.billingInfo.address.line1=Main+St&invoice.billingInfo.address.city=San+Jose&invoice.billingInfo.address.countryCode=US&invoice.shippingInfo.firstName=John&invoice.shippingInfo.lastName=Smith&invoice.shippingInfo.address.line1=Main+St&invoice.shippingInfo.address.city=San+Jose&invoice.shippingInfo.address.countryCode=US&invoice.shippingAmount=200.0&invoice.shippingTaxName=Invoicing+Product&invoice.shippingTaxRate=12.5&",
				invType.toNVPString("invoice."));
	}
}
