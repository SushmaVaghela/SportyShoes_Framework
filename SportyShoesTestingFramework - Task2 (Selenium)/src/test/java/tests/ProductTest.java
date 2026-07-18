package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.ProductPage;
import static org.testng.Assert.*;

public class ProductTest extends BaseTest {
	
	@Test
	public void addProductTest() {
		 
		ProductPage prpage = new ProductPage(driver);
		prpage.viewProduct();
		prpage.addToCart();
		
		assertTrue(driver.getCurrentUrl().contains("products"));
	}

}
