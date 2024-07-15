package com.example.consultasmedicas.domain;

import java.util.List;

public class Patient extends User {
    // Atributos 

    // Relacionamentos 
    private List<Appointment> consultas;
    private List<Insurance> convenios;

    // Métodos
    @Override
    public void realizarCadastro() {
        
    }
    
    @Override
    public void alterarDados() {
        
    }
    
    public void agendarConsulta() {
        
    }
    
    public void visualizarHistorico() {
        
    }
    
    public void avaliarMedico() {
        
    }
}
