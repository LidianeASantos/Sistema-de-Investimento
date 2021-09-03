package br.com.zup.lidiane.investimento.dtos;

import java.time.LocalDate;

public class SimulacaoAplicacaoDto {

    private double valorAplicado;
    private double rendimento;
    private LocalDate dataDeResgate;

    public SimulacaoAplicacaoDto() {
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public LocalDate getDataDeResgate() {
        return dataDeResgate;
    }

    public void setDataDeResgate(LocalDate dataDeResgate) {
        this.dataDeResgate = dataDeResgate;
    }
}
