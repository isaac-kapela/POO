package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdutoAlimenticio extends Produto {
    private LocalDate validade;

    public ProdutoAlimenticio(String nome, double precoBase, LocalDate validade) {
        super(nome, precoBase);
        if (validade == null || validade.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Data de validade inválida");
        }
        this.validade = validade;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public double calcularPrecoFinal() {
        long diasParaVencer = ChronoUnit.DAYS.between(LocalDate.now(), validade);
        double desconto = diasParaVencer <= 5 ? 0.3 : 0.0;
        return this.getPrecoBase() * (1 - desconto);
    }
}
