package com.neol.patterns.creacionales.prototype;

import java.util.ArrayList;
import java.util.List;

final class ListaTareas implements Prototipo<ListaTareas> {
    private final List<String> tareas;

    ListaTareas(List<String> tareas) {
        this.tareas = new ArrayList<>(tareas);
    }

    void agregar(String tarea) {
        tareas.add(tarea);
    }

    List<String> tareas() {
        return List.copyOf(tareas);
    }

    public ListaTareas copiar() {
        return new ListaTareas(tareas);
    }
}
