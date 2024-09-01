package com.example.consultasmedicas.doctor;

import java.sql.Time;
import java.time.DayOfWeek;

public class Availability {
    // Atributos
    private DayOfWeek DiaDaSemana;
    private Time horaInicio;
    private Time horaFim;

    // Relacionamentos

    // Métodos
    public DayOfWeek getDiaDaSemana() {
        return DiaDaSemana;
    }

    public void setDiaDaSemana(DayOfWeek DiaDaSemana) {
        this.DiaDaSemana = DiaDaSemana;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }

}
