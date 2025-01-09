package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public SelenideElement

    regBtn = $(byAttribute("data-test-id", "simple-signup-button")),
    emailInp = $(byId("email")),
    passwordInp = $(byId("password")),
    showPassBtn = $(byAttribute("aria-label", "Show password")),
    bDayInp = $(byAttribute("autocomplete", "bday")),
    submitBtn = $(byAttribute("type", "submit"));





}
