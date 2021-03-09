package project.commands;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ScrollIntoView;
import com.codeborne.selenide.impl.WebElementSource;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ScrollIntoViewCenter extends ScrollIntoView {

    @Nonnull
    @Override
    public SelenideElement execute(SelenideElement proxy, WebElementSource locator, @Nullable Object[] args) {
        String[] center = new String[]{"{block: \"center\"}"};
        return (SelenideElement) super.execute(proxy, locator, center);
    }
}


