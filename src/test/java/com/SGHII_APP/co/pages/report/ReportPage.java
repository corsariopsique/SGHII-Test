package com.SGHII_APP.co.pages.report;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ReportPage extends PageObject {

    @FindBy(xpath = "//li[@class='nav-item contitembar']//p[text()='Reportes']")
    protected WebElementFacade btn_Reportes;

    @FindBy(xpath = "//button[@id='dropdownMenuOpciones' and @class='btn btn-primary dropdown-toggle']")
    protected WebElementFacade btn_Opciones_Reportes;

    @FindBy(xpath = "//li/a[@href='/reportes/herramientas']")
    protected WebElementFacade item_List_Reportes_Herramientas;

    @FindBy(xpath = "//button[@id='dropdownMenuHerramientas' and @class='btn btn-primary dropdown-toggle']")
    protected WebElementFacade btn_Herramientas_Reportes;

    @FindBy(xpath = "//ul/li[text()='Lima']")
    protected WebElementFacade item_List_Herramienta_IDA;

}
