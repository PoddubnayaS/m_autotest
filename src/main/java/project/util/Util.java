package project.util;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;

public class Util {

	/**
	 * Получить параметр из файла настроек
	 */
	public static String getProperty(String key, String resourceFileName) {
		InputStream inputStream = Util.class.getClassLoader().getResourceAsStream(resourceFileName);
		Properties properties = new Properties();
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

	/**
	 * Получить параметр из config.properties
	 */
	public static String getRunConfigProperty(String key) {
		return getProperty(key, Constants.RUN_CONFIG);
	}

	/**
	 * Клик по элементу
	 * Дополнительно вынуждены скрывать\прокликивать произвольно появляющиеся слои нотификации или подписки
	 *
	 * @param element
	 */
	public static void clickOnElement(WebElement element) {
		try {
			Selenide.$(element).click();
		} catch (Exception e) {
			$(".flocktory-widget-overlay:last-of-type").click();
			Selenide.$(element).click();
		}
	}

	public static void waitUntilPageCompleteLoad() {
		int maxPageLoadTime = 30000;
		while (!((JavascriptExecutor) WebDriverRunner.getWebDriver()).executeScript("return document.readyState").toString().equals("complete") && maxPageLoadTime > 0) {
			Selenide.sleep(300);
			maxPageLoadTime -= 300;
		}
	}
}
