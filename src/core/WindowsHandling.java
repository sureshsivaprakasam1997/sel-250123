package core;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = SetUp.setup();
				
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("Current window "+parent);
		
		Thread.sleep(2000);
		for(String res:windowHandles) {
			if(!parent.equals(res)) {
				WebDriver tempDriver = driver.switchTo().window(res);
				System.out.println(tempDriver.getTitle());
				tempDriver.close();
				Thread.sleep(2000);
			}
		}
		
		driver.switchTo().window(parent);
		
	
	}

}
