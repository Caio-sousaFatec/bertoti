
package com.observer;

/**
 *
 * @author Caio Sousa
 */
public class Estoque implements EstoqueInterface {

    String name;

    public Estoque(String name) {
        name = this.name;
    }

    @Override
    public void update(Integer quantidade, String name) {
        System.out.println("Estoque atual: " + quantidade + " de " + name);
    }
}
