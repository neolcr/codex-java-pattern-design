package com.neol.patterns.creacionales.prototype;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var plantilla = new ListaTareas(java.util.List.of("Confirmar sala"));
        var reunion = plantilla.copiar();
        reunion.agregar("Invitar al equipo");
        System.out.println(reunion.tareas());
    }
}
