package com.SGHII_APP.co.definitions;

import com.SGHII_APP.co.steps.inventory.DeleteToolsStep;
import com.SGHII_APP.co.steps.login.LoginStep;
import com.SGHII_APP.co.steps.validations.ValidationsStep;
import com.SGHII_APP.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class DeleteToolDefinicion {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    DeleteToolsStep deletes;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("El usuario ingresa al sistema para dar de baja un herramienta del inventario")
    public void userDirigeA() {url.dirigirseA("http://localhost:3000");}

    @When("Selecciona la herramienta accede a la pagina editar herramienta y solcita el dar de baja la herramienta")
    public void userDeleteTool(){
        login.tipeaNombreUsuario("usuario");
        login.tipeaPassword("password");
        login.clickIngresar();
        deletes.clicInventario();
        deletes.clicToolListed();
        deletes.clicEditarHerramienta();
        deletes.clicEliminarHerramienta();
        deletes.clicConfirmarEliminarHerramienta();
        //deletes.clicAlertaEliminadaHerramienta();
    }

    @Then("El sistema confirma el exito del proceso y lleva al listado inicial de herramientas")
    public void muestraListadoTools(){
        Assert.assertTrue(validate.tagListToolVisible());
    }

}
