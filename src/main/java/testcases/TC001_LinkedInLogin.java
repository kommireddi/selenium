/* Testcase*/
package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLoginPage;
import pages.LoginPage;
import wrappers.LinkedInWrappers;

public class TC001_LinkedInLogin extends LinkedInWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser) {

		new LinkedInLoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser);
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="Login to LinkedIN";
		testDescription="Login in LinkedIN using POM framework";
	}
}
