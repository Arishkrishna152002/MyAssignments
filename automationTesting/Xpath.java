package automationTesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/b?node=29657746031");

		//SYNTAX FOR ABSOLUTE X-path-->    /html/body/div[0]/div/form/p/input   -->example syntax.
		
		//SYNTAX FOR RELATIVE X-path-->    //tagName[@attributename='attributeValue']
		
	
		//syntax for x-path
		//1. Attribute Based X-path
		   //tagName[@attributename='attributeValue']
		
		//2.Index Based X-path
		  //  (//tagName[@attributename='attributeValue'])[0]    ------>this for matches in Dom page
		
		//3.Text Based X-path
		  //tagName[text()='textValue']
		
		//4.Contains Based X-path
		  //tagName[contains(text(), 'textValue')]
              
		//5.Parent to Child X-path
		  //ParentTag[@ParentAttributeName='ParentAttributeValue']/ChildTagName[@ChildAttributeName='ChildAttributeValue']
		
		//6.Child to Parent X-path
		  //ChildTagName[@ChildAttributeName='ChildAttributeValue']/Parent::ParentTagName
		
		//7.GrandParent to GrandChild X-path
		  //GrandParentTag[@GrandParentAttributeName='GrandParentAttributeValue']//GrandChildTagName[@GrandChildAttributeName='GrandChildAttributeValue']
		
		//8.GrandChild to GrandParent X-path
		  //GrandChildTagName[@GrandChildAttributeName='GrandChildAttributeValue']/ancestor::GrandParentTagName
		
		//9.ElderCousin to YoungerCousin X-path
		  //ElderCousinTagName[@ElderCousinAttributeName='ElderCousinAttributeNameValue']/following::YoungerCousin
		
		//10.YoungerCousin to ElderCousin X-path
		  //YoungerCousinTagName[@YongerCousinAttributeName='YoungerCousinAttributeNameValue']/Preceding::ElderCousin
		
		//11.ElderSiblings to YoungerSibilings X-path
		  //ElderSiblingsTagName[@ElderSiblingsAttributeName='ElderSiblingsAttributeNameValue']/following-Siblings::YoungerSiblings
		
	    //12.YoungerSiblings to ElderSiblings X-path
		  //YoungerSiblingsTagName[@YongerSiblingsAttributeName='YoungerSiblingsAttributeValue']/Preceding-Siblings::ElderSiblings
		
		
		
		
   
	
		                         
		
		
		
		
		
		
		
		
		
           
		
		
	}

}
