package com.SeleniumPracticeProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingVariousElements {
	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		// Navigate to Google homepage
		driver.get("https://www.google.com");

		// Step 4.5.1: Edit box
		// Enter a value in the search box
		driver.findElement(By.name("q")).sendKeys("Hello World");

		// Clear the value
		driver.findElement(By.name("q")).clear();

		// Check enabled status of the search box
		boolean isSearchBoxEnabled = driver.findElement(By.name("q")).isEnabled();
		System.out.println(isSearchBoxEnabled);

		// Check search box existence
		boolean doesSearchBoxExist = driver.findElements(By.name("q")).size() > 0;
		System.out.println(doesSearchBoxExist);

		// Get the value from the search box
		String searchBoxValue = driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(searchBoxValue);

		// Step 4.5.2: Link
		// Click the "Images" link
		driver.findElement(By.linkText("Images")).click();

		// Check the "Images" link existence
		boolean doesImagesLinkExist = driver.findElements(By.linkText("Images")).size() > 0;
		System.out.println(doesImagesLinkExist);

		driver.navigate().back();
		
		// Step 4.5.3: Button
        // Click the "Google Search" button
		driver.findElement(By.name("q")).sendKeys("Hello World");
        //driver.findElement(By.name("btnK")).click();
        
        // Check enabled status of the "Google Search" button
        boolean isSearchButtonEnabled = driver.findElement(By.name("btnK")).isEnabled();
        System.out.println(isSearchButtonEnabled);

        // Display status of the "Google Search" button
        boolean isSearchButtonDisplayed = driver.findElement(By.name("btnK")).isDisplayed();
        System.out.println(isSearchButtonDisplayed);

        // Step 4.5.6: Checkbox
        // Check if the "I'm Feeling Lucky" checkbox is displayed or not
        boolean isFeelingLuckyCheckboxDisplayed = driver.findElement(By.name("btnI")).isDisplayed();
        System.out.println(isFeelingLuckyCheckboxDisplayed);
        
        // Check if the "I'm Feeling Lucky" checkbox is enabled or not
        boolean isFeelingLuckyCheckboxEnabled = driver.findElement(By.name("btnI")).isEnabled();
        System.out.println(isFeelingLuckyCheckboxEnabled);
		
        // Check if the "I'm Feeling Lucky" checkbox is selected or not
        boolean isFeelingLuckyCheckboxSelected = driver.findElement(By.name("btnI")).isSelected();
        System.out.println(isFeelingLuckyCheckboxSelected);

        // Select the "I'm Feeling Lucky" checkbox
        driver.findElement(By.name("btnI")).click();
        
        driver.navigate().back();
        
        // Step 4.5.8: Drop-down list
        // Check the drop-down box existence
        boolean doesDropDownExist = driver.findElements(By.name("gws-output-pages-elements-homepage_additional_languages__als")).size() > 0;
        System.out.println(doesDropDownExist);

        // Step 4.5.10: Frame
        // Switch from the default content to a frame
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Frames")).click();
        
        // Switch back from a frame to the default content
        driver.switchTo().defaultContent();

        // Step 4.5.11: Switching between tabs in the same browser window
        // Open a new tab
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        
        driver.switchTo().defaultContent();

		// Close the browser
		driver.quit();
	}
}
