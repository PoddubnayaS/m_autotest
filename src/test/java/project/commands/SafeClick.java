package project.commands;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.Click;
import org.openqa.selenium.WebElement;
import project.actions.CommonActions;

import javax.annotation.ParametersAreNonnullByDefault;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static project.commands.CustomCommands.scrollIntoViewCenter;

@ParametersAreNonnullByDefault
public class SafeClick extends Click {

    @Override
    protected void click(Driver driver, WebElement element) {
        if (driver.config().clickViaJs()) {
            driver.executeJavaScript("arguments[0].click()", element);
        } else {
            try {
                element.click();
            } catch (Exception | Error e) {
                try {
                    CommonActions.removeDivsWithBaners();
                    ElementsCollection banners = $$(".flocktory-widget").filter(appear);
                    if (banners.size() > 0) {
                        banners.forEach(banner -> {
                            switchTo().frame(banner);

                            List<String> list = new ArrayList<>();
                            list.add(".PushTip-close");
                            list.add(".Widget-close");
                            list.add(".close");

                            for(String selector : list){
                                SelenideElement el = $(selector);
                                if (el.is(visible)) {
                                    el.click();
                                }
                            }

                            switchTo().defaultContent();
                        });
                    } else {
                        $(element).scrollIntoView("{block: \"end\"}");
                    }
                    element.click();
                } catch (Exception | Error ex) {
                    $(element).execute(scrollIntoViewCenter).click();
                }
            }
        }
    }
}