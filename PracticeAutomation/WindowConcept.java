package PracticeAutomation;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowConcept {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node01vc54c53sow99fethl0xzou12628786.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1.
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> names = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(names.get(1));
		System.out.println("Window URL:"+ driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(names.get(0));
		
		//2.
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> names2 = new ArrayList<String>(windowHandles2);
		
		driver.switchTo().window(names2.get(1));
		System.out.println("window URL"+ driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(names.get(0));
		
		
		

	}

}
