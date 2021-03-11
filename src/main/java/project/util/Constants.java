package project.util;

public final class Constants {
	/**
	 * Properties
	 */
	public static final String RUN_CONFIG = "config.properties";

	/**
	 * Production stage url
	 */
	public static final String PROD_URL = Util.getRunConfigProperty("prod_url");

	public static final String CHROME_DRIVER = Util.getRunConfigProperty("chromedriver");

	public static final String CHROME_DRIVER_PATH = Util.getRunConfigProperty("chromedriver_path");

	public static final String FIREFOX_DRIVER = Util.getRunConfigProperty("firefoxdriver");

	public static final String FIREFOX_DRIVER_PATH = Util.getRunConfigProperty("firefoxdriver_path");
}
