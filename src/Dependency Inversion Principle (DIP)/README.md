# Dependency Inversion Principle (DIP)

En el codigo original, `PaymentProcessor` dependia directamente de `CreditCardPayment`. Esto hacia que la clase estuviera acoplada a un metodo de pago especifico y que fuera necesario modificarla cada vez que se agregara PayPal, Crypto u otro metodo.

Para aplicar DIP, se creo la interfaz `PaymentMethod`, que define el comportamiento comun de cualquier metodo de pago. Luego se implementaron clases concretas como `CreditCardPayment`, `PayPalPayment` y `CryptoPayment`.

Ahora `PaymentProcessor` depende de la abstraccion `PaymentMethod`, no de una implementacion concreta. Esto permite agregar nuevos metodos de pago creando nuevas clases que implementen la interfaz, sin modificar el procesador.

El problema que se resolvio fue la dependencia directa entre una clase de alto nivel y una clase concreta de bajo nivel. El codigo queda mas flexible, mas facil de extender y mas sencillo de probar.
