package com.strategy.estrategys;

public class PagamentoPorCartao implements EstrategiasDePagamento {

    @Override
    public boolean pagar(double saldoCredito, double valor) {
        if (saldoCredito < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        } else {
            coletarPagamento(valor);
            return true;
        }
    }

    @Override
    public void coletarPagamento(double valor) {
        System.out.println("Coletando " + valor + " por cartão");
    }

}
