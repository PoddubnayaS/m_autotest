package project.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import static project.util.Constants.*;

public class Hooks {
	WebDriver driver;

	/**
	 * Конфигурируем окно браузера
	 */
	@Before (value="@all")
	public void initTestSuite() {
		System.setProperty(CHROME_DRIVER, CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
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

//	@After //(order = 10)
//	public void clearBrowserCookies() {
//		Selenide.clearBrowserCookies();
//	}
}
