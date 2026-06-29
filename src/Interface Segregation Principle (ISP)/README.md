# Interface Segregation Principle (ISP)

En el codigo original, la interfaz `Device` obligaba a todos los dispositivos a implementar `turnOn()`, `turnOff()` y `charge()`. El problema era que no todos los dispositivos pueden cargarse. Por eso `DisposableCamera` tenia que implementar `charge()` aunque no lo necesitaba, y terminaba lanzando una excepcion en tiempo de ejecucion.

Para aplicar ISP, la interfaz grande se dividio en interfaces mas especificas:

- `Switchable`: para dispositivos que pueden encenderse y apagarse.
- `Rechargeable`: para dispositivos que pueden cargarse.

Ahora `Phone` implementa `Switchable` y `Rechargeable`, mientras que `DisposableCamera` solo implementa `Switchable`. Asi cada clase depende unicamente de los metodos que realmente necesita.

El problema que se resolvio fue obligar a una clase a depender de metodos que no podia usar. El codigo queda mas claro, mas seguro y no genera excepciones innecesarias.
