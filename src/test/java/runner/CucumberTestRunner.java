package runner;

import static org.junit.Assert.assertTrue;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdefinitions"},
        monochrome = true,
        plugin = {"pretty","json:target/cucumber.json", "html:target/cucumber-html-report"}

)
public class CucumberTestRunner
{

}
