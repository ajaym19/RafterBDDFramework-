package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/Features",
		glue = "StepDefnitions",
		dryRun = false,
		monochrome = true,
		tags = ("~@Smoke"),
		plugin = {"pretty","html:Reports/HTMLReport.html","junit:Reports/XMLReport.xml","json:Reports/JSONReport.html"}
		)

public class TestRunner {

	
}
