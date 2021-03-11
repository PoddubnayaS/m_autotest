package project.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.commands.Commands;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import project.commands.SafeClick;
import project.util.DriverProvider;

import java.util.concurrent.TimeUnit;

public class Hooks {
	WebDriver driver;

	/**
	 * Конфигурируем окно браузера
	 */
	@Before (value="@plp")
	public void initTestSuite() {
		Commands.getInstance().add("click", new SafeClick());

		driver = DriverProvider.get(System.getProperty("webDriver", "chrome"));

		driver.manage().window().maximize(); //.setSize(new Dimension(1900, 600));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverRunner.setWebDriver(driver);
		//Configuration.clickViaJs = true;
	}

	/**
	 * Не закрываем окно браузера после выполнения теста, очищаем куки
	 */
	@After (value = "@all")
	public void notCloseBrowser() {
		Configuration.holdBrowserOpen = true;
	}
}
