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
    private Local local;

    
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

    public void excluirConsulta() {
        
    }
   
    public void adicionarServico(Service servico) {
        this.servicos.add(servico);
    }
    public void excluirServico(Service servico) {
        
    }

    public void adicionarEspecialidade(Speciality especialidade) {
    this.especialidades.add(especialidade);
    }
    
    public void excluirEspecialidade(Speciality especialidade) {
    
    }
    
    public void adicionarConvenio(Insurance convenio) {
        this.convenios.add(convenio);
    }
    
    public void excluirConvenio(Insurance convenio) {
    
    }
    
    public void adicionarLocal(Local local) {
        this.local = local;
    }

    public void excluirLocal(Local local) {
    
    }

    public void editarPerfil() {
        
    }

    public void visualizarConsultas() {
        
    }
}