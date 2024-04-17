package automationTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Automation {          //LeafTaps

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Getting current url name//
		String url=driver.getCurrentUrl();	   
		//System.out.println(url);
		if(url.contains("control")) {
			System.out.println("Page loaded successfully");
		}else {
			System.out.println("Page is not loaded properly");
		}
		
		String title=driver.getTitle();  //--->to get the TAB name in Chrome Page
		System.out.println(title);
		
		driver.navigate().back();   //Navigator
		Thread.sleep(3000);
		driver.navigate().forward();
		
	
	}

}
