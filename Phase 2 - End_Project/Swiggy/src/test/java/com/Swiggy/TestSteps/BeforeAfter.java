package com.Swiggy.TestSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Tools;

public class BeforeAfter extends Tools {

	@Before
	public void setup(Scenario scenario) {
		Driver.init();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
