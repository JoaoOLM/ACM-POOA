package com.example.consultasmedicas.domain;

import java.util.List;

public class Doctor extends User {
    // Atributos
    private String CRM;
    private String formacao;
    private Float avaliacaoMedia;

    // Relacionamentos
    private List<Appointment> consultas;
    private List<Availability> disponibilidades;
    private List<Speciality> especialidades;
    private List<Insurance> convenios;
    private List<Service> servicos;

    // Métodos
    @Override
    public void realizarCadastro() {

    }

    @Override
    public void alterarDados() {
        
    }

    public void alterarDisponibilidade() {
        
    }

    public void incluirConsulta() {
        
    }

    public void excluirConsulta() {
        
    }

    public void editarPerfil() {
        
    }

    public void visualizarConsultas() {
        
    }
}