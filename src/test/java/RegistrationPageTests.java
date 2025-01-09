
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import stepObject.RegistrationSteps;
import utils.ChromeRunner;

import static dataObject.RegistrationPageData.*;

public class RegistrationPageTests extends ChromeRunner {
    RegistrationSteps registrationSteps = new RegistrationSteps();


    @Test
    public void RegistrationSuccess() {
        SoftAssert softAssert = new SoftAssert();
        registrationSteps
                .goToRegistrationPage()
                .setMail(emailInput)
                .setPass(passInput)
                .setDate(bDayInput)
                .ClickShowPass()
                .ClickSubmit();


        softAssert.assertTrue(registrationSteps.regBtn.is(Condition.enabled));
        softAssert.assertFalse(registrationSteps.emailInp.is(Condition.empty),"Check email input");
        softAssert.assertFalse(registrationSteps.passwordInp.is(Condition.empty),"Check password input");
        softAssert.assertFalse(registrationSteps.bDayInp.is(Condition.empty),"Check birth day input");
        softAssert.assertTrue(registrationSteps.submitBtn.is(Condition.enabled),"Check if submit button is active");
        softAssert.assertAll();
    }

}
