package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="G:\\SeleniumCucumberWorkSpace\\Yahoo\\src\\test\\java\\FeatureFile\\Login.feature",
                 glue = {"StepDefinitions"},
                 dryRun = false)

public class Runner {

}
