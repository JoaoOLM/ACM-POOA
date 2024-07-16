package com.example.consultasmedicas.domain;

public class Rating {
    // Atributos 
    private Long id;
    private int classificacao;
    private String comentario;

    // Relacionamento

    // Métodos 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
