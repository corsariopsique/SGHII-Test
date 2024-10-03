package com.SGHII_APP.co.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)

    PageObject sghiiTest;

    public void dirigirseA(String url){
        sghiiTest.setDefaultBaseUrl(url);
        sghiiTest.open();
    }

}
