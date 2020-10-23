package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateCompanyName {

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
		
		WebElement firstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		firstName.sendKeys("Karthika");
		
		WebElement btnFindLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		btnFindLeads.click();
		Thread.sleep(1000);
		
		WebElement firstResult = driver.findElement(By.xpath("//tr/td/div/a[@class='linktext']"));
		firstResult.click();
		Thread.sleep(3000);
		
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("Expected page");
		}
		
		else
			System.out.println("Incorrect Page");
		
		WebElement btnEdit = driver.findElement(By.xpath("//a[text()='Edit']"));
		btnEdit.click();
		Thread.sleep(2000);
		
		String companyName = "ABC Private limited";
		WebElement edtCompanyName = driver.findElement(By.xpath(" //input[@id='updateLeadForm_companyName']"));
		edtCompanyName.clear();
		edtCompanyName.sendKeys(companyName);
		
		WebElement btnUpdate = driver.findElement(By.xpath(" //input[@value='Update']"));
		btnUpdate.click();
		Thread.sleep(3000);
		
		WebElement viewCompanyName = driver.findElement(By.xpath(" //span[@id='viewLead_companyName_sp']"));
		
		if (viewCompanyName.getText().contains(companyName)) {
			System.out.println("Company Name updated");
		}
		else
			System.out.println("Company name is not updated");
		
		driver.close();
	}

}
