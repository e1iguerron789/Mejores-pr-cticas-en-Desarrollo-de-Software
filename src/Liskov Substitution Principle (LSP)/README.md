# Liskov Substitution Principle (LSP)

En el codigo original, `Fish` heredaba de `Animal` y estaba obligada a tener el metodo `walk()`, aunque un pez no puede caminar. Por eso la clase lanzaba una excepcion `UnsupportedOperationException`, rompiendo el principio LSP.

Para aplicar LSP, se separo el comportamiento comun de los animales del comportamiento especifico de caminar:

- `Animal`: contiene el comportamiento comun `makeSound()`.
- `Walkable`: representa solo a los animales que pueden caminar.
- `Dog`: extiende `Animal` e implementa `Walkable`.
- `Fish`: extiende `Animal`, pero no implementa `Walkable`.

Con esta refactorizacion, cualquier clase que se use como `Animal` puede hacer sonido correctamente. Solo los animales que realmente caminan implementan `Walkable`.

El problema que se resolvio fue que una subclase no podia cumplir correctamente con el contrato de su clase base. Ahora no se generan excepciones por comportamientos que no aplican, y las clases son sustituibles de forma correcta.
