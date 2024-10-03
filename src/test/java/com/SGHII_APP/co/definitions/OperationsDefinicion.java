package com.SGHII_APP.co.definitions;

import com.SGHII_APP.co.steps.login.LoginStep;
import com.SGHII_APP.co.steps.operations.OperationsStep;
import com.SGHII_APP.co.steps.validations.ValidationsStep;
import com.SGHII_APP.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class OperationsDefinicion {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    OperationsStep operations;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("El usuario ingresa a la panel principal del sistema")
    public void userDirigeA() {url.dirigirseA("http://localhost:3000");}

    @When("Selecciona operario y herramienta a prestar")
    public void userRealizaPrestamo(){
        login.tipeaNombreUsuario("usuario");
        login.tipeaPassword("password");
        login.clickIngresar();
        operations.clicOperaciones();
        operations.clicAgregarOperacion();
        operations.clicTipoPrestamo();
        operations.clicTipoHerramienta();
        operations.clicOperarioLista();
        operations.clicHerramientaLista();
        operations.clicBotonRegistrarOperacion();
    }

    @When("Selecciona operario y herramienta a devolver")
    public void userRealizaDevolucion() {
        operations.clicOperaciones();
        operations.clicAgregarOperacion();
        operations.clicTipoDevolucion();
        operations.clicTipoHerramienta();
        operations.clicOperarioLista();
        operations.clicHerramientaLista();
        operations.clicBotonRegistrarOperacion();
    }

    @Then("La aplicacion muestra la informacion de la operacion realizada")
    public void muestraInfoOperacion() {
        Assert.assertTrue(validate.tagInfoOperVisible());
    }

}
