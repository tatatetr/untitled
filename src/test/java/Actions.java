import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;


public class Actions {

    @Test
    public void actionTests() {

        open("https://www.facebook.com/");
        $(byText("Create new account")).click();
        $(byName("firstname")).setValue("Tamta");
        $(byName("lastname")).setValue("Tetruashvili");
        $(byName("reg_email__")).setValue("tatatetr@gmail.com");
        $(byName("reg_passwd__")).setValue("Tamta123456@");
        $(byName("birthday_month")).selectOption("Dec");
        $(byName("birthday_day")).selectOption("9");
        $(byName("birthday_year")).selectOption("1996");
        $(byText("Custom")).click();

        SelenideElement pronoun = $(byName("preferred_pronoun"));
        pronoun.shouldBe(visible);

        SelenideElement customgender = $(byName("custom_gender"));
        customgender.shouldBe(visible);

        $(byName("preferred_pronoun")).selectOption("She: \"Wish her a happy birthday!\"");
        $(byText("Female")).click();

        pronoun.shouldBe(hidden);
        customgender.shouldBe(hidden);


        sleep(4000);


    }
}
