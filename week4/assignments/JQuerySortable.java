package week4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuerySortable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement firstItem = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement fourthItem = driver.findElement(By.xpath("//li[text()='Item 4']"));
		int x = fourthItem.getLocation().getX();
		int y = fourthItem.getLocation().getY();
		Actions act = new Actions(driver);
		act.dragAndDropBy(firstItem, x, y).build().perform();
		Thread.sleep(2000);
		
	}

}
