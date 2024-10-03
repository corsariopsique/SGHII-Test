package com.SGHII_APP.co.steps.login;

import com.SGHII_APP.co.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar usuario")
    public void tipeaNombreUsuario(String username) {txt_username.sendKeys(username);}

    @Step("Ingresar password")
    public void tipeaPassword(String password) { txt_password.sendKeys(password);}

    @Step("Hacer clic en el boton")
    public void clickIngresar(){ btn_ingreso.click();}

}
