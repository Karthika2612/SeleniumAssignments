package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPageActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement drpdwn1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select value1 = new Select(drpdwn1);
		value1.selectByIndex(3);
		
		WebElement drpdwn2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select value2 = new Select(drpdwn2);
		value2.selectByVisibleText("UFT/QTP");
		
		WebElement drpdwn3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select value3 = new Select(drpdwn3);
		value3.selectByValue("3");
		
		WebElement drpdwn4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select value4 = new Select(drpdwn4);
		List<WebElement> noOfOptions = value4.getOptions();
		System.out.println("the number of dropdown options: "+noOfOptions.size());
		
		WebElement drpdwn5 = driver.findElement(By.xpath("//option[contains(text(),'sendKeys to select')]/parent::select"));
		drpdwn5.click();
		drpdwn5.sendKeys("UFT");
		//drpdwn5.sendKeys(Keys.ENTER);

		WebElement drpdwn6 = driver.findElement(By.xpath("//option[contains(text(),'Select your programs')]/parent::select"));
		Select value6 = new Select(drpdwn6);
		value6.selectByVisibleText("Selenium");
		value6.selectByVisibleText("Appium");
	}

}
