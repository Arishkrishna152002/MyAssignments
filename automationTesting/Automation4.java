package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation4 {       ///iFRAME CONCEPT

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Frame']")).click();
		Thread.sleep(3000);
		
		//driver.switchTo().frame(0);    ///index based frame
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));   ///WEBELEMENT BASED FRAME
		driver.switchTo().frame(frame1);                    //WEBELEMENT BASED FRAME
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		driver.switchTo().defaultContent();   ///---> default content is used to exsist the current frame
		
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(frame2);
		WebElement text = driver.findElement(By.xpath("//button[text()='Count Frames']"));
		String a=text.getText();
		System.out.println(a);
		
		

	}

}
