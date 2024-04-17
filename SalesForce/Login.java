package SalesForce;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

        // Add specific options/preferences
       /* options.addArguments("--start-maximized"); // Maximize the browser window
        options.addArguments("--disable-extensions"); // Disable browser extensions
        options.addArguments("--incognito"); // Open a new incognito window*/
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("arishkrishna152002@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Arish@152002");
		driver.findElement(By.id("Login")).click();
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='Sales']"));
		driver.executeScript("arguments[0].click();", element);
		
		
	//	driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none'])[1]")).click();
		WebElement element2 = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click();", element2);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[7]")).sendKeys("Sales Automation");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[6]")).sendKeys("15/04/2002");
		driver.findElement(By.xpath("(//label[text()='Stage']/following::div)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		
		
		

	}

}
