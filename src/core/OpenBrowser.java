package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// locate driver
		System.setProperty("webdriver.chrome.driver", 
				"./driver/chromedriver.exe");
		
		//open browser
		WebDriver driver=new ChromeDriver();
		
		//launch website
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//maximise
		driver.manage().window().maximize();
		
		//we can make wait our application
		Thread.sleep(3000);
		
		//WebElement element = driver.findElement(By.id("fname"));
//		WebElement element = driver.findElement(By.name("firstName"));
//		element.sendKeys("Suresh");//will enter
//		Thread.sleep(1000);
//		element.clear();
//		Thread.sleep(1000);
//		element.sendKeys("Abinaya");
//		
//		
//		Thread.sleep(2000);
//	//	System.out.println(element.getText());
//		System.out.println(driver.findElement(By.tagName("select")).getText());
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("This is a link")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.partialLinkText("This is")).click();
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
		//    //button[@id='idOfButton']  basic xpath
		//   //button[contains(@type,'bu')]      contains methhod
		//   //button[@id='idOfButton' or @type='butto']      and or 
		//   //button[starts-with(@id,'idOf')]            starts-with ends-with
		//   //p[text()='Link : ']                  to select text
		//    //p[text()='Link : ']//following::*     following
		//    //p[text()='Link : ']//preceding::div[5]    preceding
		//    //option[@id='manual']//parent::select   parent
		
		//    //select[@id='testingDropdown']//child::option[3]
						// or
		//    //select[@id='testingDropdown']/option[3]    child
		
		Thread.sleep(1000);
		//close the browser
		driver.close();
	}

}
