package core;

import java.awt.AWTException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", map);
		
		WebDriver driver = SetUp.setup();
		driver=SetUp.getDriver(options,driver);
				
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=92.0.4515.43/");
		
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//a[text()='chromedriver_win32.zip']")).click();
		
	
	}

}
