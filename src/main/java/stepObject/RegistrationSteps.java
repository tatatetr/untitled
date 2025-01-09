package stepObject;

import pageObject.RegistrationPage;

public class RegistrationSteps extends RegistrationPage {



    public RegistrationSteps goToRegistrationPage () {

       regBtn.click();

        return this;

    }

    public RegistrationSteps setMail(String emailInput) {

        emailInp.setValue(emailInput);

        return this;

    }


    public RegistrationSteps setPass(String passInput) {

        passwordInp.setValue(passInput);

        return this;

    }

    public RegistrationSteps setDate(String bDayInput) {

        bDayInp.setValue(bDayInput);

        return this;

    }


    public RegistrationSteps ClickShowPass() {

        showPassBtn.click();

        return this;

    }

    public RegistrationSteps ClickSubmit() {

        submitBtn.click();

        return this;

    }
}