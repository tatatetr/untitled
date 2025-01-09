package stepObject;

import dataObject.SearchPageData;
import pageObject.SearchPage;


public class SearchSteps extends SearchPage {

    public SearchSteps goToExplorePage() {

        goToExplore.click();

        return this;
    }


    public SearchSteps setInputText(String searchInput) {

        searchInp.setValue(SearchPageData.searchInput).pressEnter();

        return this;
    }

    public SearchSteps deleteInput() {

        clickX.click();

        return this;
    }


}









