package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewLead;
import wdMethods.ProjectMethods;

public class TC007_DuplicateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC007_DuplicateLead";
		testDescription="Create a Duplicate Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Sathish";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void duplicateTestLead(String uName,String pwd,String cName,String fName) {
		
		ViewLead vLead = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.typeFirstName(fName)
		.clickFindLeadsButton()
		.clickFirstResult()
		.verifyViewLeadTitle()
		.clickDuplicateLead()
		.updateCompanyName(cName)
		.clickCreateLeadButton();
		
		String leadId = vLead.getLeadId();
		
		vLead.verifyComName(cName)
		.clickFindLeads()
		.typeLeadId(leadId)
		.clickFindLeadsButton()
		.verifyRecordPresent();
	}

}
