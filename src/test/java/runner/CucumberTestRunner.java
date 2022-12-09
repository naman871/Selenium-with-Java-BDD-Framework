package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinitions"},
        monochrome = true,
        tags = "@log121",
        plugin = {"pretty",
                "html:target/cucumber-html-report",
                "junit:target/cucumber-report/cucumber.xml"
                }

)
public class CucumberTestRunner
{

}
