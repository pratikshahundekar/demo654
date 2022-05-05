package com.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features= {"AllFeatureFileFolder/demo3.feature"},
		glue= {"tutorial"},
		monochrome=true,
		dryRun=false
		
		)
public class testRunnertestng extends AbstractTestNGCucumberTests {

}
