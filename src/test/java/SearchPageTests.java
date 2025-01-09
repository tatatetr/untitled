import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObject.SearchPage;
import stepObject.RegistrationSteps;
import stepObject.SearchSteps;
import utils.ChromeRunner;

import static dataObject.RegistrationPageData.*;
import static dataObject.SearchPageData.*;


public class SearchPageTests extends ChromeRunner {

    SearchSteps searchSteps = new SearchSteps();

    @Test
    public void SearchSuccess() {
        SoftAssert softAssert = new SoftAssert();
        searchSteps

                .goToExplorePage()
                .setInputText(searchInput)
                .deleteInput();
        softAssert.assertTrue(SearchSteps.searchInp.is(Condition.empty), "Check if search box is empty ");


        softAssert.assertAll();
    }

}
