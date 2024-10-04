package com.SGHII_APP.co.definitions;

import com.SGHII_APP.co.steps.kits.KitStep;
import com.SGHII_APP.co.steps.login.LoginStep;
import com.SGHII_APP.co.steps.validations.ValidationsStep;
import com.SGHII_APP.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class KitDefinicion {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    KitStep kits;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("El usuario ingresa al sistema para registrar un nuevo kit y verificar su estado")
    public void userDirigeA() {url.dirigirseA("http://localhost:3000");}

    @When("Ingresa a la seccion de kits y registra el nuevo kit de herramienta")
    public void userRegistraKit() {
        login.tipeaNombreUsuario("usuario");
        login.tipeaPassword("password");
        login.clickIngresar();
        kits.clicKits();
        kits.clicAgregarKit();
        kits.tipeaNombreKit("Kit Prueba Automatica");
        kits.tipeaRolKit("Desarrollador");
        kits.clicTool1List();
        kits.clicTool2List();
        kits.clicTool3List();
        kits.clicRegistrarKit();
    }

    @Then("La aplicacion muestra la informacion del nuevo kit registrado")
    public void muestraInfoKit() {
        Assert.assertTrue(validate.tagInfoKitVisible());
    }

}
