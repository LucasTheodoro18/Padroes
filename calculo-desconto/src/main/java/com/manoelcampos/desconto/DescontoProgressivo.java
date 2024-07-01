package com.manoelcampos.desconto;

// Estratégia para desconto progressivo
public class DescontoProgressivo implements Desconto{
    @Override
    public double calcularDesconto(double valorCompra, Cliente cliente) {
        double desconto = Math.min(valorCompra / 25, 0.2 * valorCompra);
        return desconto;
    }
}

