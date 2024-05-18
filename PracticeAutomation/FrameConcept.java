package PracticeAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("(//button[@id='Click'])[1]")).click();

	}

}
