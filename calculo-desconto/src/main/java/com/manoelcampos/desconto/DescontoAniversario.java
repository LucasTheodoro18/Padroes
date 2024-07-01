package com.manoelcampos.desconto;

public class DescontoAniversario implements Desconto {

    @Override
    public double calcularDesconto(double valorCompra, Cliente cliente) {
            if (cliente.temAniversarioHoje()) {
                return valorCompra * 0.15;
            } else {
                return 0;
        }
    }
}
