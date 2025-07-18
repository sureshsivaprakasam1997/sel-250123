package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = SetUp.setup();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
		
		Thread.sleep(3000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());//get the alert text
		
		//alert.accept();//ok button
		alert.dismiss();//cancel button
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
