package br.com.zup.lidiane.investimento.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void salvarSimulacaoCliente(Cliente cliente){
        clienteRepository.save( cliente );
    }

}
