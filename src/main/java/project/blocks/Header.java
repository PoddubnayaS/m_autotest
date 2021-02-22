package project.blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

/**
 * Группа селекторов блока Хедера
 */
public class Header {
	// Родительский элемент хедера
	public static WebElement getContainer() {
		return $("header");
	}

	// Вход или регистрация
	public static WebElement getLoginActivator () {
		//return $x("//button[contains(text(),'Вход или регистрация')]");
		By by = By.xpath("//button[contains(text(),'Вход или регистрация')]");
		return Header.getContainer().findElement(by);
	}

	// Профиль
	public static WebElement getProfileElement () {
		//return $("a[href=\"/personal/\"]");
		By by = By.cssSelector("a[href=\"/personal/\"]");
		return Header.getContainer().findElement(by);
	}

	// Строка поиска
	public static WebElement getSearchInput () {
		//return $("[data-dy=\"search\"] input[name=\"search\"]");
		By by = By.cssSelector("[data-dy=\"search\"] input[name=\"search\"]");
		return Header.getContainer().findElement(by);
	}

	// Кнопка поиск
	public static WebElement getSearchButton () {
		//return $("[data-dy=\"search\"] button");
		By by = By.cssSelector("[data-dy=\"search\"] button");
		return Header.getContainer().findElement(by);
	}

	//Департамент
	public static WebElement getDepartmentByName (String text) {
		By by = By.xpath("//a[contains(text(),'" + text + "')]");
		return Header.getContainer().findElement(by);
	}
}
