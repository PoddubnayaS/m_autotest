package project.actions;

import com.codeborne.selenide.WebDriverRunner;
import javax.annotation.ParametersAreNonnullByDefault;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

@ParametersAreNonnullByDefault
public class CommonActions {

    public static void removeDivsWithBaners() {
        if (WebDriverRunner.hasWebDriverStarted()) {
            if ($(".flocktory-widget-overlay").is(exist)) {
                while ($(".flocktory-widget-overlay").is(exist)) {
                    executeJavaScript(
                        "return document.getElementsByClassName('flocktory-widget-overlay')[0].remove();");
                }
            }

            if ($(".flocktory-widget").is(exist)) {
                while ($(".flocktory-widget").is(exist)) {
                    executeJavaScript("return document.getElementsByClassName('flocktory-widget')[0].remove();");
                }
            }

            if ($(".uxs-slide-back").is(exist)) {
                while ($(".uxs-slide-back").is(exist)) {
                    executeJavaScript("return document.getElementsByClassName('uxs-slide-back')[0].remove();");
                }
            }

            if ($(".digi-autocomplete-container").is(exist)) {
                while ($(".digi-autocomplete-container").is(exist)) {
                    executeJavaScript("return document.getElementsByClassName('digi-autocomplete-container')[0].remove();");
                }
            }
        }
    }
}
