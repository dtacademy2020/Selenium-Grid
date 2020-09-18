package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestGrid {
	
	
	
	 @Test
	 public void ChromeTestDT() throws MalformedURLException {
		 
		 // Use DesiredCapabilities class to set the browser type, OS type and other related settings
		 
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setBrowserName("chrome");
		 cap.setPlatform(Platform.WINDOWS);
		 
		 ChromeOptions options = new ChromeOptions();
		 
		 options.merge(cap);
		 
		 String hubURL = "http://ec2-18-219-98-242.us-east-2.compute.amazonaws.com:4444/wd/hub";
		 
		 WebDriver driver  = new RemoteWebDriver(new URL(hubURL) , options);
		 
		 
		 driver.get("https://www.duotech.io/");
		 
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
		 
		 
		 
	 }
	 
	 
	 @Test
	 public void ChromeTestGoogle() throws MalformedURLException {
		 
		 // Use DesiredCapabilities class to set the browser type, OS type and other related settings
		 
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setBrowserName("chrome");
		 cap.setPlatform(Platform.WINDOWS);
		 
		 ChromeOptions options = new ChromeOptions();
		 
		 options.merge(cap);
		 
		 String hubURL = "http://ec2-18-219-98-242.us-east-2.compute.amazonaws.com:4444/wd/hub";
		 
		 WebDriver driver  = new RemoteWebDriver(new URL(hubURL) , options);
		 
		 
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("Vacation in Ibiza");
		 System.out.println(driver.getTitle());
		 driver.quit();

		 
		 
	 }
	 
	 
	 @Test
	 public void FirefoxTestGoogle() throws MalformedURLException {
		 
		 // Use DesiredCapabilities class to set the browser type, OS type and other related settings
		 
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setBrowserName("firefox");
		 cap.setPlatform(Platform.WINDOWS);
		 
		 FirefoxOptions options = new FirefoxOptions();
		 
		 options.merge(cap);
		 
		 String hubURL = "http://ec2-18-219-98-242.us-east-2.compute.amazonaws.com:4444/wd/hub";
		 
		 WebDriver driver  = new RemoteWebDriver(new URL(hubURL) , options);
		 
		 
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("Vacation in Tahiti");
		 System.out.println(driver.getTitle());
		 driver.quit();

		 
		 
	 }


}
