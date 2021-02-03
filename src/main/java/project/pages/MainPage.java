package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import project.util.Constants;

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
		$x("//span[contains(text(),'Вход или регистрация')]").click();
	}

	public void chooseLoginByEmail() {
		//$x("//button[contains(text(),'Вход по e-mail/логину/бонусной карте')]").click();
		$(".bmyLlk").click();
	}

	public void inputLogin(String login) {
		$("input[name='login']").setValue(login);
	}

	public void inputPassword(String pass) {
		$("input[name='password']").setValue(pass);
	}

	public void submitLoginForm() {
		$x("//button[contains(text(),'Войти')]").click();
	}

	public void checkCaptcha() {
//		$(".recaptcha-checkbox").click();
		switchTo().frame($x("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]"));
		$("div.rc-anchor-content").click();
		switchTo().defaultContent();
	}

	public void checkUrl() {
		Assert.assertEquals(Constants.PROD_URL, url());
	}

	public void checkAuthorized() {
		WebElement el = $("a[href=\"/personal/\"]");
//		WebElement el = $x("//span[contains(text(),'Светлана')]");
//		Assert.assertTrue(el.isDisplayed());
	}

	public void checkLabelErrorPass() {
		WebElement el = $x("//*[contains(text(),'Неверный пароль')]");
	//		Assert.assertTrue(el.isDisplayed());
	}
}

