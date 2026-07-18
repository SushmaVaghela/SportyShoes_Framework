package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	
	@FindBy(css = ".chakra-button css-1tbdama")
	WebElement add;
	
	@FindBy(css = "div[data-testid='remove-item']")
	WebElement remove;
	
	 @FindBy(xpath = "//*[@id=\"__next\"]/div[3]/main/div[2]/div[1]/div/div[2]/div[1]/div[3]/button/span[2]")
	 WebElement checkoutBtn;
	 
	 public CartPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	public void addItem() {
		add.click();
	}
	
	public void removeItem() {
		remove.click();
	}
	
	public void checkout() {
		checkoutBtn.click();
		
	}

}
