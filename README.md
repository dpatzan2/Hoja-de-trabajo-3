## 🚀 Proyecto de Ordenamiento y Pruebas de Rendimiento

¡Bienvenido al Proyecto de Ordenamiento y Pruebas de Rendimiento! Este programa implementa varios algoritmos de ordenamiento y realiza pruebas de rendimiento para medir su eficacia en diferentes tamaños de conjuntos de datos.

### Estructura del Proyecto

El proyecto está organizado en varias carpetas y archivos que trabajan juntos para proporcionar un análisis exhaustivo de los algoritmos de ordenamiento.

#### 📁 model

- **SortingAlgorithms.java**: Contiene la implementación de los algoritmos de ordenamiento, como Gnome sort, Merge sort, Quick sort, Radix sort y Choose The Pair sort.

- **FileManager.java**: Maneja la escritura y lectura de datos desde y hacia archivos.

#### 📁 consoleui

- **SortingConsoleUI.java**: Proporciona una interfaz de consola para que el usuario seleccione el algoritmo de ordenamiento y especifique el tamaño del conjunto de datos a ordenar. También muestra los datos antes y después de la ordenación.

#### 📁 test

- **SortingAlgorithmsTest.java**: Contiene las pruebas unitarias para los algoritmos de ordenamiento implementados en SortingAlgorithms.java.

#### 📁 archivo

- **random_numbers.csv**: Almacena números enteros generados aleatoriamente que se utilizan para las pruebas de rendimiento.

#### ⚙️ JDK

El proyecto ha sido desarrollado utilizando JDK 17.0.7. Asegúrate de tener esta versión instalada para una experiencia sin problemas.

### Cómo Ejecutar el Programa

1. **Descarga del Repositorio**: Clona o descarga este repositorio en tu máquina local.

    ```bash
    git clone https://github.com/dpatzan2/Hoja-de-trabajo-3.git
    ```

2. **Configuración de JDK**: Verifica que tienes instalado el JDK 17.0.7.

3. **Ejecución del Programa**: Abre tu terminal y navega hasta la carpeta raíz del proyecto. Ejecuta el siguiente comando para compilar el código:

    ```bash
    javac consoleui/*.java model/*.java test/*.java
    ```

4. Luego, ejecuta el programa principal con:

    ```bash
    java consoleui.SortingConsoleUI
    ```

5. ¡Explora y analiza los algoritmos de ordenamiento implementados! Puedes seleccionar diferentes algoritmos y tamaños de conjuntos de datos para realizar pruebas de rendimiento.

### Pruebas Unitarias

Para ejecutar las pruebas unitarias, utiliza el siguiente comando:

```bash
java -cp .:junit-platform-console-standalone-1.7.2.jar org.junit.platform.console.ConsoleLauncher --scan-classpath
```


### 👨‍🦱 INTEGRANTES

Osman Emanuel de Leon Garcia (23428)
Diego Fernando Patzán Marroquín (23525)
