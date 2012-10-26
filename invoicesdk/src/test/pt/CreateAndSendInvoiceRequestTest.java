package test.pt;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.CreateAndSendInvoiceRequest;
import com.paypal.svcs.types.pt.InvoiceItemListType;
import com.paypal.svcs.types.pt.InvoiceItemType;
import com.paypal.svcs.types.pt.InvoiceType;
import com.paypal.svcs.types.pt.PaymentTermsType;

public class CreateAndSendInvoiceRequestTest {

	CreateAndSendInvoiceRequest req;
	RequestEnvelope env;
	InvoiceType invType;
	List<InvoiceItemType> lst = new ArrayList<InvoiceItemType>();
	InvoiceItemType invItem1, invItem2;
	InvoiceItemListType invoiceItem;

	@BeforeClass
	public void beforeClass() {
		env = new RequestEnvelope("en_US");
		invItem2 = new InvoiceItemType("product1", 10.0, 1.2);
		invItem1 = new InvoiceItemType("product2", 5.0, 2.0);
		lst.add(invItem1);
		lst.add(invItem2);
		invoiceItem = new InvoiceItemListType(lst);
		invType = new InvoiceType("jb-us-seller@paypal.com",
				"jbui-us-personal1@paypal.com", invoiceItem, "USD",
				PaymentTermsType.DUEONRECEIPT);
		req = new CreateAndSendInvoiceRequest(env, invType);
	}

	@AfterClass
	public void afterClass() {
		env = null;
		invType = null;
		invItem1 = null;
		invItem2 = null;
		req = null;
	}

	@Test
	public void toNVPStringTest() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"requestEnvelope.errorLanguage=en_US&invoice.merchantEmail=jb-us-seller%40paypal.com&invoice.payerEmail=jbui-us-personal1%40paypal.com&invoice.itemList.item(0).name=product2&invoice.itemList.item(0).quantity=5.0&invoice.itemList.item(0).unitPrice=2.0&invoice.itemList.item(1).name=product1&invoice.itemList.item(1).quantity=10.0&invoice.itemList.item(1).unitPrice=1.2&invoice.currencyCode=USD&invoice.paymentTerms=DueOnReceipt&",
				req.toNVPString());
	}

}
