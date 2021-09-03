package br.com.zup.lidiane.investimento.clientetest;

import br.com.zup.lidiane.investimento.simulacao.SimulacaoAplicacao;
import br.com.zup.lidiane.investimento.simulacao.SimulacaoAplicacaoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class SimulacaoAplicacaoserviceTest {

    @Autowired
    private SimulacaoAplicacaoService simulacaoAplicacaoService;

    private SimulacaoAplicacao simulacaoAplicacao;
    private Object LocalDate;


    @Test
    public void calcularRendaFixaTest(){
        double objetoDeTeste = simulacaoAplicacaoService.calcularRendaFixa( 1000, 12 );

        Assertions.assertEquals(12, objetoDeTeste );
    }

    @Test
    public void calcularDataResgate(){
        LocalDate objetoDeTeste = simulacaoAplicacaoService.calcularDataResgate( 12 );
        Assertions.assertEquals( LocalDate, objetoDeTeste );
    }


}
