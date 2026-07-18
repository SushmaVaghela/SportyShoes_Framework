package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;

public class CartTest extends BaseTest{
	
	@Test
	public void cartTest() {
		
		CartPage cpage = new CartPage(driver);
		cpage.addItem();
		cpage.removeItem();
		cpage.checkout();
		assertTrue(driver.getCurrentUrl().contains("cart"));
	}
	
	

}
