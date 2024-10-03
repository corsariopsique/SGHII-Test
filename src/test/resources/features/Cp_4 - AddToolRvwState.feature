@Suite @Inventario
Feature: CP04 - Agregar herramienta a inventario y consultar su estado

  Background: Validar el registro de una herramienta en inventario y el acceso a su respectiva informacion

    Given El usuario ingresa al sistema para agregar un herramienta y verificar su estado

    @ValidationInventory
    Scenario: 1 - Agregar herramienta a inventario
      When Ingresa a inventario y registra una nueva herramienta
      Then La aplicacion muestra la informacion de la herramienta recien agregada

    Scenario: 2 - Revisar estado de un item de una herramienta registrada
      When Ingresa a inventario y selecciona una herramienta para ver su estado
      Then La aplicacion muestra el estado del item seleccionado