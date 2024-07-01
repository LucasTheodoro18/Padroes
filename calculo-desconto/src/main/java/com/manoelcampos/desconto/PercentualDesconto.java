package com.manoelcampos.desconto;

public class PercentualDesconto implements Desconto{
    private double percentual;

    public PercentualDesconto(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcularDesconto(double valorCompra, Cliente cliente) {
        return valorCompra * (percentual / 100);
    }
}
