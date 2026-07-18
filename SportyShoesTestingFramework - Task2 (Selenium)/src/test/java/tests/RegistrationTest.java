package tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.RegistrationPage;
import utils.ConfigReader;

public class RegistrationTest extends BaseTest {
	@Test
	public void registrationTest() {
		
		RegistrationPage rpage = new RegistrationPage(driver);
		rpage.enterEmail(ConfigReader.getProperty("email"));
		rpage.enterPassword(ConfigReader.getProperty("password"));
		rpage.registerUser();
		assertTrue(driver.getTitle().contains("sign-up"));
	}

}
