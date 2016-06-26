package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInCompanyPage extends LinkedInWrappers {

	public LinkedInCompanyPage() {
		
	}

	public LinkedInCompanyPage CompanyStength() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String employeeCount =getTextByClassName(prop.getProperty("Company.Employees.ClassName"));
		System.out.println("The Number of Employees in the Company are :"+ employeeCount);
		return this;
	}

	
	

}
