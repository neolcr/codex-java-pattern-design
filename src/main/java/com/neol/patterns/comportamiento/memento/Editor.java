package com.neol.patterns.comportamiento.memento;

final class Editor {
    private String texto = "";

    void escribir(String texto) {
        this.texto = texto;
    }

    String texto() {
        return texto;
    }

    Instantanea guardar() {
        return new Instantanea(texto);
    }

    void restaurar(Instantanea instantanea) {
        texto = instantanea.texto;
    }

    static final class Instantanea {
        private final String texto;

        private Instantanea(String texto) {
            this.texto = texto;
        }
    }
}
