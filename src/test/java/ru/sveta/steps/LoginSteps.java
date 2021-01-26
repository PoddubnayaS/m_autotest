package ru.sveta.steps;

import cucumber.api.java.ru.*;
import ru.sveta.poms.LoginPage;
import ru.sveta.poms.UtilsPage;

public class LoginSteps {
	@Дано("^открыть главную страницу$")
	public void openMainPage() {
		LoginPage.openPage();
	}

	@Если("^нажать на ссылку 'Вход или Регистрация'$")
	public void openForm() {
		LoginPage.openForm();
	}

	@Если("^нажать на ссылку 'Вход по e-mail/логину/бонусной карте'$")
	public void chooseLoginByEmail() {
		LoginPage.chooseLoginByEmail();
	}

	@Если("^авторизоваться под логином (.*) и паролем (.*)$")
	public void loginBy(String login, String pass) {
		LoginPage.inputLogin(login);
		LoginPage.inputPassword(pass);
	}

	@Если("^нажать на кпопку \"([^\"]*)\"$")
	public void clickButton(String str) {
		//LoginPage.submitForm();
		UtilsPage.clickElement(str);
		LoginPage.checkCaptcha();
		UtilsPage.clickElement(str);
	}

	@То("^открыта главная страница$")
	public void checkMainUrl() {
		LoginPage.checkUrl();
	}

	@То("^пользователь авторизован$")
	public void checkAuthorized() {
		LoginPage.checkAuthorized();
	}

	@То("^пользователь не авторизован$")
	public void checkNotAuthorized() {
	    LoginPage.checkLabelErrorpass();
	}
}
