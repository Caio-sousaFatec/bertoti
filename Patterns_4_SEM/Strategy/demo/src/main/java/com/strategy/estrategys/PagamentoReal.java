package com.strategy.estrategys;

public class PagamentoReal implements EstrategiasDePagamento {

    @Override
    public boolean pagar(double saldoCarteira, double valor) {
        if (saldoCarteira < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            coletarPagamento(valor);
            return true;
        }
    }

    @Override
    public void coletarPagamento(double valor) {
        System.out.println("Coletando " + valor + " em dinheiro");
    }

}
