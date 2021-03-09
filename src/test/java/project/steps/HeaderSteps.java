package project.steps;

import cucumber.api.java.ru.Если;
import org.openqa.selenium.WebElement;
import project.blocks.Header;
import project.util.Util;

public class HeaderSteps {

	@Если("выполнить поиск в хедере с запросом (.*)")
	public void searchBySku(String sku) {
		Header.searchBySku(sku);
	}

	@Если("нажать на кнопку \"Найти\"")
	public void clickOnSearchButton() {
		WebElement el = Header.getSearchButton();
		Util.clickOnElement(el);
	}
}
