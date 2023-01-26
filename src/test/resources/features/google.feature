#language:es
@DEMO
Característica: Prueba de concepto SpringBoot + Cucumber - GOOGLE

  @GOOGLE_SEARCH
  Escenario: caso1-Busqueda en google
    Dado que abro la pagina de google
    Cuando escribo la busqueda de: "cantantes de rock"
    Entonces valido que los resultados sean mayores a 0

  @GOOGLE_SETTINGS
  Escenario: caso2-Configuraciones en google
    Dado que abro la pagina de configuracio de google
    Cuando busco la opcion "Usuario"
    Entonces valido que el resultado sea "Autocompletar"

  @SAUCE_PAGE
  Escenario: caso3-LoginSauce
    Dado que abro la pagina de sauce
    Cuando escribo usuario y contraseña : "standard_user","secret_sauce"
    Entonces valido el ingreso correcto con label "PRODUCTS"