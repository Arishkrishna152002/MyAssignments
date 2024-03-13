package AutomationAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/register-account");
		driver.findElement(By.id("firstName")).sendKeys("Arish");
		driver.findElement(By.id("lastName")).sendKeys("Krishna");
		//WebElement a=driver.findElement(By.id("middleName"));
		//String b=a.getAttribute("placeholder");
		//System.out.println(b);
		driver.findElement(By.name("middleName")).sendKeys("E");
		Thread.sleep(3000);
		WebElement source=driver.findElement(By.xpath("//select[@name='gender']"));
		Select c=new Select(source);
		c.selectByVisibleText("Male");
		Thread.sleep(3000);
		WebElement source1=driver.findElement(By.id("title"));
		Select d=new Select(source1);
		d.selectByIndex(3);
		Thread.sleep(3000);
		WebElement source2=driver.findElement(By.name("employmentStatus"));
		Select e=new Select(source2);
		e.selectByVisibleText(" Unemployed");
	}

}
