package com.example.consultasmedicas.model;

public class Local {
    // Atributos
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String fotos;

    // Métodos

    public Long getId() {
        return id;
    }

    public Local(Long id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public String toString() {
        return getNome() + " - " + getEndereco() + ". Tel: " + getTelefone();
    }
}
