package week4.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		
		userName.sendKeys("demosalesmanager");
		passWord.sendKeys("crmsfa");
		login.submit();
		Thread.sleep(2000);
		
		WebElement crmLink = driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
		crmLink.click();
		Thread.sleep(4000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement leadsLink = driver.findElement(By.xpath("//a[text()='Leads']"));
		leadsLink.click();
		
		WebElement mergeLeads = driver.findElement(By.xpath("//a[text()='Merge Leads']"));
		mergeLeads.click();
		
		WebElement fromLead = driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']"));
		fromLead.click();
		
		Set<String> fromLeadSet = driver.getWindowHandles();
		List<String> fromLeadList = new ArrayList<String>(fromLeadSet);
		driver.switchTo().window(fromLeadList.get(1));
		
		WebElement leadId = driver.findElement(By.xpath("//input[@name='id']"));
		leadId.sendKeys("152");
		WebElement findLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads.click();
		Thread.sleep(2000);
		WebElement firstLead = driver.findElement(By.xpath("//a[@class='linktext']"));
		String fromLeadId = firstLead.getText();
		firstLead.click();
		driver.switchTo().window(fromLeadList.get(0));
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		
		Set<String> toLeadSet = driver.getWindowHandles();
		List<String> toLeadList = new ArrayList<String>(toLeadSet);
		driver.switchTo().window(toLeadList.get(1));
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("162");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(toLeadList.get(0));

		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(fromLeadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String message = driver.findElement(By.xpath("//div/div[@class='x-paging-info']")).getText();
		
		if(message.contains("No records")) {
			System.out.println("Leads are successfully merged");
		}else
			System.out.println("Leads are not successfully merged");
		
		driver.close();
		
}

}
