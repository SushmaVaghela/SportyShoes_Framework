package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.ProfilePage;

public class ProfileTest extends BaseTest {
	
	@Test
	public void updateProfileTest() {
	ProfilePage pfpage = new ProfilePage(driver);
	pfpage.updateProfile();
	assertTrue(driver.getCurrentUrl().contains("update"));
	
	
	}

}
