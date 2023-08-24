package finalProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(linkText = "Place Order")
	private WebElement placeOrderBtn;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickPlaceOrderBtn() {
		placeOrderBtn.click();
	}
}
