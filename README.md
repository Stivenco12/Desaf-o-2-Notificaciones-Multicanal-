# Notificaciones Multicanal

## Descripción

Este proyecto en Java permite gestionar notificaciones a través de múltiples plataformas (WhatsApp, Telegram y Slack). Se basa en el patrón de diseño **Factory** para la creación de mensajes y utiliza una estructura modular para facilitar su mantenimiento y escalabilidad.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- **`notificasion_multicanal`**: Contiene la clase principal `Main.java` y la definición de la interfaz `Mensage`.
- **`Factory`**: Implementa el patrón Factory para la creación de mensajes en distintas plataformas.
- **`Models`**: Define las clases concretas para cada tipo de mensaje (WhatsApp, Telegram, Slack).
- **`menu`**: Contiene la lógica para la interacción con el usuario.

## Requisitos Previos

- Tener **Java 8** o superior instalado.
- Tener **Apache Maven** para compilar y ejecutar el proyecto.

## Instalación y Ejecución

1. Clonar o descargar el repositorio.
2. Abrir una terminal en la carpeta del proyecto y ejecutar:
   ```sh
   mvn clean compile
   ```
3. Para ejecutar el programa, usar:
   ```sh
   mvn exec:java -Dexec.mainClass="notificasion_multicanal.Main"
   ```

## Clases Principales

### `Main.java`

Es la clase principal que inicia la ejecución del programa y gestiona la interacción con el usuario.

### `Mensage.java`

Interfaz que define los métodos base para los mensajes.

### `Factory`

- `MensageFactory.java`: Clase base del patrón Factory.
- `TelegramFactory.java`, `SlackFactory.java`, `WhatsappFactory.java`: Implementaciones específicas para cada plataforma.

### `Models`

- `TELEGRAM.java`, `SLACK.java`, `WHATSAPP.java`: Implementan el comportamiento de cada tipo de mensaje.

## Mejoras Futuras

- Implementar una interfaz gráfica.
- Agregar soporte para nuevas plataformas de mensajería.
- Mejorar el manejo de errores.

## Autor : Stivenco12

Desarrollado como parte del **Desafío 2 - Notificaciones Multicanal**.

