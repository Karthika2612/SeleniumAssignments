package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagePageActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		
		WebElement imgHome = driver.findElement(By.xpath("//img[@src='../images/home.png']"));
		imgHome.click();
		driver.navigate().back();
		
		WebElement imgMouse = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
		Actions act = new Actions(driver);
		act.moveToElement(imgMouse).click().build().perform();		
		
	}

}
