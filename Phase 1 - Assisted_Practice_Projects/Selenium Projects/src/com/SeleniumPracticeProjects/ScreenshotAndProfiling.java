package com.SeleniumPracticeProjects;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ScreenshotAndProfiling {
	public static void main(String[] args) {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notification");
		
		EdgeDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://yatra.com");
	}
}
