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

}
