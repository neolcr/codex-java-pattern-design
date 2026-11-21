package com.neol.patterns.estructurales.facade;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var confirmaciones = new Confirmaciones();
        var taller = new InscripcionTaller(new Aforo(1), confirmaciones);
        taller.inscribir("Ana");
        System.out.println(confirmaciones.enviadas());
    }
}
