package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleComName;
	
	@And("enter Company Name as (.*)")
	public CreateLead typeCompanyName(String data) {
		
		type(eleComName, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@And("enter the First Name as (.*)")
	public CreateLead typeFirstName(String data) {
		
		type(eleFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@And("enter the Last Name as (.*)")
	public CreateLead typeLastName(String data) {
		
		type(eleLastName, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhoneNum;
	
	@And("enter the phone number as (.*)")
	public CreateLead typePhoneNum(String data) {
		
		type(elePhoneNum, data);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLead;
	
	@When("click on Create Lead Button")
	public ViewLead clickCreateLeadButton() {
		
		click(eleCreateLead);
		return new ViewLead();		
	}

}
