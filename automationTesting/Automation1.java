package automationTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

	

}


