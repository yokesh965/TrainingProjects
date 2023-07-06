package com.SeleniumDemo;

import org.openqa.selenium.edge.EdgeDriver;

public class VerifyTitle {
	public static void main (String[] args) {
		
		//Open the browser
		EdgeDriver driver = new EdgeDriver(); //Class object = new Class()
		
		//Navigate to application
		driver.get("https://facebook.com"); //object.method()
		
		String excpectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		System.out.println(excpectedTitle);
		System.out.println(actualTitle);
		
		if(excpectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.quit(); //Close the browser
	}

}
