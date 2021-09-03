package br.com.zup.lidiane.investimento.clientetest;

import br.com.zup.lidiane.investimento.cliente.Cliente;
import br.com.zup.lidiane.investimento.cliente.ClienteRepository;
import br.com.zup.lidiane.investimento.cliente.ClienteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class ClienteServiceTest {

    @Autowired
    private ClienteService clienteService;

    @MockBean
    private ClienteRepository clienteRepository;

    @Test
    public void salvarSimulacaoClientTest(){
        Cliente cliente = new Cliente();
        Mockito.when( clienteRepository.save( Mockito.any(Cliente.class))).thenReturn( cliente );

        Cliente objetoDeTeste = clienteService.salvarSimulacaoCliente(cliente );

        Assertions.assertEquals( cliente, objetoDeTeste );

    }
}
