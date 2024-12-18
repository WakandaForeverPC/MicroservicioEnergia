# Microservicio de Energía

Este proyecto es un microservicio de gestión de energía desarrollado con Spring Boot y Maven. El microservicio se encarga de gestionar y visualizar el consumo de energía y los puntos de reciclaje en una ciudad.

## Estructura del Proyecto

### `MicroservicioEnergiaApplication.java`

- Esta es la clase principal que inicia la aplicación Spring Boot.

### Package Controller 

Dentro de ese package tenemos una clase 

#### `EnergiaController`

- Este controlador maneja las solicitudes HTTP para la vista de gestión de energía.
- showCity(): Método que maneja las solicitudes GET a la ruta /energia y devuelve la vista board-energia.
- 
### Resources 

Dentro del directorio Resources tenemos otros dos directorios 

#### `static.energia`

##### script.js

Este script se encarga de generar el tablero de energía y de obtener datos de edificios y puntos de reciclaje desde el servidor.  
- Generación del tablero con carreteras y celdas.
- Obtención y renderización de edificios estáticos.
- Simulación del consumo de energía y creación de un gráfico de pastel.
- Obtención y renderización de puntos de reciclaje.
  
##### styles.css
- Este archivo contiene los estilos CSS para la visualización del tablero de energía y los elementos dentro de él.  
- Estilos para el cuerpo, tablero, celdas, tuberías, edificios y carreteras.
  
#### `templates` 

##### board-energia.html 

Este archivo HTML define la estructura de la página de gestión de energía.  
- Contiene el contenedor del tablero y el gráfico de consumo de energía.
- Incluye los enlaces a los archivos CSS y JavaScript necesarios.




