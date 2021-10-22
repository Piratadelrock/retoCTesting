# Autor: Emmanuel Lopera
@stories
Feature: UTest
  As a user, I want create an account on uTest
  @scenario1
  Scenario:
    Given that Emmanuel wants to create an account on uTest
    When he enters Join Today, he opens a form to register on the platform
     | strNombre | strApellido | strCorreo          | strClave   | strConfirmarClave  | strDia | strMes | strAno|strCiudad | strPostal|
     | Emmanuel  | Jose        | jsmith2@yopmail.com | Pchou2021* | Pchou2021*         | 27     | March  | 1996  | Bello | 051050 |

    Then fill in the form

