package com.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyLoginErrorMessage {
    public static void main(String[] args) {

        // 1) Open the browser
        EdgeDriver driver = new EdgeDriver();

        // 2) Navigate to application
        driver.get("https://facebook.com");

        // 3) Enter invalid username 'batman423@gmail.com' in the Email address or phone number textbox
        driver.findElement(By.id("email")). sendKeys("batman423@gmail.com");

        // 4) Enter invalid Password 'Pass@123' in the Password textbox
        driver.findElement(By.id("pass")). sendKeys("Pass@123");

        // 5) Click Login
        driver.findElement(By.name("login")). click();

        // 6) Verify user sees the error message - "The email address you entered isn't connected to an account. Find your account and log in."
        String excpectedTitle = "The email address you entered isn't connected to an account. Find your account and log in.";
		// String actualTitle = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
        String actualTitle = driver.findElement(By.xpath("(//div[contains(@class, 'ay')])[3]")).getText();

        if(excpectedTitle.equals(actualTitle)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
        }
        // 7) Close the browser
        driver.quit();
    }
}
