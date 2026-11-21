package com.neol.patterns.estructurales.flyweight;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var catalogo = new CatalogoIconos();
        System.out.println(new Marcador(catalogo.obtener("Museo"), 2, 5).dibujar());
        System.out.println(new Marcador(catalogo.obtener("Museo"), 7, 6).dibujar());
    }
}
