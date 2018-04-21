package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit an existing Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Sathish";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void editTestLead(String uName,String pwd,String cName,String fName) {
		
		new LoginPage()
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
		.clickEditButton()
		.editCompanyName(cName)
		.clickUpdateLeadButton()
		.verifyComName(cName);
	}

}
