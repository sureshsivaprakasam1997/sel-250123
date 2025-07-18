package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// locate driver
		System.setProperty("webdriver.chrome.driver", 
				"./driver/chromedriver.exe");
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//launch website
		driver.get("https://www.leafground.com/drag.xhtml");
		
		//maximise
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//giving control to actions class
		Actions actions = new Actions(driver);

		//finding my element
		WebElement from = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		
		WebElement to = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		
		//clickandhold
		
		actions.
		dragAndDrop(from, to).
		build().perform();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
