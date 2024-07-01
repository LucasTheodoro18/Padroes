package com.manoelcampos.desconto;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(10,"João", LocalDate.of(1990, 5, 15)); // Exemplo de data de aniversário

        SistemaDeVendas sistemaDeVendas = new SistemaDeVendas();

        // Exemplo de uso da estratégia de desconto percentual de 10%
        sistemaDeVendas.setEstrategiaDesconto(new PercentualDesconto(10));
        double desconto = sistemaDeVendas.aplicarDesconto(100.0, cliente);
        System.out.println("Desconto aplicado: " + desconto);

        // Exemplo de uso da estratégia de desconto progressivo
        sistemaDeVendas.setEstrategiaDesconto(new DescontoProgressivo());
        desconto = sistemaDeVendas.aplicarDesconto(200.0, cliente);
        System.out.println("Desconto aplicado: " + desconto);

        // Exemplo de uso da estratégia de desconto de aniversário
        sistemaDeVendas.setEstrategiaDesconto(new DescontoAniversario());
        desconto = sistemaDeVendas.aplicarDesconto(150.0, cliente);
        System.out.println("Desconto aplicado: " + desconto);
    }
}
