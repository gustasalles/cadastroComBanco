package org.example.Model;

import java.util.Date;

public class UsuarioEntity {

    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private Date dt_nascimento;
    private String profissao;
    private String nacionalidade;
    private String sexo;

    public UsuarioEntity(int id, String nome, String cpf, String endereco, Date dt_nascimento, String profissao, String nacionalidade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dt_nascimento = dt_nascimento;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
    }

    public UsuarioEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}