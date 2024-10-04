package com.SGHII_APP.co.definitions;

import com.SGHII_APP.co.steps.dashboard.DashboardStep;
import com.SGHII_APP.co.steps.login.LoginStep;
import com.SGHII_APP.co.steps.validations.ValidationsStep;
import com.SGHII_APP.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class DashboardDefinicion {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    DashboardStep dashboard;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("El usuario ingresa al sistema y se ubica en el panel principal")
    public void userDirigeA() {url.dirigirseA("http://localhost:3000");}

    @When("Hace clic en el boton de panel principal")
    public void userAccessDashboard() {
        login.tipeaNombreUsuario("usuario");
        login.tipeaPassword("password");
        login.clickIngresar();
        dashboard.clicDashboard();
    }

    @Then("El sistema muestra el dashboard y toda su informacion contenida")
    public void muestraDashboard() {
        Assert.assertTrue(validate.tagListToolLowVisible());
    }

}
