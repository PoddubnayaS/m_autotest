package ru.sveta;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features="src/test/features/login.features",
	glue="ru/sveta/steps",
	tags = "@all",
	snippets = SnippetType.CAMELCASE,
	plugin = {
		"pretty",
		"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
	}
)

public class RunTest extends AbstractTestNGCucumberTests {
}
