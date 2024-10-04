package com.SGHII_APP.co.pages.dashboard;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DashboardPage extends PageObject {

    @FindBy(xpath = "//li[@class='nav-item contitembar']//p[text()='Panel Principal']")
    protected WebElementFacade btn_Dashboard;

}
