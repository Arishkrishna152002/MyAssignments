package automationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Automation6 {              //ACTIONS CLASS CONCEPT

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement source = driver.findElement(By.xpath("//span[text()='Electronics']"));
	    Actions builder = new Actions(driver);                      //moveToElement method in Actions class--->(dragging the mouse.
	    builder.moveToElement(source).perform();
	    
	    WebElement source1 = driver.findElement(By.xpath("(//a[@title='Login']/img)[1]"));
	    builder.moveToElement(source1).perform();
	    

	}

}


