package week4.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableActivity {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		List<WebElement> columnElements = driver.findElements(By.xpath("//table[@id='table_id']//tr/th"));
		System.out.println("No. of columns:"+columnElements.size());
		
		List<WebElement> rowElements = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
		System.out.println("No. of rows:"+rowElements.size());
		
		String progressOfInteract = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td[1]")).getText();
		System.out.println("Progress value of Interact with Elements "+progressOfInteract);
		
		List<WebElement> elementList = driver.findElements(By.xpath("//table[@id='table_id']//tr[*]/td[2]"));
		List<Integer> progress = new ArrayList<Integer>();
		for (WebElement eachElement : elementList) {
			int value = Integer.parseInt((eachElement.getText()).replace("%", ""));
			progress.add(value);
		}
		
		Collections.sort(progress);
		int leastProgress = progress.get(0);
		System.out.println("Least Progress is:"+leastProgress);
		
		WebElement vitalTask = driver.findElement(By.xpath("//table[@id='table_id']//tr/td[contains(text(),'"+leastProgress+"')]/following-sibling::td/input"));
		vitalTask.click();

	}

}
