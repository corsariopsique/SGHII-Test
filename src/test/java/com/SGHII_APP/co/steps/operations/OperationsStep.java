package com.SGHII_APP.co.steps.operations;

import com.SGHII_APP.co.pages.operations.OperationPage;
import net.thucydides.core.annotations.Step;

public class OperationsStep extends OperationPage {

    @Step("Clic boton operaciones")
    public void clicOperaciones() {btn_Operaciones.click();}

    @Step("Clic agregar operacion")
    public void clicAgregarOperacion() {btn_AgregarOperacion.click();}

    @Step("Clic tipo prestamo")
    public void clicTipoPrestamo() {radioBtn_Prestamo.click();}

    @Step("Clic tipo devolucion")
    public void clicTipoDevolucion() {radioBtn_Devolucion.click();}

    @Step("Clic tipo herramienta")
    public void clicTipoHerramienta() {radioBtn_Herramientas.click();}

    @Step("Clic tipo kits")
    public void clicTipoKits() {radioBtn_Kits.click();}

    @Step("Clic operario lista")
    public void clicOperarioLista() {operario_Lista.click();}

    @Step("Clic herramienta lista")
    public void clicHerramientaLista() {herramienta_Lista.click();}

    @Step("Clic registrar operacion")
    public void clicBotonRegistrarOperacion() {btn_RegistrarOperacion.click();}

}
