package com.SGHII_APP.co.definitions;

import com.SGHII_APP.co.steps.login.LoginStep;
import com.SGHII_APP.co.steps.report.ReportStep;
import com.SGHII_APP.co.steps.validations.ValidationsStep;
import com.SGHII_APP.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ReportDefinicion {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    ReportStep report;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationsStep validate;

    @Given("El usuario ingresa a la aplicacion para revisar reportes")
    public void userDirigeA() {url.dirigirseA("http://localhost:3000");}

    @When("Ingresa a la seccion de reportes y luego a la seccion de herramientas")
    public void userRevisaReport(){
        login.tipeaNombreUsuario("usuario");
        login.tipeaPassword("password");
        login.clickIngresar();
        report.clicReportes();
        report.clicOpcionesReportes();
        report.clicItemHerramientasReportesLista();
        report.clicHerramientasReportes();
        report.clicItemListaHerramientasDetalle();
    }

    @Then("La aplicacion muestra grafica de IDA de la herramienta seleccionada")
    public void muestraIDAGraph() {
        Assert.assertTrue(validate.graphVisible());
    }

}
