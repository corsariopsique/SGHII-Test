package com.SGHII_APP.co.definitions;

import com.SGHII_APP.co.steps.login.LoginStep;
import com.SGHII_APP.co.steps.validations.ValidationsStep;
import com.SGHII_APP.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDefinicion {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("El usuario ingresa a la aplicacion")
    public void userDirigeA() {url.dirigirseA("http://localhost:3000");}

    @When("ingresa credenciales validas")
    public void usuarioIngresoCredenciales(){
        login.tipeaNombreUsuario("usuario");
        login.tipeaPassword("password");
        login.clickIngresar();
    }

    @Then("la aplicacion permite el acceso del usuario")
    public void sistemaMuestraLogoCompleto() {
        Assert.assertTrue(validate.logoVisible());
    }

}
