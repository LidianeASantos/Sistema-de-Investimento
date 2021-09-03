package br.com.zup.lidiane.investimento.cliente;

import br.com.zup.lidiane.investimento.dtos.ClienteSimulacaoDto;
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
    private SimulacaoAplicacaoDto simulacaoAplicacaoDto;
    
    public ClienteSimulacaoDto salvarSimulacaoCliente(ClienteSimulacaoDto clienteSimulacaoDto){
        simulacaoAplicacaoDto.setRendimento( simulacaoAplicacaoService.calcularRendaFixa( clienteSimulacaoDto.getValorAplicado(),
                clienteSimulacaoDto.getMesesAplicado()));
        simulacaoAplicacaoDto.setDataDeResgate( simulacaoAplicacaoService.calcularDataResgate( clienteSimulacaoDto.getMesesAplicado() ) );
        simulacaoAplicacaoDto.setValorAplicado( clienteSimulacaoDto.getValorAplicado() );
        return clienteRepository.save( clienteSimulacaoDto );

    }


}
