package automationTesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    
	    
	    File getScreenShot = driver.getScreenshotAs(OutputType.FILE);
	    
	    File storeScreenShot = new File("./Snaps/Amazon.png");
	    
	    FileHandler.copy(getScreenShot, storeScreenShot);
	    
	    
	    
	    WebElement element = driver.findElement(By.xpath("//img[@alt='Clothing']"));
         File getScreenShot1 = element.getScreenshotAs(OutputType.FILE);
	    
	    File storeScreenShot1 = new File("./Snaps/men.png");
	    
	    FileHandler.copy(getScreenShot1, storeScreenShot1);
	    
	    
	    

	}

}
