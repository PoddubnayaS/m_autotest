package project.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static com.codeborne.selenide.Selenide.$x;

public class CategoryPage extends AbstractPage {
	protected WebDriver webDriver;

	public CategoryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getSubCategoryLinkByText(String str) {
		return $x("//a/span[text() = '" + str + "']");
	}
}
