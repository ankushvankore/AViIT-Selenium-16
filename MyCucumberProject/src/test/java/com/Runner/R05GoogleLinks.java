package com.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/F05GoogleLinks.feature",
        glue = "com.StepDefinition",
        tags = "@AllLinks",
        publish = true)
public class R05GoogleLinks {
    /*
    Execute Single Scenario:        tags = "@StoreLink"
    Execute Multiple Scenarios:     tags = "@StoreLink or @SmokeTest"
    Skip Single Scenario:           tags = "not @SmokeTest"
    Skip Multiple Scenarios:        tags = "not @SmokeTest and not @GmailTest"
     */
}
