package com.example.consultasmedicas.appointment;

import java.time.LocalDateTime;
import java.util.List;

import com.example.consultasmedicas.doctor.Doctor;
import com.example.consultasmedicas.domain.Local;
import com.example.consultasmedicas.domain.Patient;
import com.example.consultasmedicas.enums.TipoAlteracao;
import com.example.consultasmedicas.interfaces.AppointmentSubscriber;

public class Appointment {
    // Atributos
    private Long id;
    private List<AppointmentSubscriber> subscribers;
    private List<String> anotacoes;
    private double valor;
    private String status;
    private LocalDateTime dataHora;

    // Relacionamentos
    private Patient paciente;
    private Doctor medico;
    private Local local;

    // Métodos

    public void fazerAnotacao(String anotacao) {
        anotacoes.add(anotacao);
        System.out.println("A seguinte anotação foi adicionada a consulta (" + toString() "):\n"+ anotacao);
    }

    public String toString() {
        int day = dataHora.getDayOfMonth();
        int month = dataHora.getMonthValue();
        int year = dataHora.getYear();
        int hour = dataHora.getHour();
        int minutes = dataHora.getMinute();

        return day + "/" + month + "/" + year + " Horário: " + hour + ":" + minutes;
    }

    public void adicionarSubscriber(AppointmentSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removerSubscriber(AppointmentSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notificarSubscribers(TipoAlteracao alteracao) {
        switch (alteracao) {
            case TipoAlteracao.DATA:

                break;

            default:
                break;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AppointmentSubscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<AppointmentSubscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
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

}
