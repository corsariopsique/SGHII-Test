@Suite @Kits
Feature: CP07 - Registrar un kit en el sistema y consultar su estado

  Background: Validar el registro de un nuevo kit y el acceso a la informacion del nuevo registro

    Given El usuario ingresa al sistema para registrar un nuevo kit y verificar su estado

    @ValidationKits
    Scenario: 1 - Registra nuevo kit y accede a la pagina de informacion
      When Ingresa a la seccion de kits y registra el nuevo kit de herramienta
      Then La aplicacion muestra la informacion del nuevo kit registrado