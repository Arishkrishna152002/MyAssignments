package AutomationAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://leafground.com/input.xhtml");
	driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext')]")).sendKeys("Arish Krishna");
	driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("-Guindy");
	WebElement ele=driver.findElement(By.xpath("(//div[@class='col-12'])[3]"));
	boolean a=ele.isEnabled();
	System.out.println(a);
	driver.findElement(By.xpath("//input[@name='j_idt88:j_idt95']")).clear();
	WebElement ele1=driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']"));
	String b=ele1.getAttribute("value");
	System.out.println(b);
	driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']")).sendKeys("arish123@gmail.com",Keys.TAB);
	}

}
