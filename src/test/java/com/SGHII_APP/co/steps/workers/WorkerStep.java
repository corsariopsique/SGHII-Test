package com.SGHII_APP.co.steps.workers;

import com.SGHII_APP.co.pages.workers.WorkerPage;
import net.thucydides.core.annotations.Step;

public class WorkerStep extends WorkerPage {

    @Step("Clic boton operarios")
    public void clicOperario() {btn_Operarios.click();}

    @Step("Clic agregar operario")
    public void clicAgregarOperario() {btn_AgregarOperario.click();}

    @Step("Ingresar nombre operario")
    public void tipeaNombreWorker(String nombre){ txt_NombreWorker.sendKeys(nombre);}

    @Step("Ingresa id operario")
    public void tipeaIdWorker(String id) {txt_IdWorker.sendKeys(id);}

    @Step("Ingresa telefono operario")
    public void tipeaPhoneWorker(String phone) {txt_TelefonoWorker.sendKeys(phone);}

    @Step("Ingresa rol operario")
    public void tipeaRolWorker(String rol) { txt_RolWorker.sendKeys(rol);}

    @Step("Ingresa email operario")
    public void tipeaEmailWorker(String email) { txt_EmailWorkerTool.sendKeys(email);}

    @Step("Clic registrar operario")
    public void clicRegistrarWorker() {btn_RegistrarOperario.click();}

}
