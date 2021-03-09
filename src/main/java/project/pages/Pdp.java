package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class Pdp {
	// Родительский элемент pdp
	public static WebElement getContainer() {
		return $("#listing-container");
	}

	public static WebElement getAddToCartButton () {
		By by = By.cssSelector("button[data-dy=\"button\"]");
		return Pdp.getContainer().findElement(by);
	}
}
