package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeTest


    public void setUp() {

        //Configuration.headless = true;
        open("https://www.pinterest.com/");
    }
        @AfterTest

public void tearDown () {

            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();
            Selenide.closeWindow();
            Selenide.closeWebDriver();


        }



}
