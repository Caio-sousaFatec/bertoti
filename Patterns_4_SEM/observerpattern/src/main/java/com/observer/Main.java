package com.observer;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Estoque estoque = new Estoque("Tênis");

        publisher.add(estoque);

        publisher.setEstoque("Tênis", 10);
        publisher.setEstoque("Jaquetas", 20);

        publisher.remove(estoque);

        publisher.setEstoque("Jaquetas", 14); // note que não realizará o terceiro print

        publisher.add(estoque);

        publisher.setEstoque("tênis", 4);

    }
}