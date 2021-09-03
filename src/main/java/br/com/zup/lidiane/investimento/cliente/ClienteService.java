package br.com.zup.lidiane.investimento.cliente;

import br.com.zup.lidiane.investimento.dtos.ClienteSimulacaoDto;
import br.com.zup.lidiane.investimento.simulacao.SimulacaoAplicacao;
import br.com.zup.lidiane.investimento.simulacao.SimulacaoAplicacaoDto;
import br.com.zup.lidiane.investimento.simulacao.SimulacaoAplicacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private SimulacaoAplicacaoService simulacaoAplicacaoService;


    @Autowired
    private SimulacaoAplicacao simulacaoAplicacao;

    public Cliente salvarSimulacaoCliente(Cliente cliente){
        simulacaoAplicacao.setRendimento( simulacaoAplicacaoService.calcularRendaFixa( cliente.getValorAplicado(),
                cliente.getMesesAplicado()));
        simulacaoAplicacao.setDataDeResgate( simulacaoAplicacaoService.calcularDataResgate( cliente.getMesesAplicado() ) );
        simulacaoAplicacao.setValorAplicado( cliente.getValorAplicado() );
        return clienteRepository.save( cliente );

    }


}
