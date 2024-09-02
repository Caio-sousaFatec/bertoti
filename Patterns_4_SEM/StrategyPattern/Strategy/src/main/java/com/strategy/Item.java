package com.strategy;

public class Item {

    Double valor;
    String nome;

    public Item(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    };

}
