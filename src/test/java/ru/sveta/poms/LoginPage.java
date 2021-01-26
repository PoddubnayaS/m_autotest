package ru.sveta.poms;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class LoginPage {
	private static String mainRoute = "https://www.eldorado.ru/";

	public static void init() {
		Configuration.browser = "chrome";
		Configuration.timeout = 10000;
	}

	public static void openPage() {
		open(LoginPage.mainRoute);
	}

	public static void openForm() {
		$x("//span[contains(text(),'Вход или регистрация')]").click();
	}

	public static void chooseLoginByEmail() {
		//$x("//button[contains(text(),'Вход по e-mail/логину/бонусной карте')]").click();
		$(".bmyLlk").click();
	}

	public static void inputLogin(String login) {
		$("input[name='login']").setValue(login);
	}

	public static void inputPassword(String pass) {
		$("input[name='password']").setValue(pass);
	}

	public static void submitForm() {
		$x("//button[contains(text(),'Войти')]").click();
	}

	public static void checkCaptcha() {
//		$(".recaptcha-checkbox").click();

		switchTo().frame($x("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]"));

		$("div.rc-anchor-content").click();

		switchTo().defaultContent();
	}

	public static void checkUrl() {
		Assert.assertEquals(LoginPage.mainRoute, url());
	}

	public static void checkAuthorized() {
//		WebElement el = $("a[href=\"/personal/\"]");
		WebElement el = $x("//span[contains(text(),'Светлана')]");
		Assert.assertTrue(el.isDisplayed());
	}

	public static void checkLabelErrorpass() {
		WebElement el = $x("//*[contains(text(),'Неверный пароль')]");
		Assert.assertTrue(el.isDisplayed());
	}
}

