package com.SGHII_APP.co.pages.inventory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InventoryPage extends PageObject {

    @FindBy(xpath = "//li[@class='nav-item contitembar']//p[text()='Inventario']")
    protected WebElementFacade btn_Inventario;

    @FindBy(xpath = "//button[@class='btn boton btn-outline-primary' and text()='Agregar Herramienta']")
    protected WebElementFacade btn_AgregarHerramienta;

    @FindBy(xpath = "//input[@id='nombre']")
    protected WebElementFacade txt_NombreTool;

    @FindBy(xpath = "//input[@id='categoria']")
    protected WebElementFacade txt_CategoriaTool;

    @FindBy(xpath = "//input[@id='cantidad']")
    protected WebElementFacade txt_CantidadTool;

    @FindBy(xpath = "//input[@id='rol']")
    protected WebElementFacade txt_RolTool;

    @FindBy(xpath = "//input[@id='marca']")
    protected WebElementFacade txt_MarcaTool;

    @FindBy(xpath = "//button[@class='btn boton btn-primary' and text()='Registrar']")
    protected WebElementFacade btn_RegistrarHerramienta;

    @FindBy(xpath = "//h6[@class='text-secondary control_TextoInventario' and text()='Herramienta de prueba']")
    protected WebElementFacade tool_Inventario_Prueba;

    @FindBy(xpath = "//button[@id='nav-items-tab']")
    protected WebElementFacade btn_Items_Tool;

    @FindBy(xpath = "//div[@class='listaHerramientaItems']/a[1]")
    protected WebElementFacade item_Tool_Prueba;

}
