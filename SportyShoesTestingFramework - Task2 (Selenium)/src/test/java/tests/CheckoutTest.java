package tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.CheckoutPage;

public class CheckoutTest extends BaseTest{
	
	@Test
	public void checkoutFlow() {
		
		CheckoutPage checkpage = new CheckoutPage(driver);
		checkpage.placeOrder();
		checkpage.verifyOrdersuccess();
		assertTrue(driver.getCurrentUrl().contains("checkout"));
	}

}
