package com.neol.patterns.estructurales.decorator;

public final class Demo {
    private Demo() {}

    public static void main(String[] args) {
        Bebida bebida = new ConCanela(new ConLeche(new Cafe()));
        System.out.println(bebida.centimos());
    }
}
