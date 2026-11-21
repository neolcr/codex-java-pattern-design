package com.neol.patterns.comportamiento.observer;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var inventario = new Inventario();
        inventario.suscribir(unidades -> System.out.println("Disponible: " + unidades));
        inventario.actualizar(3);
    }
}
