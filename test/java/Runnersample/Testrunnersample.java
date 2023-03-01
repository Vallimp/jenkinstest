package Runnersample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/featuresample",
					glue ="sampleproject",
                 	monochrome=true,
            plugin= {"pretty","html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
     "json:target/json-report/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun = false)
public class Testrunnersample {
	
}

