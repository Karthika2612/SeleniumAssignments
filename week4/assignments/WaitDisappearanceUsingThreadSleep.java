package week4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDisappearanceUsingThreadSleep {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		String text = driver.findElement(By.xpath("//strong")).getText();
		
		if(text.equalsIgnoreCase("I know you can do it! Button is disappeared!")) {
			System.out.println("Verified");
		}else
			System.out.println("Not found");
		
	}

}
