package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{
	
	public DuplicateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleComName;
	
	@And("change the company name for the duplicate lead to (.*)")
	public DuplicateLead updateCompanyName(String data) {
		
		eleComName.clear();
		type(eleComName, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public DuplicateLead updateFirstName(String data) {
		
		eleFirstName.clear();
		type(eleFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public DuplicateLead updateLastName(String data) {
		
		eleLastName.clear();
		type(eleLastName, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNum;
	
	public DuplicateLead updatePhoneNum(String data) {
		
		elePhoneNum.clear();
		type(elePhoneNum, data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLead;
	
	@And("click on the create lead button in Duplicate lead page")
	public ViewLead clickCreateLeadButton() {
		
		click(eleCreateLead);
		return new ViewLead();		
	}

}
