package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFileFolder/demo.feature" }, 
		glue = {
		"com.StepDefination" }, 
		monochrome = true, // it will display the output console in proper readable format
		dryRun = false, // it will check mapping between feature file and step definition

		plugin = { "json:target/abc.json",
				"junit:target/xyz.xml",
				"html:target/abc.html",
				"pretty:target/abc.txt",
				"pretty:target/abc.pdf"}

)
public class HomePageTestRunner {

}
