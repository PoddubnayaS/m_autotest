package project.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static project.util.Constants.*;

public class DriverProvider {
	public static WebDriver get(String code) {
		switch (code) {
			case "chrome":
				System.setProperty(CHROME_DRIVER, CHROME_DRIVER_PATH);
				ChromeOptions chOpts = new ChromeOptions();
				chOpts.addArguments("--disable-notifications");
				return new ChromeDriver(chOpts);

			case "firefox":
				System.setProperty(FIREFOX_DRIVER, FIREFOX_DRIVER_PATH);
				FirefoxOptions fiOpts = new FirefoxOptions();
				fiOpts.addArguments("--disable-notifications");
				return new FirefoxDriver(fiOpts);
		}

		return null;
	}
}
