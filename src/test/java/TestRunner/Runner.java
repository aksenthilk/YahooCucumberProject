package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="G:\\SeleniumCucumberWorkSpace\\Yahoo\\src\\test\\java\\FeatureFile\\Login.feature",
                 glue = {"StepDefinitions"},
                 format = {"pretty","html:test-output","json:target\\json\\output.json"}
                )

public class Runner {

}
