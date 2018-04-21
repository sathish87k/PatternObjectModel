package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	
	@And("click on Create Leads")
	public CreateLead clickCreateLead() {
		
		click(eleCreateLead);
		return new CreateLead();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	
	@And("click on Find Leads")
	public FindLeads clickFindLeads() {
		
		click(eleFindLeads);
		return new FindLeads();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeads;
	
	@And("click on Merge Leads")
	public MergeLeads clickMergeLeads() {
		
		click(eleMergeLeads);
		return new MergeLeads();		
	}

}
