package finalProject.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import finalProject.Pages.AddCartTextVerifyPage;
import finalProject.Pages.CartPage;
import finalProject.Pages.HomePage;
import finalProject.Pages.LandingPage;
import finalProject.Pages.LogoutPage;
import finalProject.Pages.PlaceOrderTextVerifyPage;
import finalProject.Pages.UserRegisterPage;

public class PlaceOrderPageTest extends BaseTest {

	@Test
	public void BuyShoes() throws InterruptedException {
		// Click on 'New User'
		LandingPage landingPage = new LandingPage(driver);
		landingPage.clickNewUser();

		// Register 'New User'
		UserRegisterPage userRegisterPage = new UserRegisterPage(driver);
		userRegisterPage.enterName();
		userRegisterPage.enterEmail();
		userRegisterPage.enterPassword();
		userRegisterPage.clickRegisterBtn();

		// Logout
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.clickLogoutBtn();

		// Login
		landingPage.enterLoginEmail();
		landingPage.enterLoginPassword();
		landingPage.clickLoginBtn();

		// Add Product in cart
		HomePage homePage = new HomePage(driver);
		homePage.clickAddToCartBtn();

		// Verify Add cart Text
		AddCartTextVerifyPage addCartTextVerifyPage = new AddCartTextVerifyPage(driver);
		String expectedText = "Message:Shoe BlueWave Running Shoes Added Successfully to Cart";
		String actualText = addCartTextVerifyPage.getMessageText();
		Assert.assertEquals(actualText, expectedText);
		addCartTextVerifyPage.clickHome();

		homePage.clickCart();

		CartPage cartPage = new CartPage(driver);
		cartPage.clickPlaceOrderBtn();

		// Verify Place order Text
		PlaceOrderTextVerifyPage placeOrderTextVerifyPage = new PlaceOrderTextVerifyPage(driver);
		String finalExpectedText = "Message:Order Placed Successfully with ID: 3";
		String finalActualText = placeOrderTextVerifyPage.getMessageText();
		Assert.assertEquals(finalActualText, finalExpectedText);
		addCartTextVerifyPage.clickHome();

	}

}
