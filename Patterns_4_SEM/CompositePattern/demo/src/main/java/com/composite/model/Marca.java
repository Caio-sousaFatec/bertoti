package com.composite.model;

import java.util.ArrayList;
import java.util.List;

import com.composite.component.EstoqueComponent;

/**
 *
 * @author Caio Sousa
 */
public class Marca implements EstoqueComponent {

    private String nome;
    private List<EstoqueComponent> components = new ArrayList<>();

    public Marca(String nome) {
        this.nome = nome;
    }

    public void add(EstoqueComponent component) {
        components.add(component);
    }

    public void remove(EstoqueComponent component) {
        components.remove(component);
    }

    @Override
    public void mostrarVeiculo() {
        System.out.println("Marca: " + nome);
        for (EstoqueComponent component : components) {
            component.mostrarVeiculo();
        }
    }

}
