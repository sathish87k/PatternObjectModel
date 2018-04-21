package steps;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	public static ChromeDriver driver;
	@Before
	public void before(Scenario sc) {
		startResult();
		startTestModule(sc.getId(), sc.getName());
		test = startTestCase("leads");
		test.assignCategory("smoke");
		test.assignAuthor("Sathish");
		startApp("chrome");
	}
	
	@After
	public void after() {
		endResult();
		closeAllBrowsers();
	}
	
}
