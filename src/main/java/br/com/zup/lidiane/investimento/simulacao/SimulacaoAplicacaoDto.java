package br.com.zup.lidiane.investimento.simulacao;

import br.com.zup.lidiane.investimento.dtos.SimulacaoDto;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class SimulacaoAplicacaoDto {

    @ManyToOne
    private SimulacaoDto valorAplicado;
    private double rendimento;
    private LocalDate dataDeResgate;

    public SimulacaoAplicacaoDto() {
    }

    public SimulacaoDto getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(SimulacaoDto valorAplicado) {
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
