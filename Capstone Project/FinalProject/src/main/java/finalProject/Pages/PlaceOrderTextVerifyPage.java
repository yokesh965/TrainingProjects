package finalProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderTextVerifyPage {
	@FindBy(xpath = "/html/body/div[3]/div/p")
	private WebElement getPlaceOrderSuccessMessageText;
	
	public PlaceOrderTextVerifyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getMessageText() {
		String text = getPlaceOrderSuccessMessageText.getText();
		return text;
	}
}

