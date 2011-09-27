package test.pt;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.pt.DateRangeType;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.SearchParametersType;
import com.paypal.svcs.types.pt.StatusType;

public class SearchParametersTypeTest {
	SearchParametersType parameters;
	DateRangeType date;

	@BeforeClass
	public void beforeClass() {
		parameters = new SearchParametersType();
		date = new DateRangeType();
		date.setEndDate("2021-06-30");
		List<StatusType> lst = new ArrayList<StatusType>();
		lst.add(StatusType.PAID);
		parameters.setBusinessName("ABC Company");
		parameters.setCreationDate(date);
		parameters.setDueDate(date);
		parameters.setEmail("abc@paypal.com");
		parameters.setInvoiceDate(date);
		parameters.setInvoiceNumber("xuan115");
		parameters.setLowerAmount(100.0);
		parameters.setMemo("Invoice");
		parameters.setOrigin(OriginType.API);
		parameters.setPaymentDate(date);
		parameters.setRecipientName("abc");
		parameters.setStatus(lst);
		parameters.setUpperAmount(1000.0);
	}

	@AfterClass
	public void afterClass() {
		parameters = null;
		date = null;
	}

	@Test
	public void toNVPString() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"email=abc%40paypal.com&recipientName=abc&businessName=ABC+Company&invoiceNumber=xuan115&status(0)=PAID&lowerAmount=100.0&upperAmount=1000.0&memo=Invoice&origin=API&invoiceDate.endDate=2021-06-30&dueDate.endDate=2021-06-30&paymentDate.endDate=2021-06-30&creationDate.endDate=2021-06-30&",
				parameters.toNVPString());
	}

	@Test
	public void toNVPStringString() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"parameters.email=abc%40paypal.com&parameters.recipientName=abc&parameters.businessName=ABC+Company&parameters.invoiceNumber=xuan115&parameters.status(0)=PAID&parameters.lowerAmount=100.0&parameters.upperAmount=1000.0&parameters.memo=Invoice&parameters.origin=API&parameters.invoiceDate.endDate=2021-06-30&parameters.dueDate.endDate=2021-06-30&parameters.paymentDate.endDate=2021-06-30&parameters.creationDate.endDate=2021-06-30&",
				parameters.toNVPString("parameters."));
	}
}
