package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_MergeLeads";
		testDescription="MergeTwoLeads";
		testNodes="Leads";
		category="Sanity";
		authors="Sathish";
		browserName="chrome";
		dataSheetName="TC006";
	}
	@Test(dataProvider="fetchData")
	public void mergeTestLeads(String uName,String pwd,String firstID,String secondID) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadLookUp()
		.typeLeadId(firstID)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickToLeadLookUp()
		.typeLeadId(secondID)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickMergeButton()
		.clickFindLeads()
		.typeLeadId(firstID)
		.clickFindLeadsButton()
		.verifyNoRecords();
	}

}
