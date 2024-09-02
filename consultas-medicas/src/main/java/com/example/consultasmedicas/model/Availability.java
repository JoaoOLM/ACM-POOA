package com.example.consultasmedicas.model;

import java.sql.Time;
import java.time.DayOfWeek;

public class Availability {
    // Atributos
    private DayOfWeek diaDaSemana;
    private Time horaInicio;
    private Time horaFim;

    // Relacionamentos

    // Métodos
    public DayOfWeek getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(DayOfWeek DiaDaSemana) {
        this.diaDaSemana = DiaDaSemana;
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

    public String toString() {
        return diaDaSemana.name() + "-" + horaInicio.toString() + "~" + horaFim.toString();
    }

}
