package com.strategy;

import java.util.List;

public class Carrinho {

    List<Item> itens;
    double valorTotal;

    public Carrinho(List<Item> itens) {
        this.itens = itens;
    }

    Double getValorTotal() {
        for (Item item : itens) {
            valorTotal += item.getValor();
        }

        return valorTotal;
    }

}
