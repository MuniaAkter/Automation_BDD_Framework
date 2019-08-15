package com.meet.the.family.TestRunner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src/test/resources/features"},
glue = {"com.cucumber.stepdefinitions"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html "}
)


public class TestRunner {
	
	
	@AfterClass
	public static void setup() throws IOException{
		
	Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	Reporter.setSystemInfo("user", System.getProperty("user.name"));
	Reporter.setSystemInfo("os", "Mac OSX");
	Reporter.setTestRunnerOutput("Sample test runner output message");
	}
	}


