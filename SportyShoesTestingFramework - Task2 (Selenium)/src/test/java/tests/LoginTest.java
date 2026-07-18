package tests;

import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void validLoginTest() {
		
		 
		LoginPage lpage = new LoginPage(driver);
		lpage.enterEmail(ConfigReader.getProperty("email"));
		lpage.enterPassword(ConfigReader.getProperty("password"));
		lpage.clicklogin();
		assertTrue(driver.getCurrentUrl().contains("login"));
	}

}
