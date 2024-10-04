package com.SGHII_APP.co.steps.validations;

import com.SGHII_APP.co.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationsStep extends ValidationPage {

    @Step("Valida ingreso al sistema")
    public Boolean logoVisible(){
        return img_after_login.isDisplayed();
    }

    @Step("Valida registro de operacion")
    public Boolean tagInfoOperVisible() {return tag_Info_Operations_Page.isDisplayed();}

    @Step("Valida ingreso reporte herramienta")
    public Boolean graphVisible() {return title_Graph_IDA.isDisplayed();}

    @Step("Valida registro de herramienta")
    public Boolean tagInfoToolVisible() {return tag_Info_Herramientas_Page.isDisplayed();}

    @Step("Valida ingreso informacion item")
    public Boolean tagInfoItemVisible() {return tag_Info_ItemTool_Page.isDisplayed();}

    @Step("Validar ingreso informacion operario")
    public Boolean tagInfoWorkerVisible() {return tag_Info_Worker_Page.isDisplayed();}

    @Step("Validar ingreso informacion kit")
    public Boolean tagInfoKitVisible() {return tag_Info_Kits_Page.isDisplayed();}

    @Step("Validar eliminar herramienta")
    public Boolean tagListToolVisible() {return tag_List_Tools_Page.isDisplayed();}

    @Step("Validar acceso panel principal")
    public Boolean tagListToolLowVisible() {return tag_List_Tools_Low_Dashboard.isDisplayed();}

}
