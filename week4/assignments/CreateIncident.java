package week4.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIncident {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev68594.service-now.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(8000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("Incident");
		driver.findElement(By.xpath("(//a/div/div[text()='All'])[2]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[text()='New']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']/following-sibling::span/following-sibling::span//button")).click();
		
		Set<String> windowSet = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowSet);
		driver.switchTo().window(windowList.get(1));
		
		WebElement search = driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='Search']"));
		search.sendKeys("A",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='sys_user_table']//tbody/tr/td/a")).click();
		driver.switchTo().window(windowList.get(0));
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("Testing");
		String incidentNo = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		driver.findElement(By.xpath("//button[@type='submit' and text()='Submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search' and @class='form-control']")).sendKeys(incidentNo,Keys.ENTER);
		Thread.sleep(2000);
		
		String incidentNoEx = driver.findElement(By.xpath("//table[@id='incident_table']//tbody/tr/td[3]/a")).getText();
		
		if (incidentNoEx.equalsIgnoreCase(incidentNo)) {
			System.out.println("Incident Created successfully");
		}else
			System.out.println("Incident does not Created successfully");
		

		 
	}

}
