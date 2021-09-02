package br.com.zup.lidiane.investimento.cliente;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class ClienteDto {

    private Long id;
    @NotBlank
    private String nome;
    @Email
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    private double valorAplicado;
    @NotBlank
    private String mesesAplicado;

    public ClienteDto() {
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

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public String getMesesAplicado() {
        return mesesAplicado;
    }

    public void setMesesAplicado(String mesesAplicado) {
        this.mesesAplicado = mesesAplicado;
    }
}
