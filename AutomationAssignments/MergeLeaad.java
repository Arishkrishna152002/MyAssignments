package AutomationAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeaad {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//p/input[@class='decorativeSubmit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> names = new ArrayList<String>(windowHandles);
		driver.switchTo().window(names.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")).click();
		driver.switchTo().window(names.get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandle1 = driver.getWindowHandles();
		List<String> names1 = new ArrayList<String>(windowHandle1);
		driver.switchTo().window(names1.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[4]/a")).click();
		driver.switchTo().window(names1.get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();

	}

}
