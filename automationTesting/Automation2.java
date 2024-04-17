package automationTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Automation2 {   //FaceBook SignUP
	
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login.php/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='_97w5']")).click();
			driver.findElement(By.name("firstname")).sendKeys("Arish");
			driver.findElement(By.name("lastname")).sendKeys("Krishna");
			driver.findElement(By.name("reg_email__")).sendKeys("9080336860");
			driver.findElement(By.name("reg_passwd__")).sendKeys("Arish@123");
			driver.findElement(By.id("day")).sendKeys("15");
		    WebElement source = driver.findElement(By.name("birthday_month"));
			Select a = new Select(source);
			a.selectByIndex(3);
			WebElement source2= driver.findElement(By.id("year"));
			Select b = new Select(source2);
			b.selectByVisibleText("2002");
			driver.findElement(By.xpath("//label[text()='Male']")).click();
			Thread.sleep(5000);
			driver.close();
			
			
		

	}

}




