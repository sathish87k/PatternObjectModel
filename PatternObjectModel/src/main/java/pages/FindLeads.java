package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	
	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement eleFirstName;
	
	@And("enter the First Name to search for as (.*)")
	public FindLeads typeFirstName(String data) {
		
		type(eleFirstName, data);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input")
	private WebElement eleLeadId;
	
	@And("enter the Lead id to search for as (.*)")
	public FindLeads typeLeadId(String data) {
		
		type(eleLeadId, data);
		return this;		
	}
	
	@And("enter the id of the deleted Lead")
	public FindLeads typeCapturedLeadId() {
		
		type(eleLeadId, firstLeadId);
		return this;		
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	
	@And("click on Find Lead Button")
	public FindLeads clickFindLeadsButton() {
		
		click(eleFindLeads);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstResult;
	
	@And("click on First resulting record")
	public ViewLead clickFirstResult() {
		firstLeadId = getText(eleFirstResult);
		click(eleFirstResult);
		return new ViewLead();		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhoneTab;
	
	@And("click on Phone tab")
	public FindLeads clickPhoneTab() {
		
		click(elePhoneTab);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elePhoneNum;
	
	@And("enter the Phone number to search for as (.*)")
	public FindLeads typePhoneNum(String data) {
		
		type(elePhoneNum, data);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="x-paging-info")
	private WebElement eleRecordCount;
	
	@And("Verify that the Lead ID is not available")
	public FindLeads verifyNoRecords() {
		
		verifyExactText(eleRecordCount, "No records to display");
		return this;		
	}
	
	public FindLeads verifyRecordPresent() {
		
		verifyPartialText(eleRecordCount, "Displaying records");
		return this;		
	}

}
