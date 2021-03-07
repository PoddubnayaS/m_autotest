package project.steps;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.То;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import project.pages.CategoryPage;
import project.pages.DepartmentPage;
import project.util.Util;

/**
 * Реализация шагов для PLP
 */
public class PdpSteps {
	DepartmentPage departmentPage;
	CategoryPage categoryPage;

	public PdpSteps() {
		WebDriver webDriver = WebDriverRunner.getWebDriver();

		departmentPage = new DepartmentPage(webDriver);
		categoryPage = new CategoryPage(webDriver);
	}

	@Если("выполнить поиск в хедере с запросом {int}")
	public void выполнитьПоискВХедереСЗапросом(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Если("нажать на кнопку {string}")
	public void нажатьНаКнопку(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Если("в хедере нажать на {string}")
	public void вХедереНажатьНа(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Если("открыта Корзина")
	public void открытаКорзина() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Если("на странице Корзина отображается {int} товара")
	public void наСтраницеКорзинаОтображаетсяТовара(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}
}
