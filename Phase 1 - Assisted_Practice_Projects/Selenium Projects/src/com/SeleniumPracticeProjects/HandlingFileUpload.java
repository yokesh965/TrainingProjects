package com.SeleniumPracticeProjects;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.remove.bg/");
		driver.findElement(By.xpath("(//button[contains(@type, 'button')])[3]")).click();

		Thread.sleep(3000);
		Runtime.getRuntime().exec("Resources//FileUpload.exe");
	}

}
