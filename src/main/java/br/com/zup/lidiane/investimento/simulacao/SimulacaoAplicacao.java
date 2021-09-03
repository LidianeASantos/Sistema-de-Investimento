package br.com.zup.lidiane.investimento.simulacao;

import br.com.zup.lidiane.investimento.cliente.Cliente;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "simulacao")
public class SimulacaoAplicacao {

    private Cliente valorAplicado;
    private double rendimento;
    private LocalDate dataDeResgate;

    public SimulacaoAplicacao() {
    }

    public Cliente getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(Cliente valorAplicado) {
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
