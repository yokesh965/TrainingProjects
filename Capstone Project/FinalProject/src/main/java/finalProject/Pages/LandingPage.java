package finalProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	@FindBy(linkText = "New User? Register Here")
	private WebElement newUser;

	@FindBy(id = "email")
	private WebElement emailTextBox;

	@FindBy(id = "password")
	private WebElement passwordTextBox;

	@FindBy(xpath = "//button[contains(@class, btn)]")
	private WebElement loginBtn;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickNewUser() {
		newUser.click();
	}

	public void enterLoginEmail() {
		emailTextBox.sendKeys("yokesh@gmail.com");
	}

	public void enterLoginPassword() {
		passwordTextBox.sendKeys("pass@123");
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

}
