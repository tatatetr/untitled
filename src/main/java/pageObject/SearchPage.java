package pageObject;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    public SelenideElement

            goToExplore = $(byAttribute("href", "/ideas/"));
    public static SelenideElement searchInp = $(byName("searchBoxInput"));
    public static SelenideElement headerElement = $(byAttribute("data-test-id", "header"));
    public static SelenideElement picElement = $(byAttribute("data-test-id", "pin"));
    public SelenideElement clickX = $(byAttribute("aria-hidden", "true"));

}
