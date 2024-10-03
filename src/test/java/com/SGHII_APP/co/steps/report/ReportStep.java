package com.SGHII_APP.co.steps.report;

import com.SGHII_APP.co.pages.report.ReportPage;
import net.thucydides.core.annotations.Step;

public class ReportStep extends ReportPage {

    @Step("Clic boton reportes")
    public void clicReportes() {btn_Reportes.click();}

    @Step("Clic boton opciones")
    public void clicOpcionesReportes() {btn_Opciones_Reportes.click();}

    @Step("Clic item lista opciones")
    public void clicItemHerramientasReportesLista() {item_List_Reportes_Herramientas.click();}

    @Step("Clic boton herramientas")
    public void clicHerramientasReportes() {btn_Herramientas_Reportes.click();}

    @Step("Clic item lista herramienta")
    public void clicItemListaHerramientasDetalle() {item_List_Herramienta_IDA.click();}

}
