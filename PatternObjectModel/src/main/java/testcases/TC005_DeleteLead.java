package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete an existing Lead";
		testNodes="Leads";
		category="Sanity";
		authors="Sathish";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void deleteTestLead(String uName,String pwd,String pNum) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.typePhoneNum(pNum)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickDeleteButton()
		.clickFindLeads()
		.typeCapturedLeadId()
		.clickFindLeadsButton()
		.verifyNoRecords();
	}

}
