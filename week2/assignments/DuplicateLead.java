package week2.assignments;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		
		WebElement clkEmail = driver.findElement(By.xpath("//span[text()='Email']"));
		clkEmail.click();
		
		String email = "xyz";
		WebElement edtEmail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
		edtEmail.sendKeys(email);
		
		WebElement btnFindLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		btnFindLeads.click();
		Thread.sleep(1000);
		
		WebElement firstResult = driver.findElement(By.xpath("//tr/td/div/a[@class='linktext']/following::a/following::a"));
		String leadName = firstResult.getText();
		firstResult.click();
		Thread.sleep(2000);
		
		WebElement btnDuplicateLead = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
		btnDuplicateLead.click();
		Thread.sleep(3000);
		
		if (driver.getTitle().contains("Duplicate Lead")){
			System.out.println("Landed to correct page");
		}
		else
			System.out.println("Incorrect page");
		
		WebElement btnCreateLead = driver.findElement(By.xpath("//input[@value='Create Lead']"));
		btnCreateLead.click();
		
		WebElement viewFirstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		
		if ((viewFirstName.getText()).equals(leadName)) {
			System.out.println("Duplicated");
		}
		else
			System.out.println("Not Duplicated");
		
		driver.close();
	}

}
