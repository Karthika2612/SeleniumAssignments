package week4.assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTextChangeUsingThread {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Click ME!']")).click();
		
		Alert alt = driver.switchTo().alert();
		if ((alt.getText()).equalsIgnoreCase("Click ME!")) {
			System.out.println("Alert Generated & Text verified");
			alt.accept();
		}
		
	}

}
