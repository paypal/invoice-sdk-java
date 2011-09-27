package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.SearchInvoicesRequest;
import com.paypal.svcs.types.pt.SearchParametersType;

public class SearchInvoicesRequestTest {
	SearchInvoicesRequest req;
	SearchParametersType parameters;

	@BeforeClass
	public void beforeClass() {
		parameters = new SearchParametersType();
		req = new SearchInvoicesRequest(new RequestEnvelope("en_US"),
				"jb-us-seller1@paypal.com", parameters, 1, 1);
	}

	@AfterClass
	public void afterClass() {
		parameters = null;
		req = null;
	}

	@Test
	public void toNVPString() throws UnsupportedEncodingException {
		Assert.assertEquals(
				"requestEnvelope.errorLanguage=en_US&merchantEmail=jb-us-seller1%40paypal.com&page=1&pageSize=1&",
				req.toNVPString());
	}
}
