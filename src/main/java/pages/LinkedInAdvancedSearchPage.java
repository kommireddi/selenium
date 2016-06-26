package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInAdvancedSearchPage extends LinkedInWrappers {

	public LinkedInAdvancedSearchPage() {
		if (!verifyTitle("Search | LinkedIn"))
			Reporter.reportStep("This is not Search Page", "FAIL");
	}

	public LinkedInAdvancedSearchPage enterKeywords(String data) {
		enterById(prop.getProperty("Advanced.KeyWord.Id"), data);
		return this;
	}

	public LinkedInAdvancedSearchPage clickSubmit() {
		clickByClassName(prop.getProperty("Advanced.SearchButton.ClassName"));
		return this;
	}

	public LinkedInAdvancedSearchPage getCount() {
		String count = getTextByXpath(prop.getProperty("Advanced.ResultCount1.Xpath")).replace(",", "");
		System.out.println("The search count is :" + count);
		return this;
	}

	public LinkedInAdvancedSearchPage getFirstConnection() {
		String name = getTextByXpath(prop.getProperty("Advanced.Name.Xpath"));
		System.out.println("The First connection in the search result : " + name);
		return this;
	}

	public LinkedInAdvancedSearchPage getActualConnection() {
		String actualConnection = getTextByXpath(prop.getProperty("Advanced.Connection.Xpath"));
		String connectionOne = "1st";
		String ConnectionTwo = "2nd";
		if (actualConnection.contentEquals(connectionOne)) {
			System.out.println("The Connection is 1st connection");
		} else if (actualConnection.contentEquals(ConnectionTwo)) {
			System.out.println("The Connection is 2nd connection");
		}
		return this;
	}

	public LinkedInAdvancedSearchPage closeFrame() {
		clickByXpath(prop.getProperty("Advanced.Closed.Xpath"));
		return this;
	}

	public LinkedInAdvancedSearchPage closeconnection() {
		clickByXpath(prop.getProperty("Advanced.CloseConnection.Xpath"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public LinkedInAdvancedSearchPage getconnectionCount() throws InterruptedException {
		String count = getTextByXpath(prop.getProperty("Advanced.ResultCount1.Xpath"));
		System.out.println("The total Number of Connections :" + count);
		return this;
	}

	public LinkedInAdvancedSearchPage mouseOnPicture() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mouseOver(prop.getProperty("Advanced.LogoutImage.Xpath"));
		return this;
	}
	
	   public LinkedInSignOutPage clickonLogout() {
		mouseOverAndClick(prop.getProperty("Advanced.Logout.Xpath"));
		return new LinkedInSignOutPage();
	}

}
