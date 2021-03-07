package project.steps;

import static com.codeborne.selenide.WebDriverRunner.url;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import project.blocks.Header;
import project.util.Util;

/**
 * Реализация шагов
 */

public class BaseSteps {
	@Если("нажать в Хедере на департамент (.*)$")
	public void clickOnDepartment(String department) {
		WebElement el = Header.getDepartmentByName(department);
		Util.clickOnElement(el);
	}

	@Тогда("текущая ссылка заканчивается на текст \"(.*?)\"$")
	public void currentUrlEndByText(String str) {
		Selenide.sleep(1000); //Util.waitUntilPageCompleteLoad();
		String url = url();
		Assert.assertTrue(url.endsWith(str));
	}
}
