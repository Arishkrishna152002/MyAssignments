package PracticeAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0ea5cnhbh8bmrj1jn7tumu7cv607115.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Simple Alert Accept
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		a.accept();
		
		//Dismiss
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert b = driver.switchTo().alert();
		String text = b.getText();
		System.out.println(text);
		b.dismiss();
		
		//Prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert c =driver.switchTo().alert() ;
		c.sendKeys("Hello");
		Thread.sleep(5000);
		String text2 = c.getText();
		System.out.println(text2);
		c.accept();
		

	}

}
