package com.SGHII_APP.co.definitions;

import com.SGHII_APP.co.steps.login.LoginStep;
import com.SGHII_APP.co.steps.validations.ValidationsStep;
import com.SGHII_APP.co.steps.workers.WorkerStep;
import com.SGHII_APP.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class WorkerDefinicion {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    WorkerStep workers;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("El usuario ingresa al sistema para agregar un operario y verificar su estado")
    public void userDirigeA() {url.dirigirseA("http://localhost:3000");}

    @When("Ingresa a la seccion de operarios y el registra el nuevo operario")
    public void userRegistraWorker() {
        login.tipeaNombreUsuario("usuario");
        login.tipeaPassword("password");
        login.clickIngresar();
        workers.clicOperario();
        workers.clicAgregarOperario();
        workers.tipeaIdWorker("idPrueba123");
        workers.tipeaNombreWorker("Andres Serrano");
        workers.tipeaEmailWorker("test@test.com");
        workers.tipeaPhoneWorker("987987123");
        workers.tipeaRolWorker("Desarrollador");
        workers.clicRegistrarWorker();
    }

    @Then("La aplicacion muestra la informacion del nuevo operario registrado")
    public void muestraInfoWorker() {
        Assert.assertTrue(validate.tagInfoWorkerVisible());
    }
}
