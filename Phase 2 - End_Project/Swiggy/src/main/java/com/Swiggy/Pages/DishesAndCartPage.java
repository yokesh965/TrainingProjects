package com.Swiggy.Pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DishesAndCartPage {
	private Actions actions;
	private WebDriverWait wait;

	@FindBy(xpath = "//div[contains(@class, '_1RPOp')][1]")
	private WebElement firstDish;

	@FindBy(xpath = "//span[contains(@class, '_2vS77')]")
	private WebElement cartIcon;

	@FindBy(xpath = "//div[contains(@class, '_55uP6')]")
	private WebElement checkoutBtn;

	public DishesAndCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void clickFirstRestaurant() {
		wait.until(ExpectedConditions.visibilityOfAllElements(firstDish));
		firstDish.click();
	}

	public void hoverOverCartIcon() throws InterruptedException {
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfAllElements(cartIcon));
		actions.moveToElement(cartIcon).build().perform();
	}

	public void clickCheckout() {
		wait.until(ExpectedConditions.visibilityOf(checkoutBtn));
		checkoutBtn.click();
	}
}
