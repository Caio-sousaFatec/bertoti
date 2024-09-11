package com.composite.model;

import com.composite.component.EstoqueComponent;

/**
 *
 * @author Caio Sousa
 */
public class Automovel implements EstoqueComponent {
    private String tipo;
    private String modelo;
    private String cor;
    private Double cilindradas;

    public Automovel(String tipo, String modelo, String cor, Double cilindradas) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.cilindradas = cilindradas;
    }

    @Override
    public void mostrarVeiculo() {
        System.out.println("-------------------------------");
        System.out.println("Tipo: " + tipo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("-------------------------------");
    }
}
