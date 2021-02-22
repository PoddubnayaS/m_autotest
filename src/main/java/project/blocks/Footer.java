package project.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Группа селекторов блока Футера
 */
public class Footer {
	// Родительский элемент футера
	public static WebElement getContainer() {
		return $("footer");
	}

	// Поле подписки
	public static WebElement getSubscribeInput () {
		By by = By.cssSelector("input[name=\"email\"]");
		return Footer.getContainer().findElement(by);
	}

	// Кнопка подписки
	public static WebElement getSubscribeButton () {
		By by = By.cssSelector("button[type=\"submit\"]");
		return Footer.getContainer().findElement(by);
	}
}
