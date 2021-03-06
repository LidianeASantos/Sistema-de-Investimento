package br.com.zup.lidiane.investimento.simulacao;

import br.com.zup.lidiane.investimento.cliente.Cliente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SimulacaoAplicacaoService {

    public double calcularRendaFixa(Cliente valorAplicado, int qtdMeses){
        double valorRendaFixa = (valorAplicado * ((0.5/100) * qtdMeses));

        return valorRendaFixa;
    }

    public LocalDate calcularDataResgate(int qtdMeses){
        return LocalDate.now().plusMonths( qtdMeses );
    }


}
