package com.Swiggy.Pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
	private WebDriverWait wait;

	@FindBy(xpath = "//div[contains(@class, '_2axtv')]")
	private WebElement verificationText;

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public String verifyText() {
		wait.until(ExpectedConditions.visibilityOf(verificationText));
		String message = verificationText.getText();
		return message;
	}

}
