package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutSPnWDManager {

	public static void main(String[] args) {

		// No need to use system.setproperty and WebDriver Manager to launch the browser from Selenium 4.6.0 onwards 
		
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();   //To execute this browser must be installed
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//System.out.println(SeleniumManager.getInstance());
		driver.quit();
		System.out.println("Success");
		
		
	}

}
