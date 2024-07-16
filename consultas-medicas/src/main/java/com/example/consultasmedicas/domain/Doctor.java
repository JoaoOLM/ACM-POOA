package com.example.consultasmedicas.domain;

import java.time.LocalDate;
import java.time.LocalTime;
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

    public Appointment criarConsulta(Patient paciente, LocalDate data, LocalTime hora, Local local, List<Service> servicos) {
        Appointment consulta = new Appointment();
        consulta.setPaciente(paciente);
        consulta.setMedico(this);
        consulta.setData(data);
        consulta.setHora(hora);
        consulta.setLocal(local);
        consulta.setServicos(servicos);
        this.consultas.add(consulta);
        return consulta;
    }

    public void adicionarServico(Service servico) {
        this.servicos.add(servico);
    }

    public void excluirConsulta() {
        
    }

    public void editarPerfil() {
        
    }

    public void visualizarConsultas() {
        
    }
}