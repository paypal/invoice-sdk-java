package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.MarkInvoiceAsPaidRequest;
import com.paypal.svcs.types.pt.OtherPaymentDetailsType;
import com.paypal.svcs.types.pt.PaymentMethodsType;

public class MarkInvoiceAsPaidRequestTest {
	MarkInvoiceAsPaidRequest req;

	@BeforeClass
	public void beforeClass() {
		OtherPaymentDetailsType payment = new OtherPaymentDetailsType();
		payment.setDate("2011-06-22");

		payment.setMethod(PaymentMethodsType.PAYPAL);
		payment.setNote("Invoice");
		req = new MarkInvoiceAsPaidRequest(new RequestEnvelope("en_US"),
				"INV2-SASU-MTRT-DCDS-WJMY", payment);
	}

	@AfterClass
	public void afterClass() {
		req = null;
	}

	@Test
	public void toNVPString() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"requestEnvelope.errorLanguage=en_US&invoiceID=INV2-SASU-MTRT-DCDS-WJMY&payment.method=PayPal&payment.note=Invoice&payment.date=2011-06-22&",
				req.toNVPString());
	}
}
