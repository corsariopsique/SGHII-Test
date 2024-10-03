package com.SGHII_APP.co.pages.operations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class OperationPage extends PageObject {

    @FindBy(xpath = "//li[@class='nav-item contitembar']//p[text()='Operaciones']")
    protected WebElementFacade btn_Operaciones;

    @FindBy(xpath = "//button[@class='btn boton btn-outline-primary' and text()='Agregar Operación']")
    protected WebElementFacade btn_AgregarOperacion;

    @FindBy(xpath = "//input[@id='prestamo' and @type='radio']")
    protected WebElementFacade radioBtn_Prestamo;

    @FindBy(xpath = "//input[@id='devolucion' and @type='radio']")
    protected WebElementFacade radioBtn_Devolucion;

    @FindBy(xpath = "//input[@id='herramientas' and @type='radio']")
    protected WebElementFacade radioBtn_Herramientas;

    @FindBy(xpath = "//input[@id='kits' and @type='radio']")
    protected WebElementFacade radioBtn_Kits;

    @FindBy(xpath = "//input[@id='0' and @type='checkbox' and @name='operario']")
    protected WebElementFacade operario_Lista;

    @FindBy(xpath = "//input[@id='0' and @type='checkbox' and @name='tools_Oper']")
    protected WebElementFacade herramienta_Lista;

    @FindBy(xpath = "//button[@class='btn botonOperacion btn-primary' and text()='Registrar Operación']")
    protected WebElementFacade btn_RegistrarOperacion;

}
