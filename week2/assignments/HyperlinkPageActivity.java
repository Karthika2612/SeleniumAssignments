package week2.assignments;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkPageActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html#");
		driver.manage().window().maximize();
		
		WebElement lnkHome = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]"));
		lnkHome.click();
		driver.findElementByXPath("//img[@src='images/link.png']").click();
		Thread.sleep(1000);
		WebElement lnkFind = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"));
		System.out.println("This link supposed to go to: "+lnkFind.getAttribute("href"));
		
		WebElement lnkBroken = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
		lnkBroken.click();
		if ((driver.getTitle()).contains("404 – Not Found")){
			System.out.println("It is a broken link");
		}
		driver.navigate().back();
		
		WebElement lnkHome2 = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]"));
		lnkHome2.click();
		driver.findElementByXPath("//img[@src='images/link.png']").click();
		Thread.sleep(1000);
		
		List<WebElement> countOfLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total links available in this page: "+countOfLinks.size());
		
	}

}
