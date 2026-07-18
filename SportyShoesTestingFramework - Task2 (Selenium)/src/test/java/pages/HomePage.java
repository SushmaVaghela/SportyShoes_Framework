package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//*[@id=\"09d30c99-fac3-4d69-a609-279dce374e8d\"]/div[2]/button[1]")
	WebElement cookies;
	
	@FindBy(xpath = "//*[@id=\"0575f2b5-b360-4bdd-9f43-599af5c20f98\"]/div[1]")
	WebElement login;
	
	public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void acceptCookies() {
		cookies.click();
	}
	
	public void clicklogin() {
		login.click();
	}

}
