package project.pages;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Selenide.$$;

public class CartPage {
	// Блоки товаров в корзине
	public static ElementsCollection getCartElements() {
		return $$("div[data-basket-id]");
	}
}
