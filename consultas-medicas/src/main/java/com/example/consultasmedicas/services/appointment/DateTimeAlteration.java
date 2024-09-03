package com.example.consultasmedicas.services.appointment;

import com.example.consultasmedicas.interfaces.AppointmentAlteration;
import com.example.consultasmedicas.model.Appointment;

public class DateTimeAlteration implements AppointmentAlteration {
    private static DateTimeAlteration instance;

    private DateTimeAlteration() {
    }

    public static DateTimeAlteration getInstance() {
        if (instance == null)
            instance = new DateTimeAlteration();

        return instance;
    }

    @Override
    public String getText(Appointment consulta) {
        return "A data e horario da consulta (" + consulta.toString() + ") foi alterado para: "
                + consulta.getDataHora().toString();
    }

}
