# acme salary employee
- El objetivo de este programa es calcular el salario total que la empresa debe pagar a un empleado, en función del rango de horas y el tiempo que trabajó.

## Arquitecura:
- La arquitectura del programa esta compuesta por varios módulos que se comunícan entre si. 
- Como se puede ver en la imgagen de abajo, un usuario realiza una consulta al programa, el encargado de tomar esa pedición será la clase Main la cual se comunicará con los componentes realizará la consulta y devolverá la respuesta.
- El componente Controller realiza el cálculo del salario de los registros ingresados.
- El componente Model contiene el modelo simuladp de datos del empleado, horario y pagos.
- En el componente Data se genera información por default de los días, rango de horarios laborales y su correspondiente valor a pagar.

#### Diagrama de arquitectura:
![arquitectura](https://user-images.githubusercontent.com/62773610/128308799-2f1e8cee-c870-4484-ad9c-8a7effc24077.JPG)

  
## Modelo:
![Modelo](https://user-images.githubusercontent.com/62773610/128308847-71271a75-4904-4fc8-8adf-ef0753d1ff9f.JPG)


## Metodología:
- Para la gestión del proyecto se usó la herramienta trello junto con Canvas, lo cual permitió llevar una lista de tareas o de actividades por hacer, actividades en desarrollo y actividades culminadas, facilitando el desarrollo y la culminación del proyecto.
#### Esquema del proyecto acme en trello:
![trello](https://user-images.githubusercontent.com/62773610/128308796-e186beb5-b680-4a0a-8cec-4bd1da4d5a05.JPG)


## Compilación del programa "acme":
- Para el desarrollo del programa se utilizó el lenguaje de programación java.
- La versión del JDK que se usó fue la 11.

### Instruciones:
1. Clonar el proyecto: 
```
git clone https://github.com/jeonag/acme
```
2. Ubicarse dentro del directorio `acme/src` y abrir el **cmd** en la dirección de ese directorio.
3. Ejecutar el siguiente comando:
```
javac com\acme\Main.java
```
* OJO: Si ejecuta el comando desde gitbash cambiar `"\"` por `"/"` tanto en el comando de la Instrucción 3 y 4.
4. Luego ejecutar el comando:
```
java com.acme.Main
```
- Se desplegará la respuesta.

### Probar con otros datos de salario de empleados:
1. En el explorador de archivos ubicarse dentro del directorio acme
2. Abrir el archivo `"salary-employees.txt"`
3. Editar el archivo y guardar.
4. Ubicarse en el directorio `acme/src` y abrir el **cmd** en esa dirección
5. Ejecutar el comando: 
```
java com.acme.Main
```
- Se motrará el resultado.

## Ejecutar el progama desde un IDE:
### Intrucciones: 
1. Clonar el proyecto:
```
git clone https://github.com/jeonag/acme
```
2. Abrir desde el IDE el programa, que se encuentra ubicado dentro del directorio donde se clonó, en la carpeta `acme`
3. Una vez cargado el programa en el IDE abrir la clase `"ReadFile.java"`, que se encuentra dentro del package `utils`
4. En la clase `"ReadFile.java"` buscar y eliminar la siguiente linea de código:
```
String path = "..\\salary-employees.txt";
```
5. Copiar y pegar la siguiente línea de código, reemplazando la línea de código eliminada en la `Instrucción 4.`
```
String path = "scr\\..\\salary-employees.txt";
```
6. Guardar cambios.
7. Abrir la clase `"Main.java"`, que se encuentra dentro del package `acme`
8. Ejecutar el progama.
- Se motrará el resultado.

### Probar el programa con otros datos de salario de empleados:
1. En el explorador de archivos ubicarse en el directorio `acme`, que se encuentra dentro del directorio donde se clonó el proyecto.
2. Abrir el archivo `"salary-employees.txt"`
3. Editar el archivo y guardar.
4. Abrir la clase `"Main.java"`, que se encuentra dentro del package `acme`
5. En el IDE abrir la clase `"Main.java"`, que se encuentra dentro del package `acme` y ejecutar el progama.
- Se motrará el resultado.
