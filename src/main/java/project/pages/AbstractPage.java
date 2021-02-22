package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Базовый класс для классов объектов страницы
 */
public abstract class AbstractPage {
    protected WebDriver webDriver;

    public AbstractPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public String getPageHeaderText () {
        return $("h1").text();
    }

    public WebElement getLinkByEqualText(String str) {
        return $x("//a[text() = '" + str + "']");
    }
}
