import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;


public class Case2 {

    @Test

    public void Project2() {

// პინტერესტზე რეგისტრაციის გავლის ფლოუ

        SoftAssert softAssert = new SoftAssert();
        open("https://www.pinterest.com/");

        $(byAttribute("data-test-id", "simple-signup-button")).click();

        sleep(4000);

        SelenideElement email = $(byId("email"));
        String emailInput = "tatatetr@gmail.com";
        email.setValue(emailInput);
        softAssert.assertEquals(email.getValue(), emailInput, "Check email input");


        SelenideElement password = $(byId("password"));
        String passInput = "Tata123@";
        password.setValue(passInput);
        softAssert.assertEquals(password.getValue(), passInput, "Check password input");


        SelenideElement showPassBtn = $(byAttribute("aria-label", "Show password"));
        softAssert.assertTrue(showPassBtn.isEnabled());

        SelenideElement bDay = $(byAttribute("autocomplete", "bday"));
        String bDayInput = "12091996";
        bDay.setValue(bDayInput);
        sleep(4000);
        softAssert.assertEquals(bDay.getValue(), "1996-12-09", "Check birth day input");

        $(byAttribute("type", "submit")).click();

        // sleep(4000);


        softAssert.assertAll();
    }


}
