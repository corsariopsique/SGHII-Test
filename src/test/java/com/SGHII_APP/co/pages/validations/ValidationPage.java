package com.SGHII_APP.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//*[@id='logo-completo']")
    protected WebElementFacade img_after_login;

    @FindBy(xpath = "//p[@class='titlepanel text-wrap badge bg-secondary' and text()='Información Operaciones']")
    protected WebElementFacade tag_Info_Operations_Page;

    @FindBy(xpath = "//div/h5[text()='Lima']")
    protected WebElementFacade title_Graph_IDA;

    @FindBy(xpath = "//p[@class='titlepanel text-wrap badge bg-secondary' and text()='Información Herramienta']")
    protected WebElementFacade tag_Info_Herramientas_Page;

    @FindBy(xpath = "//p[@class='titlepanel text-wrap badge bg-secondary' and text()='Información Item']")
    protected WebElementFacade tag_Info_ItemTool_Page;

    @FindBy(xpath = "//p[@class='titlepanel text-wrap badge bg-secondary' and text()='Información Operario']")
    protected WebElementFacade tag_Info_Worker_Page;

    @FindBy(xpath = "//p[@class='titlepanel text-wrap badge bg-secondary' and text()='Información Kits']")
    protected WebElementFacade tag_Info_Kits_Page;

    @FindBy(xpath = "//p[@class='titlepanel text-wrap badge bg-secondary' and text()='Herramientas']")
    protected WebElementFacade tag_List_Tools_Page;

    @FindBy(xpath = "//p[@class='titlepanelL text-wrap badge bg-light text-info' and text()='Cantidades bajas en inventario']")
    protected WebElementFacade tag_List_Tools_Low_Dashboard;

}
