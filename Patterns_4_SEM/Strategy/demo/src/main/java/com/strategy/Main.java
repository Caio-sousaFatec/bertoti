package com.strategy;

import java.util.List;
import java.util.Scanner;

import com.strategy.estrategys.PagamentoPorCartao;
import com.strategy.estrategys.PagamentoReal;

public class Main {
    public static void main(String[] args) {

        Carteira carteira = new Carteira(10, 10);

        Item item1 = new Item("item1", 10.0);
        Item item2 = new Item("item2", 10.0);

        Carrinho carrinho = new Carrinho(List.of(item1, item2));

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1 para pagar com cartão ou 2 para pagar em dinheiro");

        int opcao = scan.nextInt();

        switch (opcao) {
            case (1):
                PagamentoPorCartao pagamentoCRED = new PagamentoPorCartao();
                pagamentoCRED.pagar(carteira.getSaldoFisico(), carrinho.getValorTotal());
                scan.close();
                break;
            case (2):
                PagamentoReal pagamento = new PagamentoReal();
                pagamento.pagar(carteira.getSaldoFisico(), carrinho.getValorTotal());
                scan.close();
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}