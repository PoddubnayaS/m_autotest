package project.steps;

import com.codeborne.selenide.WebDriverRunner;
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
public class PlpSteps {
	DepartmentPage departmentPage;
	CategoryPage categoryPage;

	public PlpSteps () {
		WebDriver webDriver = WebDriverRunner.getWebDriver();

		departmentPage = new DepartmentPage(webDriver);
		categoryPage = new CategoryPage(webDriver);
	}

	@То("страница департамента (.*) открыта")
	public void departmentPageIsOpen(String str) {
		Assert.assertEquals(departmentPage.getPageHeaderText(), str);
	}

	@И("нажать на категорию (.*)$")
	public void clickOnCategory(String str) {
		WebElement el = departmentPage.getCategoryLinkByText(str);
		Util.clickOnElement(el);
	}

	@То("страница категории (.*) открыта")
	public void categoryPageIsOpen(String str) {
		Assert.assertEquals(categoryPage.getPageHeaderText(), str);
	}

	@То("нажать на субкатегорию (.*)$")
	public void clickOnSubCategory(String str) {
		WebElement el = categoryPage.getSubCategoryLinkByText(str);
		Util.clickOnElement(el);
	}
}
