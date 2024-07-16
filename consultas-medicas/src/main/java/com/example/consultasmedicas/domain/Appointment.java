package com.example.consultasmedicas.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Appointment {
    // Atributos
    private Long id;
    private LocalDate data;
    private LocalTime hora;
    private String status;
    private double valor;
    private String anotacoes;

    // Relacionamentos
    private Patient responsavel;
    private Patient paciente;
    private Doctor medico;
    private Local local;
    private Rating avaliacao;
    private List<Service> servicos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public Patient getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Patient responsavel) {
        this.responsavel = responsavel;
    }

    public Patient getPaciente() {
        return paciente;
    }

    public void setPaciente(Patient paciente) {
        this.paciente = paciente;
    }

    public Doctor getMedico() {
        return medico;
    }

    public void setMedico(Doctor medico) {
        this.medico = medico;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Rating getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Rating avaliacao) {
        this.avaliacao = avaliacao;
    }

    public List<Service> getServicos() {
        return servicos;
    }

    public void setServicos(List<Service> servicos) {
        this.servicos = servicos;
    }

    // Métodos
    public void cancelarConsulta() {
        
    }

    public void fazerAnotacoes() {
        
    }
}
