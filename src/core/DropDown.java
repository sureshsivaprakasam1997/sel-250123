package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = SetUp.setup();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		WebElement ele=	driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		
		Select dd=new Select(ele);
		
		Thread.sleep(4000);
		
		//dd.selectByIndex(2);//by using index
		//dd.selectByValue("Performance");//by using value attribute
		dd.selectByVisibleText("Database Testing");//by using text
		
		Thread.sleep(2000);
		driver.close();
	}

}
