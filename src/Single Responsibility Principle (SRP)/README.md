# Single Responsibility Principle (SRP)

En el codigo original, `UserManager` tenia varias responsabilidades al mismo tiempo: validaba datos, guardaba usuarios, enviaba notificaciones y coordinaba el flujo de creacion. Esto hacia que la clase tuviera muchas razones para cambiar.

Para aplicar SRP, se separaron esas responsabilidades en clases independientes:

- `UserValidator`: valida el correo y la contrasena.
- `UserRepository`: se encarga de guardar los datos del usuario.
- `NotificationService`: envia el correo de bienvenida.
- `UserManager`: coordina el proceso principal.

Con esta refactorizacion, cada clase tiene una sola responsabilidad. Si cambia la forma de validar, solo se modifica `UserValidator`; si cambia la forma de guardar datos, solo se modifica `UserRepository`; y si cambia la notificacion, solo se modifica `NotificationService`.

El problema que se resolvio fue el acoplamiento de muchas tareas dentro de una sola clase. El codigo queda mas facil de entender, probar y mantener.
