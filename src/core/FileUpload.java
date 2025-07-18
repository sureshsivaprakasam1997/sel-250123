package core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String loc="E:\\HP USB20FD\\MyDoc\\documents\\Course_Doc"
				+ "\\Batch\\Selenium\\Core Java\\Notes\\WeekDays\\3.Loops Notes.txt";
		WebDriver driver = SetUp.setup();
				
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		
		//using sendKeys
	  element.sendKeys(loc);
		
		//using robot class
		//element.click();
		
		StringSelection str=new StringSelection(loc);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		Robot keys=new  Robot();
		
		//entering textbox 
//		keys.keyPress(KeyEvent.VK_ENTER);
//		keys.keyRelease(KeyEvent.VK_ENTER);
		
		//paste file location
		keys.keyPress(KeyEvent.VK_CONTROL);
		keys.keyPress(KeyEvent.VK_V);
		
		keys.keyRelease(KeyEvent.VK_CONTROL);
		keys.keyRelease(KeyEvent.VK_V);
		
		//click open button
		keys.keyPress(KeyEvent.VK_ENTER);
		keys.keyRelease(KeyEvent.VK_ENTER);
		
	
	}

}
