package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{
	
	public MergeLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//img[@alt='Lookup']")
	private WebElement eleFromLeadLookUp;
	
	@And("click on From Lead lookup")
	public MergeLeadsLookUp clickFromLeadLookUp() {
		
		click(eleFromLeadLookUp);
		switchToWindow(1);
		return new MergeLeadsLookUp();		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleToLeadLookUp;
	
	@And("click on To Lead lookup")
	public MergeLeadsLookUp clickToLeadLookUp() {
		
		click(eleToLeadLookUp);
		switchToWindow(1);
		return new MergeLeadsLookUp();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeButton;
	
	@And("click on Merge Button and accept the Alert message")
	public ViewLead clickMergeButton() {
		
		clickWithNoSnap(eleMergeButton);
		acceptAlert();
		return new ViewLead();		
	}

}
