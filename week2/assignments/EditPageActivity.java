package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPageActivity {
	

public static void main(String args[]) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	
	WebElement edtEmail = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement edtAppend = driver.findElement(By.xpath("//input[@type='text' and @value = 'Append ']"));
	WebElement edtDefault = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
	WebElement edtClear = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
	WebElement edtConfirm = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	
	edtEmail.sendKeys("karthika.pichandi.26@gmail.com");
	edtAppend.sendKeys("Append");
	//edtAppend.sendKeys(Keys.TAB);
	System.out.println(edtDefault.getAttribute("value"));
	edtClear.clear();
	if (!edtConfirm.isEnabled()) {
		System.out.println("Disabled");
	}
	
}
}

