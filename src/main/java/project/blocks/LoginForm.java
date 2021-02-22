package project.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Selenide.$;

/**
 * Группа селекторов блока Логина
 */
public class LoginForm {
	public static WebElement getContainer() {
		return $("[data-dy=\"authorization-popup\"]");
	}

	public static WebElement getLoginByEmail() {
		By by = By.xpath("//button[contains(text(),'Вход по e-mail/логину/бонусной карте')]");
		return LoginForm.getContainer().findElement(by);
	}

	public static WebElement getLoginInput() {
		return LoginForm.getContainer().findElement(By.cssSelector("input[name='login']"));
	}

	public static WebElement getPasswordInput () {
		return LoginForm.getContainer().findElement(By.cssSelector("input[name='password']"));
	}

	public static WebElement getSubmitButton () {
		By by = By.xpath("//button[contains(text(),'Войти')]");
		return LoginForm.getContainer().findElement(by);
	}

	public static WebElement getPassErrorMessage() {
		By by = By.xpath("//*[contains(text(),'Неверный пароль')]");
		return LoginForm.getContainer().findElement(by);
	}
}
