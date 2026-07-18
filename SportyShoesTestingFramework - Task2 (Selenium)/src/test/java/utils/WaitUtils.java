package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	
	 WebDriver driver;
	 WebDriverWait wait;

	public WaitUtils(WebDriver driver) {

	    this.driver = driver;

	    int timeout = Integer.parseInt(
	            ConfigReader.getProperty("explicitWait"));

	    this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	}
	
	
}


