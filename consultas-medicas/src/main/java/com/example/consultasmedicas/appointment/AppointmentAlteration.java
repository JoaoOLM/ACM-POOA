package com.example.consultasmedicas.appointment;

abstract class AppointmentAlteration {
    private static AppointmentAlteration instance;

    public abstract AppointmentAlteration getInstance();

    private abstract AppointmentAlteration();
}
