package com.aashish.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/Login.feature",
        glue = {"com.aashish.stepdefinitions","com.aashish.hooks"},
        tags = "",
        dryRun = false,
        plugin = {"pretty", "html:target/cucumberreport.html"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
