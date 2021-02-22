package project.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import project.blocks.Header;
import project.blocks.LoginForm;
import project.util.Constants;
import project.util.Util;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * Главная страница сайта Эльдорадо
 */

public class MainPage extends AbstractPage {
	protected WebDriver webDriver;

	public MainPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	public void openPage() {
		open(Constants.PROD_URL);
	}

	public void openLoginForm() {
		WebElement el = Header.getLoginActivator();
		Util.clickOnElement(el);
	}

	public void chooseLoginByEmail() {
		WebElement el = LoginForm.getLoginByEmail();
		Util.clickOnElement(el);
	}

	public void inputLogin(String login) {
		WebElement el = LoginForm.getLoginInput();
		Selenide.$(el).setValue(login);
	}

	public void inputPassword(String pass) {
		WebElement el = LoginForm.getPasswordInput();
		Selenide.$(el).setValue(pass);
	}

	public void submitLoginForm() {
		WebElement el = LoginForm.getSubmitButton();
		Util.clickOnElement(el);
	}

	public void checkUrl() {
		Assert.assertEquals(Constants.PROD_URL, url());
	}

	public void checkAuthorized() {
		WebElement el = Header.getProfileElement();
		Assert.assertTrue(el.isDisplayed());
	}

	public void checkLabelErrorPass() {
		WebElement el = LoginForm.getPassErrorMessage();
	  Assert.assertTrue(el.isDisplayed());
	}
}

