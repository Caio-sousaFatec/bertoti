package com.strategy;

public class Carteira {

    public Double saldoCredito;
    public Double saldoFisico;

    public Carteira(double saldoCredito, double saldoFisico) {
        this.saldoFisico = saldoFisico;
        this.saldoCredito = saldoCredito;
    }

    public Double getSaldoCredito() {
        return saldoCredito;
    }

    public Double getSaldoFisico() {
        return saldoFisico;
    }

}
