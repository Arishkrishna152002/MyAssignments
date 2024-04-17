package automationTesting;

import org.testng.annotations.Test;

public class LearnTestNg {
	
	@Test(invocationCount = 10,invocationTimeOut= 30)                //invocationCount means ----->how many times we want to print the output, for that we giving a value.
	public void createLead() {                        //invocationTimeOut means----> it means within how many seconds the output wants to be run, for that we giving a value.
		System.out.println("Create Lead");
	}

	
}
