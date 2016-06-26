package pages;

import utils.Reporter;
import wrappers.LinkedInWrappers;

public class LinkedInProfilePage extends LinkedInWrappers {

	public LinkedInProfilePage() {

		if (!verifyTitle("Edit Profile | LinkedIn"))
			Reporter.reportStep("This is not Profile Page", "FAIL");
	}

	public LinkedInProfilePage getCurrentOrg() {
		String company = getTextByXpath(prop.getProperty("Profile.Organization.Xpath"));
		System.out.println("The Current Organization is :"+ company);
		return this;

	}
	
	public LinkedInProfilePage verifyAndAddNewSkill(String data) {
		boolean flag = false;
		flag = verifyTextContainsByXpath(prop.getProperty("Profile.Skill.Xpath"),data);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (flag == false) {
        clickByXpath(prop.getProperty("Profile.AddSkillButton.Xpath"));
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        enterById(prop.getProperty("Profile.AddText.Id"), data);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        clickById(prop.getProperty("Profile.AddButton.Id"));
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        clickByXpath(prop.getProperty("Profile.SaveButton.Xpath"));
	}else {
		System.out.println("The skill is already added");
	}
		return this;
	}
	
	
}
