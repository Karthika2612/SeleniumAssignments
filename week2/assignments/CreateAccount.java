package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

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
		WebElement account = driver.findElementByLinkText("Accounts");
		account.click();
		Thread.sleep(1000);
		WebElement createAccount = driver.findElementByLinkText("Create Account");
		createAccount.click();
		Thread.sleep(2000);
		WebElement accountName = driver.findElementByXPath("//input[@id = 'accountName']");
		WebElement description = driver.findElementByXPath("//textarea[@name = 'description']");
		WebElement localName = driver.findElementByXPath("//input[@name = 'groupNameLocal']");
		WebElement siteName = driver.findElementByXPath("//input[@name = 'officeSiteName']");
		WebElement annualRevenue = driver.findElementByXPath("(//input[@class = 'inputBox'])[5]");
		Select industry = new Select(driver.findElementByName("industryEnumId"));
		Select ownership = new Select(driver.findElementByName("ownershipEnumId"));
		Select source = new Select(driver.findElementByName("dataSourceId"));
		Select marketingCampaign = new Select(driver.findElementByName("marketingCampaignId"));
		Select stateProvince = new Select(driver.findElementByName("generalStateProvinceGeoId"));
		WebElement btnCreateAccount = driver.findElementByXPath("//input[@class = 'smallSubmit']");
		accountName.sendKeys("Debit Limited Account 12");
		description.sendKeys("Selenium Automation Tester");
		localName.sendKeys("TestLocalName");
		siteName.sendKeys("TestSiteName");
		annualRevenue.sendKeys("800000");
		industry.selectByVisibleText("Computer Software");
		ownership.selectByVisibleText("S-Corporation");
		source.selectByValue("LEAD_EMPLOYEE");
		marketingCampaign.selectByIndex(6);
		stateProvince.selectByValue("TX");
		btnCreateAccount.click();
		/*
		 * WebElement btnDuplicateAccount =
		 * driver.findElementByLinkText("Create Account Ignoring Duplicates");
		 * btnDuplicateAccount.click();
		 */
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
	}
	

}
