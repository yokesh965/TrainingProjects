package com.Swiggy.TestSteps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features", glue = "com.Swiggy.TestSteps")

public class TestRunner extends AbstractTestNGCucumberTests {

}
