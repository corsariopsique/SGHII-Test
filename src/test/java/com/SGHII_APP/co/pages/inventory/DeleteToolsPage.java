package com.SGHII_APP.co.pages.inventory;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Alert;

public class DeleteToolsPage extends PageObject {

    @FindBy(xpath = "//li[@class='nav-item contitembar']//p[text()='Inventario']")
    protected WebElementFacade btn_Inventario;

    @FindBy(xpath = "//h6[@class='text-secondary control_TextoInventario' and text()='Herramienta de prueba']")
    protected WebElementFacade tool_Inventario_Prueba;

    @FindBy(xpath = "//button[@class='btn boton btn-outline-secondary' and text()='Editar']")
    protected WebElementFacade btn_EditarHerramienta;

    @FindBy(xpath = "//button[@class='btn boton btn-danger' and text()='Eliminar']")
    protected WebElementFacade btn_EliminarHerramienta;

    @FindBy(xpath = "//button[@id='delete_Confirm' and text()='Eliminar']")
    protected WebElementFacade btn_ConfirmarDeleteHerramienta;

    public void acceptAlert() {
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

}
