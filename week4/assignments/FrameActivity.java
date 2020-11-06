package week4.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.html']")));
		WebElement btnClick1 = driver.findElement(By.xpath("//button[text()='Click Me']"));

		btnClick1.click();
		System.out.println(btnClick1.getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='page.html']")));
		driver.switchTo().frame(0);

		WebElement btnClick2 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		btnClick2.click();
		System.out.println(btnClick2.getText());

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@src='countframes.html']"));

		List<WebElement> listOfFrams = driver.findElements(By.xpath("//iframe"));
		System.out.println("Total no. of frames in this window: " + listOfFrams.size());

		/*
		 * int size = driver.findElements(By.tagName("iframe")).size();
		 * System.out.println(size);
		 */

	}

}
