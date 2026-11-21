package com.neol.patterns.creacionales.builder;

final class ConstructorMarkdown implements ConstructorInforme {
    private String titulo;
    private int ventas;

    public void titulo(String titulo) {
        this.titulo = titulo;
    }

    public void total(int ventas) {
        this.ventas = ventas;
    }

    public String resultado() {
        return "# " + titulo + "\n\n**Total**: " + ventas;
    }
}
