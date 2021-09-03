package br.com.zup.lidiane.investimento.simulacao;

import org.springframework.stereotype.Service;

@Service
public class SimulacaoAplicacaoService {

    public double calcularRendaFixa(double valorAplicado, int qtdMeses){
        double valorRendaFixa = (valorAplicado * ((0.5/100) * qtdMeses));

        return valorRendaFixa;
    }
}
