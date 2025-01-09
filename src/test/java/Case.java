import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.*;

public class Case {


    @Test
    public void Project() {
// Pinterest- ზე სერჩის ფუნქციის შემოწმება, დასერჩილ გვერდზე შევამოწმე გამოჩნდა თუ არა Header, სადაც თემასთან მიახლოებულ თემებზე ფილტრს გვთავაზობს და ასევე გამოჩნდა, თუ არა ფოტოები.
        // Search bar ზე დავაკლიკე X ღილაკს და შევამოწმე თუ წაიშალა ინფუთი და დარჩა ცარიელი

        SoftAssert softAssert = new SoftAssert();

        open("https://www.pinterest.com/");
        sleep(4000);
$(byAttribute("href","/ideas/")).click();
        SelenideElement SearchInput = $(byName("searchBoxInput"));
        String TextValue = "Vegan food ideas";
        SearchInput.setValue(TextValue).pressEnter();

        sleep(4000);
        softAssert.assertEquals(SearchInput.getValue(), TextValue, "Check search input");


        SelenideElement HeaderElement = $(byAttribute("data-test-id", "header"));
        softAssert.assertTrue(HeaderElement.isDisplayed(), "Check if header is displayed");

        SelenideElement Pics = $(byAttribute("data-test-id", "pin"));
        softAssert.assertTrue(Pics.isDisplayed(), "Check if photos are displayed");


        $(byAttribute("aria-hidden", "true")).click();


        softAssert.assertTrue(SearchInput.is(empty), "Check if after deleting the text input is empty");




        softAssert.assertAll();
    }


}
