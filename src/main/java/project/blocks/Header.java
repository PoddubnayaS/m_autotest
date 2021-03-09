package project.blocks;

import com.codeborne.selenide.Selenide;
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
	public static WebElement getLoginActivator() {
		By by = By.xpath("//button[contains(text(),'Вход или регистрация')]");
		return Header.getContainer().findElement(by);
	}

	// Профиль
	public static WebElement getProfileElement() {
		By by = By.cssSelector("a[href=\"/personal/\"]");
		return Header.getContainer().findElement(by);
	}

	// Строка поиска
	public static WebElement getSearchInput() {
		By by = By.cssSelector("[data-dy=\"search\"] input[name=\"search\"]");
		return Header.getContainer().findElement(by);
	}

	// Кнопка поиск
	public static WebElement getSearchButton() {
		By by = By.cssSelector("[data-dy=\"search\"] button");
		return Header.getContainer().findElement(by);
	}

	//Департамент
	public static WebElement getDepartmentByName(String text) {
		By by = By.xpath("//a[contains(text(),'" + text + "')]");
		return Header.getContainer().findElement(by);
	}

	//Поиск в хедере по ску
	public static void searchBySku(String sku) {
		WebElement el = Header.getSearchInput();
		el.clear();
		Selenide.$(el).setValue(sku);
	}

	//Иконка корзины
	public static WebElement getCart() {
		By by = By.cssSelector("[data-dy=\"header-cart-counter\"]");
		return Header.getContainer().findElement(by);
	}
}
