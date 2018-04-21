package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class MergeLeadsLookUp extends ProjectMethods{
	
	public MergeLeadsLookUp() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/..//input")
	private WebElement eleLeadId;
	
	@And("enter the Lead ID in the Lead lookup as (.*)")
	public MergeLeadsLookUp typeLeadId(String data) {
		
		type(eleLeadId,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	
	@And("click on Find Button in the Lookup")
	public MergeLeadsLookUp clickFindLeadsButton() {
		
		click(eleFindLeadsButton);;
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstResult;
	
	@And("click on First record in the Lookup result")
	public MergeLeads clickFirstResult() throws InterruptedException {
		
		Thread.sleep(2000);
		clickWithNoSnap(eleFirstResult);
		switchToWindow(0);
		return new MergeLeads();		
	}

}
