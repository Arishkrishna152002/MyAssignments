package automationTesting;

import java.time.Duration;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPhonePrice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/b?node=29657746031");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile", Keys.ENTER);
		
		List<String> phonePrice=new ArrayList<String>();
		
		List<WebElement> ele = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//ele.get(0);
		//ele.get(1);
		for(int i=0;i<ele.size();i++) {
			String price=ele.get(i).getText();
			//System.out.println(price);                                                           
			phonePrice.add(price);
			//collections.sort(phonePrice);   ///collections--->class--->List,Set 
			
		}
		System.out.println(phonePrice);

	}

}
