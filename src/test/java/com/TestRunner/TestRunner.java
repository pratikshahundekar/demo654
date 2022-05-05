package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFileFolder/registerPage.feature" }, 
		glue = {"Tutorial1" },
		monochrome = true,
		dryRun = false

)
public class TestRunner extends AbstractTestNGCucumberTests {

}
