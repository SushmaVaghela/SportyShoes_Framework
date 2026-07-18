package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	 @FindBy(id = "email")
	 WebElement email;
	 
	 @FindBy(name = "password")
	 WebElement password;
	 
	 @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[2]/div[1]/div[2]/div/div/form/div/div[3]/button[1]/span")
	 WebElement loginBtn;
	 
	 public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 public void enterEmail(String emailID) {
		 email.sendKeys(emailID);
	 }
	 
	 public void enterPassword(String Password) {
		 password.sendKeys(Password);
	 }
	 
	 public void clicklogin() {
		loginBtn.click();
	 }
	 	

}
