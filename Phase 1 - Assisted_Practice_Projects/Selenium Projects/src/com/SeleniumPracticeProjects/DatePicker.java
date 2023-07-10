package com.SeleniumPracticeProjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
	public static void main(String[] args) {
//		1) Open the browser
		EdgeDriver driver = new EdgeDriver();

//		2) Maximize the window
		driver.manage().window().maximize();

//		3) Navigate to the Application
		driver.get("https://www.expedia.co.in/");

//		4) Click on Calendar icon
		// Wait for the next page to load completely
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("d1-btn"))).click();

//		5) Select 9th from the next month
		WebElement nextMonth = driver.findElement(By.xpath("(//table[contains(@class, 'weeks')])[2]"));
		List<WebElement> rows = nextMonth.findElements(By.tagName("tr"));

		for (int i = 1; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> columns = row.findElements(By.tagName("button"));

			for (WebElement x : columns) {
				if (x.getAttribute("data-day").equals("9")) {
					x.click();
					break;
				}
			}
		}

//		6) Click on 'Done' to close the calendar
		driver.findElement(By.xpath("//button[contains(@data-stid, 'apply-date')]")).click();

		driver.quit();
	}

}
