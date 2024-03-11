/*package automationTesting;




import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

	
}*/


package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/b?node=29657746031");
		Thread.sleep(3000);
		driver.findElement(By.name("field-keywords")).sendKeys("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
	

	}

	
}


/*package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/b?node=29657746031");
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		findElements.get(3);
		System.out.println(findElements.get(3));
		
	

	}

	
}*/