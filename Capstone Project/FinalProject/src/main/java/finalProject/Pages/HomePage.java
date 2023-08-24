package finalProject.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private JavascriptExecutor js;

	@FindBy(xpath = "(//a[contains(@class, 'btn')])[5]")
	private WebElement addToCartBtn;

	@FindBy(linkText = "Cart")
	private WebElement navigateToCartPage;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	public void clickAddToCartBtn() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", addToCartBtn);
		js.executeScript("arguments[0].click();", addToCartBtn);

	}

	public void clickCart() {
		navigateToCartPage.click();
	}
}
