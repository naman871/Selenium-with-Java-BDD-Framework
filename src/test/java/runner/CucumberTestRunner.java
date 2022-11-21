package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepdefinitions"},
        monochrome = true,
        plugin = {"pretty",
                "html:target/cucumber-html-report",
                "junit:target/cucumber-report/cucumber.xml"
                }

)
public class CucumberTestRunner
{

}
