package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LinkedInWrappers;

import org.testng.annotations.BeforeClass;

public class TC003_Login extends LinkedInWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vErrorMess) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLoginForFailure()
		.verifyErrorMessage(vErrorMess);
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="Login to OpenTaps(Negative)";
		testDescription="Login(Failure) to Opentaps using POM";
	}

	
	
	
	
	
	
}
