package com.PhaseEndProject;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhaseEndProject {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.linkText("Mobiles")).click();
		WebElement MobileAndAccessories = driver.findElement(By.linkText("Mobiles & Accessories"));
		Actions action = new Actions(driver);
		action.moveToElement(MobileAndAccessories).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[14]//div[2]//div[1]//div[2]//ul[1]//li[5]//a[1]"))).click();

		driver.findElement(By.linkText("Apple iPhone 14 (128 GB) - Blue")).click();
		// Switch focus on new tab
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.findElement(By.id("buy-now-button")).click();

		String ActualText = driver.findElement(By.className("a-spacing-small")).getText();
		String ExpectedText = "Sign in";

		if (ActualText.equals(ExpectedText)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	}

}
