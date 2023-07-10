package com.SeleniumPracticeProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LocatorElements {
    public static void main(String[] args) {
        
        // Create a new instance of the EdgeDriver
        WebDriver driver = new EdgeDriver();

        // Launch the website
        driver.get("https://www.w3schools.com/");

        // Step 4.3.1: Using ID as a Locator
        driver.findElement(By.id("w3loginbtn")). click();
        
        //Go Backward
        driver.navigate().back();

        // Launch the another website
        driver.get("https://www.fb.com/");
        
      //Step 4.3.2: Using class name as a Locator
        driver.findElement(By.className("_8eso")).getText();
        
        //Step 4.3.3: Using Name as a Locator
        driver.findElement(By.name("login")).click();

        // Step 4.3.4: Using LinkText as a Locator
        driver.findElement(By.linkText("Forgotten password?")).click();
        
        // Step 4.3.5: Using Xpath as a Locator
        // Relative Xpath
        driver.findElement(By.xpath("//input[@class='inputtext _9o1w']")).sendKeys("0987654321");
        // Absolute Xpath
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[3]/div/div[1]/button")).click();
        
        
        // Close the browser
        driver.quit();
    }
}

