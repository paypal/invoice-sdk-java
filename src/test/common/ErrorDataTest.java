package test.common;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import com.paypal.svcs.types.common.ErrorCategory;
import com.paypal.svcs.types.common.ErrorData;
import com.paypal.svcs.types.common.ErrorSeverity;

public class ErrorDataTest {

	ErrorData errData;
	Map<String, String> map = new HashMap<String, String>();

	@Test
	public void errorDataTest() {
		Assert.assertEquals(errData.getDomain(), "Platform");
		Assert.assertEquals(errData.getParameter().size(), 2);
		Assert.assertEquals(errData.getExceptionId(), "520003");
		Assert.assertEquals(errData.getErrorId(), Integer.valueOf("520003"));
		Assert.assertEquals(errData.getSubdomain(), "Application");
		Assert.assertEquals(errData.getCategory(), ErrorCategory.APPLICATION);
		Assert.assertEquals(errData.getSeverity(), ErrorSeverity.ERROR);
		Assert.assertEquals(errData.getMessage(),
				"Authentication+failed.+API+credentials+are+incorrect");
	}

	@BeforeClass
	public void beforeClass() {
		map.put("error.errorId", "520003");
		map.put("error.domain", "Platform");
		map.put("error.subdomain", "Application");
		map.put("error.severity", "Error");
		map.put("error.category", "Application");
		map.put("error.message",
				"Authentication+failed.+API+credentials+are+incorrect");
		map.put("error.exceptionId", "520003");
		map.put("error.parameter(0).name", "API Credentials");
		map.put("error.parameter(1).name", "Incorrect");
//		errData = new ErrorData(map, "error.");
		errData = ErrorData.createInstance(map, "error", -1);
	}

	@AfterClass
	public void afterClass() {
		errData = null;
	}

}
