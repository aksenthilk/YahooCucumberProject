package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="G:\\SeleniumCucumberWorkSpace\\Yahoo\\src\\main\\java\\FeatureFile\\Login.feature",
                 glue = {"StepDefinitions"},
                 plugin = {"pretty","html:target/myreport","json:target\\json\\output.json","com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
                 dryRun = false
                 //,tags={"@Justanswer"}
                )

public class RunnerTest{

}
