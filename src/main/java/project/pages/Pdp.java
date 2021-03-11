package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pdp {
	protected WebDriver webDriver;

	public Pdp(WebDriver webDriver) {
		this.webDriver = webDriver;
		PageFactory.initElements(webDriver, this);
	}

	// Родительский элемент pdp
	@FindBy(css = "#listing-container")
	private WebElement container;

	// Кнопка добавить в корзину
	@FindBy(css = "#listing-container button[data-dy=\"button\"]")
	public WebElement addToCartButton;
}
