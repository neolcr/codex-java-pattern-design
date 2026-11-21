# Guía del repositorio

El proyecto enseña los 23 patrones GoF con Java 21, Maven y JUnit 5.

- Ubica cada ejemplo en un paquete independiente `com.neol.patterns.<categoria>.<patron>`. Usa `creacionales`, `estructurales` o `comportamiento` como categoría.
- Usa nombres Java descriptivos en español y conserva los nombres oficiales de los patrones. Mantén las dependencias entre participantes dentro del ejemplo.
- Conserva un punto de entrada `Demo.main`, pruebas de comportamiento y una ficha por patrón.
- Mantén el diagrama Mermaid alineado con los tipos Java y actualiza los enlaces del README si cambian las rutas.
- Valida con `mvn test` y `mvn clean verify`. Ejecuta cada demo con `java -cp target/classes com.neol.patterns.<categoria>.<patron>.Demo`.
