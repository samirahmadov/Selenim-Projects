package suitecrm;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import suitecrmpages.SuitCRMloginPage;
import suitecrmpages.SuiteCRMCreateTaskPage;
import suitecrmpages.SuiteCRMtaskOverviewPage;
import suitecrmpages.SuiteCrmHomepage;
import static utilities.ConfigReader. *; //added static and "*" here to keep avay 
										// to write Configreader each time on tist files before getProperty.

public class SuiteCRMtest extends TestBase {
	
	SuitCRMloginPage loginPage;
	SuiteCrmHomepage homepage;
	SuiteCRMCreateTaskPage createTaskpage;
	SuiteCRMtaskOverviewPage taskOverviewpage;
	
	@BeforeMethod
	public void navigate() {
		driver.get(getProperty("suitecrm.url"));
		loginPage = new SuitCRMloginPage(driver);
		homepage = new SuiteCrmHomepage(driver);
		createTaskpage = new SuiteCRMCreateTaskPage(driver);
		taskOverviewpage = new SuiteCRMtaskOverviewPage(driver);
	}
	
	@Test
	public void createTaskInSuiteCRM() {
		loginPage.login(getProperty("suitecrm.username"), getProperty("suitecrm.password"));
		homepage.createNewItem("Create Task");
		
	}
	
}
