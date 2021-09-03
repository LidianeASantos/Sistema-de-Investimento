package br.com.zup.lidiane.investimento.cliente;

import br.com.zup.lidiane.investimento.simulacao.SimulacaoAplicacao;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    @Column(unique = true)
    private String email;
    @Column
    private String telefone;
    @OneToMany
    private SimulacaoAplicacao valorAplicado;
    private String mesesAplicado;

    public Cliente() {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public SimulacaoAplicacao getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(SimulacaoAplicacao valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public String getMesesAplicado() {
        return mesesAplicado;
    }

    public void setMesesAplicado(String mesesAplicado) {
        this.mesesAplicado = mesesAplicado;
    }
}
