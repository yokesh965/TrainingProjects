package finalProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegisterPage {
	@FindBy(id = "name")
	private WebElement nameTextBox;
	
	@FindBy(id = "email")
	private WebElement emailTextBox;
	
	@FindBy(id = "password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath = "//button[contains(@class, 'btn')]")
	private WebElement registerBtn;

	public UserRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterName() {
		nameTextBox.sendKeys("Yokesh");
	}
	
	public void enterEmail() {
		emailTextBox.sendKeys("yokesh@gmail.com");
	}
	
	public void enterPassword() {
		passwordTextBox.sendKeys("pass@123");
	}
	
	public void clickRegisterBtn() {
		registerBtn.click();
	}
}
