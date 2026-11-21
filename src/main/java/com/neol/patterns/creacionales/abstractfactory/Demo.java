package com.neol.patterns.creacionales.abstractfactory;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        FabricaRegion region = new FabricaEspanola();
        System.out.println(region.crearBoton().etiqueta() + " " + region.crearFormato().formatear(20));
    }
}
