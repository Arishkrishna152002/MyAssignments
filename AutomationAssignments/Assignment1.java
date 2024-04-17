package AutomationAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {    //LeafTaps create lead

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//p/input[@class='decorativeSubmit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
	driver.findElement(By.xpath("//td/input[@id='createLeadForm_firstName']")).sendKeys("Arish");
	driver.findElement(By.xpath("//td/input[@id='createLeadForm_lastName']")).sendKeys("Krishna");
	WebElement ele=driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
	Select a=new Select(ele);
	a.selectByIndex(3);
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	driver.close();
	
	


	}

}
