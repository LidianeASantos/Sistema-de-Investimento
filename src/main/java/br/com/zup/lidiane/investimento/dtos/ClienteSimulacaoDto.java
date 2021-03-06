package br.com.zup.lidiane.investimento.dtos;

import br.com.zup.lidiane.investimento.simulacao.SimulacaoAplicacaoDto;

import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class ClienteSimulacaoDto {

    private Long id;
    @NotBlank(message = "{validacao.nome.cliente}")
    private String nome;
    @Email(message = "{validacao.email.cliente}")
    private String email;
    @NotBlank(message = "{validacao.valorAplicado.cliente}")
    @OneToMany
    private SimulacaoAplicacaoDto valorAplicado;
    @NotBlank(message = "{validacao.mesesAplicado.cliente}")
    private int mesesAplicado;

    public ClienteSimulacaoDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClienteSimulacaoDto getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(SimulacaoAplicacaoDto valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public int getMesesAplicado() {
        return mesesAplicado;
    }

    public void setMesesAplicado(int mesesAplicado) {
        this.mesesAplicado = mesesAplicado;
    }
}
