package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;


public class HomePageTest extends BaseTest{
	
	@Test
	public void homepageTest() {
		
		HomePage page = new HomePage(driver);
		page.acceptCookies();
		page.clicklogin();
		
	}
	
	
}