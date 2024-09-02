package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caio Sousa
 */
public class Publisher implements PublisherInterface {
    private List<EstoqueInterface> observers = new ArrayList<>();

    @Override
    public void add(EstoqueInterface observer) {
        observers.add(observer);
    }

    @Override
    public void remove(EstoqueInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String name, Integer quantidade) {
        for (EstoqueInterface observer : observers) {
            observer.update(quantidade, name);
        }
    }

    public void setEstoque(String name, Integer quantidade) {
        notifyObservers(name, quantidade);
    }

}
