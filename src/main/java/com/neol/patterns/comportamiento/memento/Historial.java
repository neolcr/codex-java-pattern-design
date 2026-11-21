package com.neol.patterns.comportamiento.memento;

import java.util.ArrayDeque;
import java.util.Deque;

final class Historial {
    private final Editor editor;
    private final Deque<Editor.Instantanea> versiones = new ArrayDeque<>();

    Historial(Editor editor) {
        this.editor = editor;
    }

    void guardar() {
        versiones.push(editor.guardar());
    }

    boolean deshacer() {
        if (versiones.isEmpty()) {
            return false;
        }
        editor.restaurar(versiones.pop());
        return true;
    }
}
