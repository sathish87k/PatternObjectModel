package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.*;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleComName;
	
	@And("change the company name to (.*)")
	public EditLead editCompanyName(String data) {
		
		eleComName.clear();
		type(eleComName, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleFirstName;
	
	public EditLead editFirstName(String data) {
		eleFirstName.clear();
		type(eleFirstName, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_lastName")
	private WebElement eleLastName;
	
	public EditLead editLastName(String data) {
		eleLastName.clear();
		type(eleLastName, data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleUpdateLead;
	
	@And("click on update button")
	public ViewLead clickUpdateLeadButton() {
		
		click(eleUpdateLead);
		return new ViewLead();		
	}

}
