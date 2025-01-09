import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;


public class Case1 {


    @Test
    public void Project1() {
// პინტერესტის კონკრეტული რეცეპტის ფეიჯზე შევამოწმე, თუ გამოჩნდა რეცეპტის დასახელება,"Make it" ღილაკი,სურათი და "Save" ღილაკი.
// დავაკლიკე "Save" ღილაკზე და რადგან დალოგინებული არ ვარ, გამომიტანა log in ფეიჯი. შევამოწმე თუ გამოჩნდა sign up options.

        SoftAssert softAssert = new SoftAssert();
        open("https://www.pinterest.com/pin/1135470124794264693/");

        $(byAttribute("data-test-id", "pinTitle")).shouldBe(visible);

        SelenideElement name = $(byAttribute("data-test-id", "pinTitle"));
        softAssert.assertTrue(name.isDisplayed(), "Check if name is displayed");

        SelenideElement makeItbtn = $(byAttribute("aria-label", "Make it"));
        softAssert.assertTrue(makeItbtn.isDisplayed(), "Check if make it button is displayed");

        SelenideElement image = $(byAttribute("elementtiming", "closeupImage"));
        softAssert.assertTrue(image.isDisplayed(), "Check if image is displayed");

        SelenideElement saveBtn = $(byTitle("Save"));
        softAssert.assertTrue(saveBtn.isDisplayed(), "Check if save button is displayed");


        $(byTitle("Save")).click();

        sleep(4000);

        SelenideElement signUpoption = $(byAttribute("data-test-id", "signup-options"));
        softAssert.assertTrue(signUpoption.isDisplayed(), "After clicking save button sign up options must be appeared");

        softAssert.assertAll();
    }


}
