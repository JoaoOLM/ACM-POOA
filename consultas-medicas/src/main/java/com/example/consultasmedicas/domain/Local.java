package com.example.consultasmedicas.domain;

import java.util.ArrayList;
import java.util.List;

public class Local {
    // Atributos
    private Long id;
    private String nome;  
    private String endereco; 
    private String telefone; 
    private String fotos; 

    // Relacionamentos
    private List<Doctor> medicos = new ArrayList<>();

    // Métodos
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

    public List<Doctor> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Doctor> medicos) {
        this.medicos = medicos;
    }
    
}
