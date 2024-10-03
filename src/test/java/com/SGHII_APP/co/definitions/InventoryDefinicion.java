package com.SGHII_APP.co.definitions;

import com.SGHII_APP.co.steps.inventory.InventoryStep;
import com.SGHII_APP.co.steps.login.LoginStep;
import com.SGHII_APP.co.steps.validations.ValidationsStep;
import com.SGHII_APP.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class InventoryDefinicion {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    InventoryStep inventories;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("El usuario ingresa al sistema para agregar un herramienta y verificar su estado")
    public void userDirigeA() {url.dirigirseA("http://localhost:3000");}

    @When("Ingresa a inventario y registra una nueva herramienta")
    public void userRegistraTool(){
        login.tipeaNombreUsuario("usuario");
        login.tipeaPassword("password");
        login.clickIngresar();
        inventories.clicInventario();
        inventories.clicAgregarHerramienta();
        inventories.tipeaNombreTool("Herramienta de prueba");
        inventories.tipeaCategoriaTool("Manual");
        inventories.tipeaCantidadTool("6");
        inventories.tipeaRolTool("Desarrollador");
        inventories.tipeaMarcaTool("Incolma");
        inventories.clicBotonRegistrarHerramienta();
    }

    @When("Ingresa a inventario y selecciona una herramienta para ver su estado")
    public void userReviewItemTool(){

        inventories.clicInventario();
        inventories.clicToolListed();
        inventories.clicBotonItemsTool();
        inventories.clicItemToolInfo();
    }

    @Then("La aplicacion muestra la informacion de la herramienta recien agregada")
    public void muestraInfoHerramienta(){
        Assert.assertTrue(validate.tagInfoToolVisible());
    }

    @Then("La aplicacion muestra el estado del item seleccionado")
    public void muestraInfoItemTool(){
        Assert.assertTrue(validate.tagInfoItemVisible());
    }
}
