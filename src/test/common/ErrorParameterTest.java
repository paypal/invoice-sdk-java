package test.common;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.ErrorParameter;

public class ErrorParameterTest {

	ErrorParameter errParam;
	Map<String, String> map = new HashMap<String, String>();

	@Test
	public void errorParamTest() {
		Assert.assertEquals(errParam.getValue(), "UserName");
	}

	@BeforeClass
	public void beforeClass() {
		map.put("parameter.value", "UserName");
		errParam = new ErrorParameter(map, "parameter.");
	}

	@AfterClass
	public void afterClass() {
		errParam = null;
	}

}
