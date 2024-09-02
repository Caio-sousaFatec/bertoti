/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
