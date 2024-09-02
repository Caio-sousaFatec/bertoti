/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.observer;

/**
 *
 * @author Caio Sousa
 */
public interface PublisherInterface {
    public void add(EstoqueInterface observer);

    public void remove(EstoqueInterface observer);

    public void notifyObservers(String name, Integer quantidade);
}
