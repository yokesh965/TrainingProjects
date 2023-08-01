package com.Swiggy.TestSteps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyTextSteps extends Driver {

	@Given("a user is on the landing page")
	public void a_user_is_on_the_landing_page() {

	}

	@When("he type the location and clicks 1st location")
	public void he_type_the_location_and_clicks_1st_location() {
		landingPage.enterlLocation("Hyderabad");
	}

	@When("he click 1st restaurant under Top restaurant chains in Hyderabad")
	public void he_click_1st_restaurant_under_top_restaurant_chains_in_hyderabad() {
		searchResultsRestaurant.clickFirstRestaurant();
	}

	@When("he clicks add button on first listed dish")
	public void he_clicks_add_button_on_first_listed_dish() {
		dishesAndCartPage.clickFirstRestaurant();
	}

	@When("hover over the cart icon in right top corner")
	public void hover_over_the_cart_icon_in_right_top_corner() throws InterruptedException {
		dishesAndCartPage.hoverOverCartIcon();
	}

	@When("he clicks Checkout button")
	public void he_clicks_checkout_button() {
		dishesAndCartPage.clickCheckout();
	}

	@Then("verify the text {string}")
	public void verify_the_text(String string) {
		String expectedText = string;
		String actualText = checkoutPage.verifyText();
		Assert.assertEquals(actualText, expectedText);
	}

}
