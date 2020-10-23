package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement userName = driver.findElementById("username");
		WebElement passWord = driver.findElementById("password");
		WebElement submit = driver.findElementByClassName("decorativeSubmit");
		userName.sendKeys("demosalesmanager");
		passWord.sendKeys("crmsfa");
		submit.click();
		Thread.sleep(2000);
		WebElement crmLink = driver.findElementByLinkText("CRM/SFA");
		crmLink.click();
		Thread.sleep(2000);
		WebElement linkLead = driver.findElementByLinkText("Leads");
		linkLead.click();
		Thread.sleep(1000);
		WebElement linkCreateLead = driver.findElementByLinkText("Create Lead");
		linkCreateLead.click();
		Thread.sleep(2000);
		WebElement companyName = driver.findElementById("createLeadForm_companyName");
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		WebElement lastName = driver.findElementById("createLeadForm_lastName");
		Select source = new Select(driver.findElementByName("dataSourceId"));
		Select marketCampaign = new Select(driver.findElementByName("marketingCampaignId"));
		Select ownership = new Select(driver.findElementByName("ownershipEnumId"));
		Select country = new Select(driver.findElementByName("generalCountryGeoId"));
		WebElement createLead = driver.findElementByName("submitButton");
		companyName.sendKeys("XYZ PVT LTD");
		firstName.sendKeys("Karthika");
		lastName.sendKeys("P");
		source.selectByVisibleText("Employee");
		marketCampaign.selectByValue("9001");
		ownership.selectByIndex(5);
		country.selectByVisibleText("India");
		createLead.click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
	}

}
