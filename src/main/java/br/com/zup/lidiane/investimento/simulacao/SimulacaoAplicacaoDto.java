package br.com.zup.lidiane.investimento.simulacao;

import br.com.zup.lidiane.investimento.dtos.ClienteSimulacaoDto;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class SimulacaoAplicacaoDto {

    @ManyToOne
    private ClienteSimulacaoDto valorAplicado;
    private double rendimento;
    private LocalDate dataDeResgate;

    public SimulacaoAplicacaoDto() {
    }

    public ClienteSimulacaoDto getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(ClienteSimulacaoDto valorAplicado) {
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
