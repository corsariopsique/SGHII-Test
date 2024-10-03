package com.SGHII_APP.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id="username")
    protected WebElementFacade txt_username;

    @FindBy(id="password")
    protected WebElementFacade txt_password;

    @FindBy(id="btn-form")
    protected WebElementFacade btn_ingreso;

}
