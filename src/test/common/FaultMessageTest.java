package test.common;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.common.FaultMessage;

public class FaultMessageTest {

	FaultMessage faultMsg;
	Map<String, String> map = new HashMap<String, String>();

	@Test
	public void faultMsgTest() {
		Assert.assertEquals(faultMsg.getResponseEnvelope().getTimestamp(),
				"2011-05-29T23%3A58%3A46.879-07%3A00");
		Assert.assertEquals(faultMsg.getResponseEnvelope().getAck(),
				AckCode.SUCCESS);
		Assert.assertEquals(faultMsg.getResponseEnvelope().getBuild(),
				"1917403");
		Assert.assertEquals(faultMsg.getResponseEnvelope().getCorrelationId(),
				"2eba4859262a9");
		Assert.assertEquals(faultMsg.getError().size(), 2);

	}

	@BeforeClass
	public void beforeClass() {
		map.put("responseEnvelope.ack", "Success");
		map.put("responseEnvelope.timestamp",
				"2011-05-29T23%3A58%3A46.879-07%3A00");
		map.put("responseEnvelope.correlationId", "2eba4859262a9");
		map.put("responseEnvelope.build", "1917403");
		map.put("error(0).errorId", "520003");
		map.put("error(0).domain", "Platform");
		map.put("error(0).subdomain", "Application");
		map.put("error(0).severity", "Error");
		map.put("error(0).category", "Application");
		map.put("error(0).message",
				"Authentication+failed.+API+credentials+are+incorrect");
		map.put("error(0).exceptionId", "520003");
		map.put("error(1).errorId", "580022");
		map.put("error(1).domain", "PLATFORM");
		map.put("error(1).subdomain", "Application");
		map.put("error(1).severity", "Error");
		map.put("error(1).category", "Application");
		map.put("error(1).message",
				"Invalid+request+parameter%3A+shippingTaxName+cannot+be+null");
		map.put("error(1).parameter(0)", "shippingTaxName");
		map.put("error(1).parameter(1)", "null");
		faultMsg = FaultMessage.createInstance(map, "", -1);
	}

	@AfterClass
	public void afterClass() {
		faultMsg = null;
	}

}
