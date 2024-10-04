package com.SGHII_APP.co.pages.kits;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class KitPage extends PageObject {

    @FindBy(xpath = "//li[@class='nav-item contitembar']//p[text()='Kits']")
    protected WebElementFacade btn_Kits;

    @FindBy(xpath = "//button[@class='btn boton btn-outline-primary' and text()='Agregar Kit']")
    protected WebElementFacade btn_AgregarKit;

    @FindBy(xpath = "//input[@id='QQS7P' and @type='checkbox' and @name='tools_kits']")
    protected WebElementFacade item_Alicate;

    @FindBy(xpath = "//input[@id='H1' and @type='checkbox' and @name='tools_kits']")
    protected WebElementFacade item_Prueba;

    @FindBy(xpath = "//input[@id='F4WFB' and @type='checkbox' and @name='tools_kits']")
    protected WebElementFacade item_CortaTubos;

    @FindBy(xpath = "//input[@id='name_kit']")
    protected WebElementFacade txt_NombreKit;

    @FindBy(xpath = "//input[@id='rol_kit']")
    protected WebElementFacade txt_RolKit;

    @FindBy(xpath = "//button[@class='btn boton btn-primary' and text()='Registrar']")
    protected WebElementFacade btn_RegistrarKit;

}
