package com.example.consultasmedicas.domain;

public class Service {
    // Atributos 
    private Long id;
    private String nome;
    private Double valor;
    private String descricao;
    
    public Service(Long id, String nome, Double valor, String descricao) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
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
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Relacionamentos 

    // Métodos 
    
}
