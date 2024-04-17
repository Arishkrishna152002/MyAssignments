package automationTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation7 {               //ACTIONS CONCEPTS

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://leafground.com/drag.xhtml;jsessionid=node01cp2gb3ci9deh4ueehpc4g5da536697.node0");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement element = driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
	   /* Point a=element.getLocation();
	    int x= a.getX();                               //GetLocation 
	    System.out.println(x);*/
	    
	    Actions a=new Actions(driver);
	    a.dragAndDropBy(element, 102, 0).perform();              //dragAndDropBy method
	    
	    
	    WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag_content']"));    ///drahAndDrop Method
	    WebElement drop = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
	    a.dragAndDrop(drag, drop).perform();
	    
	    
	    WebElement findelement = driver.findElement(By.xpath("//h4[text()='Resize Image']"));          //scrollToElement method
	    a.scrollToElement(findelement).perform();
	    
	    

	}

}
