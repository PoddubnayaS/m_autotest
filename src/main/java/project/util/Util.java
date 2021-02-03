package project.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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

}
