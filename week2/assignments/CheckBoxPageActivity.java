package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CheckBoxPageActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement chkJava = driver.findElement(By.xpath("//div[text()='Java']/input"));
		WebElement chkVB = driver.findElement(By.xpath("//div[text()='VB']/input"));
		WebElement chkSQL = driver.findElement(By.xpath("//div[text()='SQL']/input"));
		WebElement chkC = driver.findElement(By.xpath("//div[text()='C']/input"));
		WebElement chkCPlus = driver.findElement(By.xpath("//div[text()='C++']/input"));

		String[] knwonLanguage = {"Java","SQL","VB","C++"};
		
		for (String eachLanguage : knwonLanguage) {
			if (eachLanguage.equals("Java")) {
				chkJava.click();
				continue;
			}
			else if(eachLanguage.equalsIgnoreCase("SQL")) {
				chkSQL.click();
				continue;
			}
			else if(eachLanguage.equalsIgnoreCase("VB")) {
				chkVB.click();
				continue;
			}
			else if(eachLanguage.equalsIgnoreCase("C")) {
				chkC.click();
				continue;
			}
			else {
				chkCPlus.click();
				continue;
			}
				
		}
		
		WebElement chkConfirm = driver.findElement(By.xpath("//div[text()='Selenium']/input"));
		if(chkConfirm.isSelected()) {
			System.out.println("Selenium is checked");
		}
		else {
			System.out.println("Selenium is not checked");
		}
			
		
		WebElement chkNotSelected = driver.findElement(By.xpath("//div[text()='Not Selected']/input"));
		WebElement chkSelected = driver.findElement(By.xpath("//div[text()='I am Selected']/input"));
		
		if(chkNotSelected.isSelected()) {
			chkNotSelected.click();
		}
		else if (chkSelected.isSelected()) {
			chkSelected.click();
		}
		
		List<WebElement> options = driver.findElements(By.xpath("//div[contains(text(),'Option')]/input"));
		for (WebElement eachOption : options) {
			eachOption.click();
		}

	}

}
