package project.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "src/test/features",
		glue = {"project/hooks", "project/steps"},
		tags = "@pdp",
		snippets = SnippetType.CAMELCASE,
		plugin = {
				"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
				"pretty"
		}
)

public class RunTest extends AbstractTestNGCucumberTests {

}
