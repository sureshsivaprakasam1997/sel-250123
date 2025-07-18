package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetUp {
	static WebDriver driver;
	public static WebDriver setup() throws InterruptedException {
		// locate driver
		System.setProperty("webdriver.chrome.driver", 
						"./driver/chromedriver.exe");
				
		//new open browser
		 driver=new ChromeDriver();
				
		//maximise
		driver.manage().window().maximize();
				
		Thread.sleep(2000);
				
		return driver;
	}
	
	public static WebDriver getDriver(ChromeOptions options,WebDriver driver) {
		driver=new ChromeDriver(options);
		return driver;
	}
	
}
