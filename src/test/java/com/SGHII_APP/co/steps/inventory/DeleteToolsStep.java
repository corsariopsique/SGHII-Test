package com.SGHII_APP.co.steps.inventory;

import com.SGHII_APP.co.pages.inventory.DeleteToolsPage;
import net.thucydides.core.annotations.Step;

public class DeleteToolsStep extends DeleteToolsPage {

    @Step("Clic boton inventario")
    public void clicInventario() {btn_Inventario.click();}

    @Step("Clic herramienta listado")
    public void clicToolListed() {tool_Inventario_Prueba.click();}

    @Step("Clic editar herramienta")
    public void clicEditarHerramienta() {btn_EditarHerramienta.click();}

    @Step("Clic eliminar herramienta")
    public void clicEliminarHerramienta() {btn_EliminarHerramienta.click();}

    @Step("Clic confirmar eliminar herramienta")
    public void clicConfirmarEliminarHerramienta() {btn_ConfirmarDeleteHerramienta.click();}

    @Step("Clic aceptar alerta confirmarcion herramienta eliminada")
    public void clicAlertaEliminadaHerramienta() {acceptAlert();}

}
