package test.common;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.common.ResponseEnvelope;

public class ResponseEnvelopeTest {

	Map<String, String> map = new HashMap<String, String>();
	ResponseEnvelope resp;

	@BeforeClass
	public void beforeClass() {
		map.put("responseEnvelope.ack", "Success");
		map.put("responseEnvelope.timestamp",
				"2011-05-29T23%3A58%3A46.879-07%3A00");
		map.put("responseEnvelope.correlationId", "2eba4859262a9");
		map.put("responseEnvelope.build", "1917403");
		resp = ResponseEnvelope.createInstance(map, "responseEnvelope", -1);
	}

	@Test
	public void responseEnvTest() {
		Assert.assertEquals(resp.getTimestamp(),
				"2011-05-29T23%3A58%3A46.879-07%3A00");
		Assert.assertEquals(resp.getAck(), AckCode.SUCCESS);
		Assert.assertEquals(resp.getBuild(), "1917403");
		Assert.assertEquals(resp.getCorrelationId(), "2eba4859262a9");
	}

	@AfterClass
	public void afterClass() {
		resp = null;
	}

}
