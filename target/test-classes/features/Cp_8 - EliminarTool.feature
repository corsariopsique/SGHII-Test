@Suite @DeleteTools
Feature: CP08 - Dar de baja una herramienta del sistema

  Background: Validar proceso de dar de baja herramienta del inventario

    Given El usuario ingresa al sistema para dar de baja un herramienta del inventario

    @ValidationDeleteTools
    Scenario: 1 - Ingresa a la seccion de inventario y da de baja una herramienta seleccionada
      When Selecciona la herramienta accede a la pagina editar herramienta y solcita el dar de baja la herramienta
      Then El sistema confirma el exito del proceso y lleva al listado inicial de herramientas