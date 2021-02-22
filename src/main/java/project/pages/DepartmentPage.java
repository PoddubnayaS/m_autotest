package project.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPage extends AbstractPage {
	protected WebDriver webDriver;

	public DepartmentPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	public WebElement getCategoryLinkByText(String str) {
		return getLinkByEqualText(str);
	}
}
