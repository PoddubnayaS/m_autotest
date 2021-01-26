package ru.sveta.poms;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class UtilsPage {
	public static void clickElement(String str) {
		$x("//*[contains(text(),'" + str + "')]").click();
	}

	public static boolean inPage(String url) {
		return url() == url;
	}
}
