package com.neol.patterns.comportamiento.command;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var impresora = new Impresora();
        var cola = new ColaImpresion();
        cola.programar(new Imprimir(impresora, "Factura 42"));
        cola.procesar();
        System.out.println(impresora.paginas());
    }
}
