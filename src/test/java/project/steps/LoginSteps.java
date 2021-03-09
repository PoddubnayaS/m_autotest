package project.steps;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.ru.*;
import project.pages.MainPage;

/**
 * Реализация шагов авторизации на сайте
 */

public class LoginSteps {
	private MainPage mainPage;

	@Дано("^открыть главную страницу$")
	public void openMainPage() {
		mainPage = new MainPage(WebDriverRunner.getWebDriver());
		mainPage.openPage();
	}

	@Если("^нажать на ссылку 'Вход или Регистрация'$")
	public void openForm() {
		mainPage.openLoginForm();
	}

	@Если("^нажать на ссылку 'Вход по e-mail/логину/бонусной карте'$")
	public void chooseLoginByEmail() {
		mainPage.chooseLoginByEmail();
	}

	@Если("^авторизоваться под логином (.*) и паролем (.*)$")
	public void loginBy(String login, String pass) {
		mainPage.inputLogin(login);
		mainPage.inputPassword(pass);
	}

	@Если("^нажать на кнопку \"Войти\"$")
	public void clickButton() {
		mainPage.submitLoginForm();
	}

	@То("^открыта главная страница$")
	public void checkMainUrl() {
		mainPage.checkUrl();
	}

	@То("^пользователь авторизован$")
	public void checkAuthorized() {
		mainPage.checkAuthorized();
	}

	@То("^пользователь не авторизован$")
	public void checkNotAuthorized() {
	    mainPage.checkLabelErrorPass();
	}
}
