package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPageActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();

		WebElement btnHome = driver.findElement(By.xpath("//button[text()='Go to Home Page']"));

		btnHome.click();
		
		driver.findElementByXPath("//img[@src='images/button.png']").click();
		Thread.sleep(1000);
		
		WebElement btnPosition = driver.findElement(By.xpath("//button[text()='Get Position']"));
		WebElement btnColor = driver.findElement(By.xpath("//button[text()='What color am I?']"));
		WebElement btnSize = driver.findElement(By.xpath("//button[text()='What is my size?']"));
		
		System.out.println("X:" + btnPosition.getLocation().getX());
		System.out.println("Y:" + btnPosition.getLocation().getY());
		System.out.println(btnColor.getAttribute("style"));
		System.out.println(btnSize.getSize());

	}

}
