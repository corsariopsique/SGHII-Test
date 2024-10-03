package com.SGHII_APP.co.steps.inventory;

import com.SGHII_APP.co.pages.inventory.InventoryPage;
import net.thucydides.core.annotations.Step;

public class InventoryStep extends InventoryPage {

    @Step("Clic boton inventario")
    public void clicInventario() {btn_Inventario.click();}

    @Step("Clic agregar herramienta")
    public void clicAgregarHerramienta() {btn_AgregarHerramienta.click();}

    @Step("Ingresar nombre herramienta")
    public void tipeaNombreTool(String nombre){ txt_NombreTool.sendKeys(nombre);}

    @Step("Ingresa categoria herramienta")
    public void tipeaCategoriaTool(String categoria) {txt_CategoriaTool.sendKeys(categoria);}

    @Step("Ingresa cantidad herramienta")
    public void tipeaCantidadTool(String cantidad) {txt_CantidadTool.sendKeys(cantidad);}

    @Step("Ingresa rol herramienta")
    public void tipeaRolTool(String rol) { txt_RolTool.sendKeys(rol);}

    @Step("Ingresa marca herramienta")
    public void tipeaMarcaTool(String marca) { txt_MarcaTool.sendKeys(marca);}

    @Step("Clic registrar herramienta")
    public void clicBotonRegistrarHerramienta() {btn_RegistrarHerramienta.click();}

    @Step("Clic herramienta listado")
    public void clicToolListed() {tool_Inventario_Prueba.click();}

    @Step("Clic boton items herramienta")
    public void clicBotonItemsTool() {btn_Items_Tool.click();}

    @Step("Clic primer item dela herramienta")
    public void clicItemToolInfo() {item_Tool_Prueba.click();}

}
