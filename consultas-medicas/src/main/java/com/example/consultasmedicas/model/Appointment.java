package com.example.consultasmedicas.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.consultasmedicas.enums.AppointmentStatus;
import com.example.consultasmedicas.interfaces.AppointmentSubscriber;

public class Appointment {
    // Atributos
    private Long id;
    private List<AppointmentSubscriber> subscribers;
    private List<String> anotacoes;
    private double valor;
    private AppointmentStatus status;
    private LocalDateTime dataHora;

    // Relacionamentos
    private Patient paciente;
    private Doctor medico;
    private Local local;

    // Métodos
    public void fazerAnotacao(String anotacao) {
        anotacoes.add(anotacao);
        System.out.println("A seguinte anotação foi adicionada a consulta (" + toString() + "):\n" + anotacao);
    }

    public Appointment(Long id, double valor, LocalDateTime dataHora, Patient paciente, Doctor medico, Local local) {
        this.id = id;
        this.valor = valor;
        this.dataHora = dataHora;
        this.paciente = paciente;
        this.medico = medico;
        this.local = local;
        this.anotacoes = new ArrayList<String>();
        this.subscribers = new ArrayList<AppointmentSubscriber>();
        this.status = AppointmentStatus.SCHEDULED;

        adicionarSubscriber(medico);
        adicionarSubscriber(paciente);
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

    public void notificarSubscribers(String msg) {
        for (AppointmentSubscriber sub : subscribers) {
            sub.notificarAlteracaoConsulta(msg);
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

    public List<String> getAnotacoes() {
        return anotacoes;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
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
