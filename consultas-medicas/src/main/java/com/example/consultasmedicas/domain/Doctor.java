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
    public String getCRM() {
        return CRM;
    }

    public void setCRM(String cRM) {
        CRM = cRM;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Float getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(Float avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }

    public List<Appointment> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Appointment> consultas) {
        this.consultas = consultas;
    }

    public List<Availability> getDisponibilidades() {
        return disponibilidades;
    }

    public void setDisponibilidades(List<Availability> disponibilidades) {
        this.disponibilidades = disponibilidades;
    }

    public List<Speciality> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Speciality> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Insurance> getConvenios() {
        return convenios;
    }

    public void setConvenios(List<Insurance> convenios) {
        this.convenios = convenios;
    }

    public List<Service> getServicos() {
        return servicos;
    }

    public void setServicos(List<Service> servicos) {
        this.servicos = servicos;
    }

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