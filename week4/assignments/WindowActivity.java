package week4.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowActivity {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
//		Set<String> windowSet = driver.getWindowHandles();
//		List<String> windowList = new ArrayList<String>(windowSet);
//		driver.switchTo().window(windowList.get(1)).close();	
//		driver.switchTo().window(windowList.get(0));
		
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windowSet1 = driver.getWindowHandles();
		System.out.println("No. of opened windows: "+windowSet1.size());
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		Set<String> windowSet2 = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowSet2);
		
		for (String eachWindowList : windowList) {
			if(!(eachWindowList.equals(parentWindow))){
			driver.switchTo().window(eachWindowList);
			driver.close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Set<String> windowSet3 = driver.getWindowHandles();
		System.out.println("Newly opened windows:"+windowSet3.size());
		List<String> windowList3 = new ArrayList<String>(windowSet3);
		
		for (String eachWindowList : windowList3) {
			if(!(eachWindowList.equals(parentWindow))){
			driver.switchTo().window(eachWindowList).close();
			}
		}
		
		driver.switchTo().window(parentWindow);
		
		System.out.println("Title of Parent Window:"+driver.getTitle());
		
		driver.close();
	}

}
