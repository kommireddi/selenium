package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInJobViewPage extends LinkedInWrappers {

	public LinkedInJobViewPage() {
		
	}

	public LinkedInJobViewPage getCompany() {
		String companyName = getTextByClassName(prop.getProperty("JobView.CompanyName.ClassName"));
		System.out.println("The Company name is :" + companyName);
		return this;

	}
	
	
	public LinkedInCompanyPage clickCompany() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByXpath(prop.getProperty("JobView.CompanyName.Xpath"));
		return new LinkedInCompanyPage();
	}
	
	

}
