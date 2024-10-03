@Suite @Login
Feature: CP05 - Realizar ingreso de cuenta de usuario

  Background: Validar inicio de sesion con credenciales validas

    Given El usuario ingresa a la aplicacion

    @ValidationCredentials
    Scenario: 1 - Validar credenciales correctas
      When ingresa credenciales validas
      Then la aplicacion permite el acceso del usuario