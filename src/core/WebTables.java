package core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = SetUp.setup();
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		
		
		//to get the all columns size
		List<WebElement> eleColumns=	driver.findElements(By.xpath("//table[@role='grid']/tbody/tr[1]/td"));
		System.out.println("No of columns = "+eleColumns.size());
		
		//to get the all rows size
		List<WebElement> eleRows=	driver.findElements(By.xpath("//table[@role='grid']/tbody/tr"));
		System.out.println("No of rows = "+eleRows.size());
		
		//to get the names by given country
		String country="Italy";
		List<WebElement> countries=	driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td[2]"));
		
		for(int i=0;i<countries.size();i++) {
			if(country.equals(countries.get(i).getText())) {
				int position=i+1;
				System.out.println("The names of given country "+country+" = "+
						driver.findElement(By.xpath("//table[@role='grid']/tbody/tr["+position+"]/td[1]")).getText());
			}
		}
		
		//Thread.sleep(2000);
		driver.close();
	}

}
