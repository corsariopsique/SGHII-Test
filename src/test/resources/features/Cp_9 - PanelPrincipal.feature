@Suite @PanelPrincipal
Feature: CP09 - Acceder a las alertas del panel principal

  Background: Validar el acceso al panel principal (dashboard)

    Given El usuario ingresa al sistema y se ubica en el panel principal

    @ValidationDashboard
    Scenario: 1 - Accede a la seccion del panel principal
      When Hace clic en el boton de panel principal
      Then El sistema muestra el dashboard y toda su informacion contenida