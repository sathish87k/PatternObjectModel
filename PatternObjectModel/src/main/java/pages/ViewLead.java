package pages;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	
	@Then("Verify Lead is successfully created for (.*)")
	public ViewLead verifyFirstName(String data) {
		
		verifyExactText(eleFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditButton;
	
	@And("click on Edit Button")
	public EditLead clickEditButton() {
		
		click(eleEditButton);
		return new EditLead();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDeleteButton;
	
	@And("click on Delete Button")
	public MyLeads clickDeleteButton() {
		
		click(eleDeleteButton);
		return new MyLeads();		
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleComName;
	
	@Then("Verify Lead company name is (.*)")
	public ViewLead verifyComName(String data) {
		
		verifyPartialText(eleComName, data);
		return this;		
	}
	
	public String getLeadId() {
		
		String companyName = getText(eleComName);
		String id ="";
		char comName[] = companyName.toCharArray();
		for(int i=0;i<companyName.length();i++) {
			if(comName[i]=='(') {
				int j=i+1;
				while(comName[j]!=')') {
					id = id+comName[j];
					j++;
				}
			}
		}
		
		return id;		
	}
	
	@And("Verify Lead Id is not the id selected to be duplicated")
	public ViewLead duplicateLeadId() {
		
		try {
			if(getText(eleComName).contains(firstLeadId)) {
				reportStep("The new duplicate Lead ID is same as the original ID"+firstLeadId,"FAIL");
			}else {
				reportStep("The new duplicate Lead ID is different from the original ID"+firstLeadId,"PASS");
			}
		} catch (WebDriverException e) {
			reportStep("Unknown exception occured while verifying the Text", "FAIL");
		} 
	
		return this;		
	}
	
	public ViewLead verifyViewLeadTitle() {
		
		verifyTitle("View Lead | opentaps CRM");
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	
	public FindLeads clickFindLeads() {
		
		click(eleFindLeads);
		return new FindLeads();		
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLead;
	
	@When("click on Duplicate Lead Button")
	public DuplicateLead clickDuplicateLead() {
		
		click(eleDuplicateLead);
		return new DuplicateLead();
	}
	

}
