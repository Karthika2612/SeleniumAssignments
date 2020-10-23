package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonPageActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement rbClass = driver.findElement(By.xpath("//input[@id='yes']"));
		rbClass.click();
		
		WebElement rbUnchecked = driver.findElement(By.xpath("//label[@for='Unchecked']"));
		//WebElement rbChecked = driver.findElement(By.xpath("//label[@for='Checked']"));
		
		if (rbUnchecked.isSelected()) {
			System.out.println("Unchecked is selected");
		}
		else
			System.out.println("Checked is selected");
		
		
		WebElement rb1To20Year = driver.findElement(By.xpath("(//div/input)[1]"));
		WebElement rb21To40Year = driver.findElement(By.xpath("(//div/input)[2]"));
		WebElement rbAbove40Year = driver.findElement(By.xpath("(//div/input)[3]"));

		int age = 40;
		if (age>=1&&age<=20) {
			
			if (!rb1To20Year.isSelected()) {
				rb1To20Year.click();
			}
			else
				System.out.println("1 to 20 already selected");
		}
		else if(age>=21&&age<=40) {
			
			if (!rb21To40Year.isSelected()) {
				rb21To40Year.click();
			}
			else
				System.out.println("21 to 40 already selected");
		}
		else {
			
			if (!rbAbove40Year.isSelected()) {
				rbAbove40Year.click();
			}
			else
				System.out.println("Above 40 already selected");
		}
			
	}

}
