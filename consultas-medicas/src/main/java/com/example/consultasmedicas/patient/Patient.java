package com.example.consultasmedicas.patient;

import java.util.List;

import com.example.consultasmedicas.appointment.Appointment;

public class Patient extends User {
    // Atributos

    // Relacionamentos
    private List<Appointment> consultas;
    private List<Insurance> convenios;

    // Métodos
    public List<Appointment> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Appointment> consultas) {
        this.consultas = consultas;
    }

    public List<Insurance> getConvenios() {
        return convenios;
    }

    public void setConvenios(List<Insurance> convenios) {
        this.convenios = convenios;
    }

    @Override
    public void realizarCadastro() {

    }

    @Override
    public void alterarDados() {

    }

    public void agendarConsulta() {

    }

    public void excluirConsulta() {

    }

    public void visualizarHistorico() {

    }

    public void avaliarMedico() {

    }

}
