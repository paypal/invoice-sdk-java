package test.pt;

import java.io.UnsupportedEncodingException;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.pt.GetInvoiceDetailsRequest;

public class GetInvoiceDetailsRequestTest {
	GetInvoiceDetailsRequest req;
  @BeforeClass
  public void beforeClass() {
	  req=new GetInvoiceDetailsRequest(new RequestEnvelope("en_US"), "INV2-SASU-MTRT-DCDS-WJMY");
	    
  }

  @AfterClass
  public void afterClass() {
	  req=null;
  }


  @Test
  public void toNVPString() throws UnsupportedEncodingException {
    Assert.assertEquals("requestEnvelope.errorLanguage=en_US&invoiceID=INV2-SASU-MTRT-DCDS-WJMY&", req.toNVPString());
  }
}
