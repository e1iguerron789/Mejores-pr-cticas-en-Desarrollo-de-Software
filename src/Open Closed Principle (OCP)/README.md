# Open Closed Principle (OCP)

En el codigo original, `NotificationService` usaba condicionales para decidir si enviaba una notificacion por Email, SMS o Push. Cada vez que se necesitaba agregar un nuevo tipo de notificacion, era necesario modificar esa misma clase.

Para aplicar OCP, se creo la interfaz `Notification` con el metodo `send()`. Luego se implementaron clases concretas para cada tipo de notificacion:

- `EmailNotification`
- `SMSNotification`
- `PushNotification`

`NotificationService` ahora trabaja con la interfaz `Notification`, no con tipos especificos ni condicionales. Esto permite agregar una nueva notificacion creando una nueva clase que implemente `Notification`, sin cambiar el codigo ya existente del servicio.

El problema que se resolvio fue la necesidad de modificar una clase central cada vez que se agregaba una nueva funcionalidad. Ahora el codigo esta abierto para extenderse, pero cerrado para modificarse.
