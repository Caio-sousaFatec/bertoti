package com.strategy.estrategys;

public interface EstrategiasDePagamento {

    boolean pagar(double saldoCarteira, double valor);

    void coletarPagamento(double valor);

}
