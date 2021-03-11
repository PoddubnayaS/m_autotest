package project.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.То;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import project.blocks.Header;
import project.pages.CategoryPage;
import project.pages.DepartmentPage;
import project.pages.Pdp;
import project.util.Util;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

/**
 * Реализация шагов для PLP
 */
public class PdpSteps {
	Pdp page;

	public PdpSteps() {
		WebDriver webDriver = WebDriverRunner.getWebDriver();
		page = new Pdp(webDriver);
	}

	@Если("нажать на кнопку \"Добавить в корзину\"")
	public void clickOnAddToCartButton() {
		// try fix StaleElementReferenceException
		Selenide.sleep(1000);

		//WebElement el = Pdp.getAddToCartButton();
		WebElement el = page.addToCartButton;
		Util.clickOnElement(el);
	}

	@Если("в хедере нажать на \"Корзина\"")
	public void clickOnCart() {
		Selenide.sleep(1000);
		WebElement el = Header.getCart();
		Util.clickOnElement(el);
	}

}
