package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;

public class DashboardTest extends BaseTest{
	
	@Test
	public void dashboardLoads() {
		
		DashboardPage dpage = new DashboardPage(driver);
		dpage.setViewOrder();
		dpage.setProfile();
		assertTrue(driver.getCurrentUrl().contains("dashboard"));

		}
	}


