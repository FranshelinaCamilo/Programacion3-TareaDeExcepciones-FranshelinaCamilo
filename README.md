# Programacion3-TareaDeExcepciones-FranshelinaCamilo

## Tarea 3 - Manejo de Excepciones en Java

**Estudiante:** Franshelina Camilo Cabrera

**Matrícula:** 1000-5493

**Materia:** Programación 3

## Guía de Uso

Para interactuar con el sistema y probar sus funcionalidades, siga esta guía:

### 1. Registro de Usuarios

Seleccione la opción **1 (Registrar usuario)** del menú principal.

El sistema solicitará los siguientes datos:

* Nombre
* Edad
* Correo electrónico
* Salario mensual

### 2. Validación de Datos

Una vez ingresada la información, el sistema verificará que los datos cumplan con las reglas establecidas:

* El nombre no puede estar vacío y debe tener al menos 3 caracteres.
* La edad debe estar entre 18 y 100 años.
* El correo electrónico debe contener los caracteres `@` y `.`.
* El salario mensual debe ser mayor que cero.

Si alguno de los datos es inválido, el sistema mostrará el mensaje de error correspondiente.

### 3. Manejo de Errores de Entrada

Si el usuario introduce texto en campos numéricos como edad o salario, el sistema capturará el error y mostrará un mensaje indicando que debe ingresar un número válido.

### 4. Finalización del Proceso

Al concluir el registro, ya sea exitosamente o con algún error de validación, el sistema mostrará el mensaje **"Proceso finalizado."** y regresará al menú principal.

### 5. Salir del Sistema

Seleccione la opción **2 (Salir)** para finalizar la ejecución del programa.


## Tecnologías utilizadas: 
- Java
- Visual Studio Code
- JDK 25
