package com.example.consultasmedicas.patient;

import java.time.DayOfWeek;

public interface PatientAppointmentService {
    public List<Appointment> listarConsultas();

    public Appointment agendarConsulta(String textoBusca, DayOfWeek diaSemana);

    public void cancelarConsulta();
}
