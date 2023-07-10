package com.SeleniumPracticeProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LocateElementsUsingCssAndXpath {
	public static void main(String[] args) {
		
		//Open the browser
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		// Navigate to the W3Schools HTML Examples page
        driver.get("https://www.w3schools.com/html/html_examples.asp");

        // Locating elements using CSS selectors
        // Example 1: Tag and ID
        String element1 = driver.findElement(By.cssSelector("#w3loginbtn")).getText();
        System.out.println(element1);

        // Example 2: Tag and Class
        String element2 = driver.findElement(By.cssSelector("body > div:nth-child(12) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > a:nth-child(1)")).getText();
        System.out.println(element2);
        
        // Example 3: Tag and Attribute
        String element3 = driver.findElement(By.cssSelector("img[alt='Join our Bootcamp!']")).getText();
        System.out.println(element3);

        // Example 4: Tag, Class, and Attribute
        String element4 = driver.findElement(By.cssSelector("div[class='w3-bar w3-left topnavbar'] a[title='Python Tutorial']")).getText();
        System.out.println(element4);
        
        // Example 5: Inner text
        String element5 = driver.findElement(By.cssSelector("img[alt='Join our Bootcamp!']")).getText();
        System.out.println(element5);
        
        // Locating elements using XPath
        // Example 1: Absolute XPath
        String element6 = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[6]/a[1]")).getText();
        System.out.println(element6);
        
        // Example 2: Relative XPath
        String element7 = driver.findElement(By.xpath("//a[normalize-space()='HTML text alignment']")).getText();
        System.out.println(element7);

        // Close the browser
        driver.quit();
    }

}
