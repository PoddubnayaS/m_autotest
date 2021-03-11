package project.steps;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import cucumber.api.java.ru.То;
import org.testng.Assert;
import project.pages.CartPage;

import static com.codeborne.selenide.WebDriverRunner.url;

public class CartSteps {

	@То("открыта Корзина")
	public void cartPageIsOpen() {
		Selenide.sleep(1000);
		String url = url();
		Assert.assertTrue(url.endsWith("/personal/basket.php"));
	}

	@То("на странице Корзина отображается {int} товара")
	public void cartContainElements(Integer count) {
		CartPage.getCartElements().shouldHave(CollectionCondition.size(count));
	}
}


