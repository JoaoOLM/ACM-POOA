package com.example.consultasmedicas.services.appointment;

import com.example.consultasmedicas.interfaces.AppointmentAlteration;
import com.example.consultasmedicas.model.Appointment;

public class StatusAlteration implements AppointmentAlteration {
    private static StatusAlteration instance;

    private StatusAlteration() {
    }

    public static StatusAlteration getInstance() {
        if (instance == null)
            instance = new StatusAlteration();

        return instance;
    }

    @Override
    public String getText(Appointment consulta) {
        return "O status da consulta (" + consulta.toString() + ") foi alterado para: "
                + consulta.getStatus().toString();
    }

}
