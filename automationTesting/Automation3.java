package automationTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;                                ///exceptions in alert---->i)noAlertFound ii)unhandledAlert
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation3 {    /////ALERT CONCEPT

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//simple alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Alert a = driver.switchTo().alert();
		String value= a.getText();
		System.out.println(value);
		a.accept();
		
		
		///confirm alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		String value1= a.getText();		
		System.out.println(value1);
		a.dismiss();
		
		///prompt alert
		driver.findElement(By.xpath("(//h5[contains(text(), ' Alert (Prompt Dialog)')]/following::span)[2]")).click();
		Alert b= driver.switchTo().alert();
		Thread.sleep(5000);
		b.sendKeys("sss");
		String value2 =b.getText();
		System.out.println(value2);
		b.accept();
	}

}
