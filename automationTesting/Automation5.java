package automationTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation5 {                 //WINDOW CONCEPT

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=mobile&crid=ED1NTN6BTE5W&sprefix=%2Caps%2C175&ref=nb_sb_ss_recent_1_0_recent");
		driver.findElement(By.xpath("//span[text()='11,999']")).click();
		
		/*String windowHandle = driver.getWindowHandle();            //---->WindowHandle
		System.out.println(windowHandle);*/
		
		
		Set<String> windowHandles = driver.getWindowHandles();           //----->WindowHandles
		List<String> names=new ArrayList<String>(windowHandles);         //in set we can't able to use index method, so we converting set to List.
		
		driver.switchTo().window(names.get(1));                          //------>To get the Second Tab In The Website, We using names.get(1);
	   // System.out.println(windowHandles);
		/*String title = driver.getTitle();
		System.out.println(title);*/
		
		driver.close();

		

	}

}








