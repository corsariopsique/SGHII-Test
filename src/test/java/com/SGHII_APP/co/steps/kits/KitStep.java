package com.SGHII_APP.co.steps.kits;

import com.SGHII_APP.co.pages.kits.KitPage;
import net.thucydides.core.annotations.Step;

public class KitStep extends KitPage {

    @Step("Clic boton kits")
    public void clicKits() {btn_Kits.click();}

    @Step("Clic agregar kit")
    public void clicAgregarKit() {btn_AgregarKit.click();}

    @Step("Clic herramienta # 1 lista")
    public void clicTool1List() {item_Alicate.click();}

    @Step("Clic herramienta # 2 lista")
    public void clicTool2List() {item_Prueba.click();}

    @Step("Clic herramienta # 3 lista")
    public void clicTool3List() {item_CortaTubos.click();}

    @Step("Ingresar nombre kit")
    public void tipeaNombreKit(String nombre){ txt_NombreKit.sendKeys(nombre);}

    @Step("Ingresar rol kit")
    public void tipeaRolKit(String rol){ txt_RolKit.sendKeys(rol);}

    @Step("Clic registrar kit")
    public void clicRegistrarKit() {btn_RegistrarKit.click();}
    
}
