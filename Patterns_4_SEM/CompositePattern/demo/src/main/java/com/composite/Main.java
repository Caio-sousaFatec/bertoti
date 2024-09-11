package com.composite;

import com.composite.model.Automovel;
import com.composite.model.Marca;

public class Main {
    public static void main(String[] args) {
        Automovel automovel1 = new Automovel("Moto", "CB500", "verde", 499.0);
        Automovel automovel2 = new Automovel("Carro", "Civic", "preto", 2000.0);
        Automovel automovel3 = new Automovel("Carro", "Gol", "branco", 1000.0);
        Automovel automovel4 = new Automovel("Moto", "XRE300", "preta", 300.0);

        Marca honda = new Marca("Honda");
        Marca marca2 = new Marca("Volkswagen");

        honda.add(automovel1);
        honda.add(automovel4);
        marca2.add(automovel2);
        marca2.add(automovel3);

        Marca concessionaria = new Marca("Concessionaria");
        concessionaria.add(honda);
        concessionaria.add(marca2);

        concessionaria.mostrarVeiculo();

    }
}