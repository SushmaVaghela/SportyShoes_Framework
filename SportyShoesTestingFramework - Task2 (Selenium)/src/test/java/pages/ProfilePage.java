package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"menu-list-:Rhlpl6cl9ltmH1:\"]/div/div/button")
	WebElement update;
	
	 public ProfilePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 public void updateProfile() {
		 update.click();
	 }

}
