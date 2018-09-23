package com.qa.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;





		
	@RunWith(Cucumber.class)
	
	@CucumberOptions(features="C:/Users/sony/eclipse-workspace/CucumberPageObjectModel/src/main/java/com/qa/features/FreeCRM.feature",
	//@CucumberOptions(features={"C:/WorkSpaceSeleniumSelf/Ecommerce/src/main/java/Featured/login.feature", "C:/WorkSpaceSeleniumSelf/Ecommerce/src/main/java/Featured/Deals.feature"},
	glue={"com/qa/StepDefinitions"}, 

	format={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
	monochrome=true,
	strict=true,
	dryRun=false)
	//tags={"~@SmokeTest", "~@RegressionTest"})

	public class TestRunner {

	}


