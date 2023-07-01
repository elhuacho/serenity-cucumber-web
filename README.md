# Serenity Cucumber Web

Proyecto de automatización de pruebas con Serenity BDD.

## Iniciando

Siga las siguientes instrucciones para iniciar el desarrollo de este proyecto.

### Pre-requisitos

* Instalar Java JDK11 o mayor.
* Instalar Maven última versión.

### Ejecución del proyecto

Para la ejecución del proyecto, puede simplemente ejecutar la clase test runner `CucumberTestSuite`, o ejecutar `mvn verify` o `gradle test` desde la línea de comandos.

De forma predeterminada, las pruebas se ejecutarán con Chrome. Puede ejecutarlos en otros navegadores cambiando el valor de la propiedad `driver`.
```
mvn clean verify -Ddriver=firefox
```
O 
```
gradle clean test -Pdriver=firefox
```

El resultado de los tests se va guardar en la carpeta `target/site/serenity`.
  
Para determinar en qué ambiente o entorno se ejecutará, se utiliza la propiedad `environment`.
```
mvn clean verify -Denvironment=staging
```