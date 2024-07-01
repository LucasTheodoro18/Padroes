package com.manoelcampos.desconto;

public class SistemaDeVendas {
    private Desconto estrategiaDesconto;

    // Método para aplicar desconto de acordo com a estratégia escolhida
    public double aplicarDesconto(double valorCompra, Cliente cliente) {
        return estrategiaDesconto.calcularDesconto(valorCompra, cliente);
    }

    // Método para definir a estratégia de desconto
    public void setEstrategiaDesconto(Desconto estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }
}

