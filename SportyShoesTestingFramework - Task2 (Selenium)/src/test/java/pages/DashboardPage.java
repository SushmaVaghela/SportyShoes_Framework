package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div/div[1]/div[2]/form/div/button/span")
	WebElement viewOrder;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div/div[2]/div[1]/div[2]/div/div/form/div/div/div/div[2]/button/span/p")
	WebElement editProfile;
	
	
	public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void setViewOrder() {
		viewOrder.click();
	}
	
	public void setProfile() {
		editProfile.click();
	}
	
	

}
