package com.SGHII_APP.co.pages.workers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WorkerPage extends PageObject {

    @FindBy(xpath = "//li[@class='nav-item contitembar']//p[text()='Operarios']")
    protected WebElementFacade btn_Operarios;

    @FindBy(xpath = "//button[@class='btn boton btn-outline-primary' and text()='Agregar Operario']")
    protected WebElementFacade btn_AgregarOperario;

    @FindBy(xpath = "//input[@id='id']")
    protected WebElementFacade txt_IdWorker;

    @FindBy(xpath = "//input[@id='nombre']")
    protected WebElementFacade txt_NombreWorker;

    @FindBy(xpath = "//input[@id='telefono']")
    protected WebElementFacade txt_TelefonoWorker;

    @FindBy(xpath = "//input[@id='rol']")
    protected WebElementFacade txt_RolWorker;

    @FindBy(xpath = "//input[@id='email']")
    protected WebElementFacade txt_EmailWorkerTool;

    @FindBy(xpath = "//button[@class='btn botonWorker btn-primary' and text()='Registrar']")
    protected WebElementFacade btn_RegistrarOperario;

}
