@Suite @Operarios
Feature: CP06 - Agregar operario a la base de datos y consultar su estado

  Background: Validar el registro de un nuevo operario y el acceso a la informacion del nuevo registro

    Given El usuario ingresa al sistema para agregar un operario y verificar su estado

    @ValidationWorkers
    Scenario: 1 - Registra nuevo operario y accede a la pagina de informacion
      When Ingresa a la seccion de operarios y el registra el nuevo operario
      Then La aplicacion muestra la informacion del nuevo operario registrado