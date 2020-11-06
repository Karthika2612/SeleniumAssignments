package week4.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDroppable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement soruceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(soruceElement, targetElement).build().perform();
		
	}

}
