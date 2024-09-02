package com.example.consultasmedicas.model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class Availability {
    // Atributos
    private DayOfWeek diaDaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;

    // Métodos

    public DayOfWeek getDiaDaSemana() {
        return diaDaSemana;
    }

    public Availability(DayOfWeek diaDaSemana, LocalTime horaInicio, LocalTime horaFim) {
        this.diaDaSemana = diaDaSemana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public void setDiaDaSemana(DayOfWeek DiaDaSemana) {
        this.diaDaSemana = DiaDaSemana;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public String toString() {
        return diaDaSemana.name() + " - " + horaInicio.toString() + " ~ " + horaFim.toString();
    }

}
