package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinations"},
        monochrome = true,
        tags = "@log10",
        plugin = {"pretty",
                "html:target/cucumber-html-report",
                "junit:target/cucumber-report/cucumber.xml"
                }

)
public class CucumberTestRunner
{

}
