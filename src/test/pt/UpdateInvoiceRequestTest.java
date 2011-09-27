package test.pt;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.InvoiceItemListType;
import com.paypal.svcs.types.pt.InvoiceItemType;
import com.paypal.svcs.types.pt.InvoiceType;
import com.paypal.svcs.types.pt.PaymentTermsType;
import com.paypal.svcs.types.pt.UpdateInvoiceRequest;

public class UpdateInvoiceRequestTest {
	UpdateInvoiceRequest req;
	List<InvoiceItemType> lst = new ArrayList<InvoiceItemType>();
	InvoiceType invType;
	InvoiceItemType invItem;
	InvoiceItemListType invoiceItem;

	@BeforeClass
	public void beforeClass() {
		invItem = new InvoiceItemType("product1", 10.0, 1.2);
		lst.add(invItem);
		invoiceItem = new InvoiceItemListType(lst);
		invType = new InvoiceType("jb-us-seller@paypal.com",
				"jbui-us-personal1@paypal.com", invoiceItem, "USD",
				PaymentTermsType.DUEONRECEIPT);
		req = new UpdateInvoiceRequest(new RequestEnvelope("en_US"),
				"INV2-SASU-MTRT-DCDS-WJMY", invType);
	}

	@AfterClass
	public void afterClass() {
		invItem = null;
		invType = null;
		req = null;
	}

	@Test
	public void toNVPString() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"requestEnvelope.errorLanguage=en_US&invoiceID=INV2-SASU-MTRT-DCDS-WJMY&invoice.merchantEmail=jb-us-seller%40paypal.com&invoice.payerEmail=jbui-us-personal1%40paypal.com&invoice.itemList.item(0).name=product1&invoice.itemList.item(0).quantity=10.0&invoice.itemList.item(0).unitPrice=1.2&invoice.currencyCode=USD&invoice.paymentTerms=DueOnReceipt&",
				req.toNVPString());
	}
}
