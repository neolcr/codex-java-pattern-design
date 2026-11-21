# Patrones de diseño GoF en Java

Este repositorio reúne los 23 patrones de diseño descritos por la Gang of Four. Cada ejemplo muestra un problema concreto, la colaboración entre sus participantes y el comportamiento esperado mediante pruebas JUnit 5. Los ejemplos son independientes y usan la biblioteca estándar de Java.

## Requisitos

- JDK 21, con `JAVA_HOME` apuntando al JDK.
- Maven 3.9, disponible en el `PATH`. Comprueba con `mvn -version` que usa Java 21.

## Compilación, pruebas y demos

```sh
mvn clean verify
```

El comando limpia, compila, ejecuta las pruebas y genera el JAR en `target/`. Para ejecutar solo la fase de pruebas, usa `mvn test`. Los informes de Surefire quedan en `target/surefire-reports/`.

Tras compilar, puedes ejecutar cualquier demo desde la raíz. Por ejemplo:

```sh
java -cp target/classes com.neol.patterns.creacionales.builder.Demo
```

## Categorías

| Categoría | Pregunta de diseño | Ejemplo |
| --- | --- | --- |
| Creacionales | ¿Cómo se crean y configuran los objetos? | Abstract Factory crea productos de una familia compatible. |
| Estructurales | ¿Cómo se componen los objetos y sus interfaces? | Composite organiza hojas y grupos en un árbol. |
| De comportamiento | ¿Cómo colaboran los objetos y se reparten las responsabilidades? | Observer difunde los cambios a los suscriptores. |

## Los 23 patrones

| Categoría | Patrón | Guía | Fuentes |
| --- | --- | --- | --- |
| Creacionales | Singleton | [Ficha](docs/creacionales/singleton.md) | [Código](src/main/java/com/neol/patterns/creacionales/singleton/) |
| Creacionales | Factory Method | [Ficha](docs/creacionales/factorymethod.md) | [Código](src/main/java/com/neol/patterns/creacionales/factorymethod/) |
| Creacionales | Abstract Factory | [Ficha](docs/creacionales/abstractfactory.md) | [Código](src/main/java/com/neol/patterns/creacionales/abstractfactory/) |
| Creacionales | Builder | [Ficha](docs/creacionales/builder.md) | [Código](src/main/java/com/neol/patterns/creacionales/builder/) |
| Creacionales | Prototype | [Ficha](docs/creacionales/prototype.md) | [Código](src/main/java/com/neol/patterns/creacionales/prototype/) |
| Estructurales | Adapter | [Ficha](docs/estructurales/adapter.md) | [Código](src/main/java/com/neol/patterns/estructurales/adapter/) |
| Estructurales | Bridge | [Ficha](docs/estructurales/bridge.md) | [Código](src/main/java/com/neol/patterns/estructurales/bridge/) |
| Estructurales | Composite | [Ficha](docs/estructurales/composite.md) | [Código](src/main/java/com/neol/patterns/estructurales/composite/) |
| Estructurales | Decorator | [Ficha](docs/estructurales/decorator.md) | [Código](src/main/java/com/neol/patterns/estructurales/decorator/) |
| Estructurales | Facade | [Ficha](docs/estructurales/facade.md) | [Código](src/main/java/com/neol/patterns/estructurales/facade/) |
| Estructurales | Flyweight | [Ficha](docs/estructurales/flyweight.md) | [Código](src/main/java/com/neol/patterns/estructurales/flyweight/) |
| Estructurales | Proxy | [Ficha](docs/estructurales/proxy.md) | [Código](src/main/java/com/neol/patterns/estructurales/proxy/) |
| De comportamiento | Chain of Responsibility | [Ficha](docs/comportamiento/chainofresponsibility.md) | [Código](src/main/java/com/neol/patterns/comportamiento/chainofresponsibility/) |
| De comportamiento | Command | [Ficha](docs/comportamiento/command.md) | [Código](src/main/java/com/neol/patterns/comportamiento/command/) |
| De comportamiento | Interpreter | [Ficha](docs/comportamiento/interpreter.md) | [Código](src/main/java/com/neol/patterns/comportamiento/interpreter/) |
| De comportamiento | Iterator | [Ficha](docs/comportamiento/iterator.md) | [Código](src/main/java/com/neol/patterns/comportamiento/iterator/) |
| De comportamiento | Mediator | [Ficha](docs/comportamiento/mediator.md) | [Código](src/main/java/com/neol/patterns/comportamiento/mediator/) |
| De comportamiento | Memento | [Ficha](docs/comportamiento/memento.md) | [Código](src/main/java/com/neol/patterns/comportamiento/memento/) |
| De comportamiento | Observer | [Ficha](docs/comportamiento/observer.md) | [Código](src/main/java/com/neol/patterns/comportamiento/observer/) |
| De comportamiento | State | [Ficha](docs/comportamiento/state.md) | [Código](src/main/java/com/neol/patterns/comportamiento/state/) |
| De comportamiento | Strategy | [Ficha](docs/comportamiento/strategy.md) | [Código](src/main/java/com/neol/patterns/comportamiento/strategy/) |
| De comportamiento | Template Method | [Ficha](docs/comportamiento/templatemethod.md) | [Código](src/main/java/com/neol/patterns/comportamiento/templatemethod/) |
| De comportamiento | Visitor | [Ficha](docs/comportamiento/visitor.md) | [Código](src/main/java/com/neol/patterns/comportamiento/visitor/) |
