package com.Swiggy.TestSteps;

import org.openqa.selenium.edge.EdgeDriver;

import com.Swiggy.Pages.CheckoutPage;
import com.Swiggy.Pages.DishesAndCartPage;
import com.Swiggy.Pages.LandingPage;
import com.Swiggy.Pages.SearchResultsRestaurant;

import utils.Tools;

public class Driver extends Tools {
	protected static LandingPage landingPage;
	protected static SearchResultsRestaurant searchResultsRestaurant;
	protected static DishesAndCartPage dishesAndCartPage;
	protected static CheckoutPage checkoutPage;

	public static void init() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://swiggy.com");
		landingPage = new LandingPage(driver);
		searchResultsRestaurant = new SearchResultsRestaurant(driver);
		dishesAndCartPage = new DishesAndCartPage(driver);
		checkoutPage = new CheckoutPage(driver);
	}

}
