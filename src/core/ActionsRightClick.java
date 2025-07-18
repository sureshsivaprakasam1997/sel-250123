package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightClick {

	public static void main(String[] args) throws InterruptedException {
		// locate driver
		System.setProperty("webdriver.chrome.driver", 
				"./driver/chromedriver.exe");
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//launch website
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//maximise
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//giving control to actions class
		Actions actions = new Actions(driver);

		//finding my element
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//clickandhold
		
		actions.
		contextClick(element).
		build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
