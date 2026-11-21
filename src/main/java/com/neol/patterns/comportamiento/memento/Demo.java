package com.neol.patterns.comportamiento.memento;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        var editor = new Editor();
        var historial = new Historial(editor);
        editor.escribir("Borrador");
        historial.guardar();
        editor.escribir("Versión publicada");
        historial.deshacer();
        System.out.println(editor.texto());
    }
}
