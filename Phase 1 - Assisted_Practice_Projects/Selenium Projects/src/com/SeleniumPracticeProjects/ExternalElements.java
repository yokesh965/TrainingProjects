package com.SeleniumPracticeProjects;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExternalElements {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("Button2")).click();
		
		Thread.sleep(3000);
		
		String Text = driver.switchTo().alert().getText();
		System.out.println(Text);
		driver.switchTo().alert().accept(); //close the alert box
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Instagram")).click();
		
		//Switch focus on new tab
		ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		//Wait for the next page to load completely
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		//Write 'abc@gmail.com' in the email textbox of Instagram page
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		
	}

}
