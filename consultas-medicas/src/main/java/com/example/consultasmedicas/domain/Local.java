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
    
}
