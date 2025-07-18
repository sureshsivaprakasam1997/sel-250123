package core;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SpecialClasses {

	public static void main(String[] args) throws InterruptedException, IOException {
		// waits
		
		WebDriver driver = SetUp.setup();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
//	
//		org.openqa.selenium.Alert alert = driver.switchTo().alert();
//		
//		System.out.println(alert.getText());//get the alert text
//		
//		//alert.accept();//ok button
//		alert.dismiss();//cancel button
		
//		WebDriverWait wait=new WebDriverWait(driver,5);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']"))));
		
		//screesnhot
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src= shot.getScreenshotAs(OutputType.FILE);
		File des=new File("E:\\scan.png");
		FileHandler.copy(src, des);
		
		System.out.println("Screenshot has taken !");
		
		Thread.sleep(2000);
		
		//scroll
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		obj.executeScript("window.scroll(0,1500)", "");//scroll down
		
		Thread.sleep(2000);
		obj.executeScript("window.scroll(0,-50)", "");//scroll up
	}

}
