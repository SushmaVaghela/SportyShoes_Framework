package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[4]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/a/div/div[4]/p")
	WebElement product;
	
	 @FindBy(css = ".chakra-button css-1tbdama")
	 WebElement cartBtn;
	 
	 public ProductPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	
	 public void viewProduct() {
		product.click();
		 
	 }
	 
	 public void addToCart() {
		 cartBtn.click();
	 }
	 
	 }
