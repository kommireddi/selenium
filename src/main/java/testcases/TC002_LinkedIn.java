package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LinkedInLoginPage;
import wrappers.LinkedInWrappers;

public class TC002_LinkedIn extends LinkedInWrappers {
	@Test(dataProvider="fetchData")
	public void case02 (String userName, String passWord){
		try {
			new LinkedInLoginPage()
			.enterUserName(userName)
			.enterPassword(passWord)
			.clickLogin()
			.clickAdvanced()
			.closeFrame()
			.closeconnection()
			.closeconnection()
			.getconnectionCount();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
 }
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="LinkedIn TestCase02";
		testDescription="Login close the 2and and group connections and get the count";
	}
	
	
}
