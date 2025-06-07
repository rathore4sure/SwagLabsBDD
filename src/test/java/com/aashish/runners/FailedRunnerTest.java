package com.aashish.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target",
        glue = {"com.aashish.stepdefinitions","com.aashish.hooks"},
        tags = "",
        dryRun = false,
        plugin = {"pretty",
                "html:target/cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/failedtests.txt"}
)

public class FailedRunnerTest extends AbstractTestNGCucumberTests{


}
