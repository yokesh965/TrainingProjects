package com.Swiggy.Pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsRestaurant {

	private WebDriverWait wait;

	@FindBy(xpath = "//div[contains(@class, 'gWiXXg')][1]")
	private WebElement firstRestaurant;

	public SearchResultsRestaurant(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clickFirstRestaurant() {
		wait.until(ExpectedConditions.visibilityOfAllElements(firstRestaurant));
		firstRestaurant.click();
	}
}
