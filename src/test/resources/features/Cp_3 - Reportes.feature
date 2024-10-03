@Suite @Reportes
Feature: CP03 - Consultar indicador herramienta

  Background: Validar el acceso al reporte de una herramienta especifica

    Given El usuario ingresa a la aplicacion para revisar reportes

    @ValidationReport
    Scenario: 1 - Validar acceso a reporte de herramientas
      When Ingresa a la seccion de reportes y luego a la seccion de herramientas
      Then La aplicacion muestra grafica de IDA de la herramienta seleccionada