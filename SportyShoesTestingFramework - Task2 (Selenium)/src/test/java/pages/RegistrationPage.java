package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	 
	@FindBy(xpath = "//*[@id=\"menu-list-:R2lpl6cl9ltmH1:-menuitem-:r1:\"]/a")
	WebElement register;
	 
	 public RegistrationPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 public void enterEmail(String emailId) {
		 email.sendKeys(emailId);
	 }
	 
	 public void enterPassword(String pass) {
		 password.sendKeys(pass);
	 }
	 
	 public void registerUser() {
		 register.click();
	 }

}
