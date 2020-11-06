package week4.assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitAppearanceUsingThread {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		List<WebElement> buttonsList = driver.findElements(By.xpath("//div[@class='flex']/button"));
		List<String> text = new ArrayList<String>();
		for (WebElement eachButton : buttonsList) {
			text.add(eachButton.getText());
		}
		for (String eachWord : text) {
			
			System.out.print(eachWord+" | ");
			
		}
	}

}
