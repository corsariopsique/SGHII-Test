@Suite @Operaciones
Feature: CP01 - CP02 - Realizar operaciones de herramienta a operario

  Background: Validar la operaciones (prestamos-devoluciones) de herramienta

    Given El usuario ingresa a la panel principal del sistema

    @ValidationOperations
    Scenario: 1 - Validar operacion de prestamo
      When Selecciona operario y herramienta a prestar
      Then La aplicacion muestra la informacion de la operacion realizada

    Scenario: 2 - Validar operacion de devolucion
      When Selecciona operario y herramienta a devolver
      Then La aplicacion muestra la informacion de la operacion realizada