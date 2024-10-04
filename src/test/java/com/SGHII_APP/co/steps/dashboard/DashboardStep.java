package com.SGHII_APP.co.steps.dashboard;

import com.SGHII_APP.co.pages.dashboard.DashboardPage;
import net.thucydides.core.annotations.Step;

public class DashboardStep extends DashboardPage {

    @Step("Clic boton panel principal")
    public void clicDashboard() {btn_Dashboard.click();}

}
