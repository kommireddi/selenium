package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLoginPage;
import pages.LoginPage;
import wrappers.LinkedInWrappers;

public class TC001_LinkedIn extends LinkedInWrappers {
	@Test(dataProvider="fetchData")
	public void case01(String userName, String passWord, 
			String keyWord) {

		new LinkedInLoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickAdvanced()
		.enterKeywords(keyWord)
		.clickSubmit()
		.getCount()
		.getFirstConnection()
		.getActualConnection()
		.mouseOnPicture()
		.clickonLogout();
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="LinkedIn TestCase01 ";
		testDescription="Login search with keyword in advanced search and get the connection name and details";
	}
	

}
