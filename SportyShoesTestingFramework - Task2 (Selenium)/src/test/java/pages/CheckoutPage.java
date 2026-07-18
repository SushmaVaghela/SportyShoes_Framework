package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	WebDriver driver;
	
	@FindBy(css = "button[type='submit']")
	WebElement order;
	
	@FindBy(xpath = "//*[@id=\"checkout-page-container\"]/div/div[2]")
	WebElement orderSuccess;
	
	public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void placeOrder() {
		order.click();
	}
	
	public void verifyOrdersuccess() {
		orderSuccess.getText();
	}

}


