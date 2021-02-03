package ru.project.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
	features="src/test/features",
	glue= {"ru/project/hooks", "ru/project/steps"},
	tags = "@all",
	snippets = SnippetType.CAMELCASE,
	plugin = {
		"pretty",
		"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
	}
)

public class RunTest extends AbstractTestNGCucumberTests {

}
