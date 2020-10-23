package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginACME {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement email = driver.findElementByXPath("//input[@name='email']");
		WebElement password = driver.findElementByXPath("//input[@name='password']");
		WebElement login = driver.findElementByXPath("//button[@type='submit']");
		email.sendKeys("kumar.testleaf@gmail.com");
		password.sendKeys("leaf@12");
		login.click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement logout = driver.findElementByLinkText("Log Out");
		logout.click();
		Thread.sleep(3000);
		driver.close();

	}

}
