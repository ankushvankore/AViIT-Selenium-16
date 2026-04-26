package com.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/F02TestSearchLink.feature",
                        glue = "com.StepDefinition")
public class R02TestSearchLink {
}
