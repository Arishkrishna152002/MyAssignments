package AutomationAssignments;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("Arish krishna");
		a.accept();
			
		
	}

}
