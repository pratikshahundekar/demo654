package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFileFolder/demo.feature"
				,"AllFeatureFileFolder/demo2.feature"
				,"AllFeatureFileFolder/login.feature"
				},
		
		glue= {"tutorial",
				"com.StepDefination"},
		monochrome=true,
		dryRun=true
		)
public class TestrunneradminAndPIMPage {

}
