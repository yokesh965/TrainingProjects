package finalProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartTextVerifyPage {
	
	@FindBy(xpath = "/html/body/div[3]/div/p")
	private WebElement getAddToCartSuccessMessageText;
	
	@FindBy(linkText = "Home")
	private WebElement navigateToHomePage;
	
	public AddCartTextVerifyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getMessageText() {
		String text = getAddToCartSuccessMessageText.getText();
		return text;
	}
	
	public void clickHome() {
		navigateToHomePage.click();
	}
}
