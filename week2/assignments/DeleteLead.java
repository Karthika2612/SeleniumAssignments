package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement userName = driver.findElementByXPath("//input[@id='username']");
		WebElement passWord = driver.findElementByXPath("//input[@name='PASSWORD']");
		WebElement submit = driver.findElementByXPath("//input[@value='Login']");
		userName.sendKeys("demosalesmanager");
		passWord.sendKeys("crmsfa");
		submit.click();
		Thread.sleep(2000);
		WebElement crmLink = driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]");
		crmLink.click();
		Thread.sleep(2000);
		WebElement linkLead = driver.findElementByXPath("//a[text()='Leads']");
		linkLead.click();
		Thread.sleep(1000);
		
		WebElement findLead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLead.click();
		Thread.sleep(3000);
		
		WebElement phone = driver.findElement(By.xpath("//span[text()='Phone']"));
		phone.click();
		
		WebElement edtPhoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		edtPhoneNumber.sendKeys("99");
		
		WebElement btnFindLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		btnFindLeads.click();
		Thread.sleep(3000);
		
		WebElement firstResult = driver.findElement(By.xpath("//tr/td/div/a[@class='linktext']"));
		String leadId = firstResult.getText();
		firstResult.click();
		Thread.sleep(2000);
		
		WebElement btnDelete = driver.findElement(By.xpath("//a[text()='Delete']"));
		btnDelete.click();
		Thread.sleep(4000);
		
		WebElement findLead1 = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLead1.click();
		Thread.sleep(2000);
		
		WebElement edtLeadId = driver.findElement(By.xpath("//input[@name='id']"));
		edtLeadId.sendKeys(leadId);
		
		WebElement btnFindLeads1 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		btnFindLeads1.click();
		Thread.sleep(1000);
		
		List<WebElement> recordsList = driver.findElements(By.xpath("//tr/td/div/a[@class='linktext']"));
		if (recordsList.size()==0) {
			System.out.println("Successful deletion");
		}
		else
			System.out.println("Record is not deleted successfully");
		
		driver.close();
	}

}
