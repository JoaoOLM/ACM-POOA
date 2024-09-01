package com.example.consultasmedicas.doctor;

import java.time.LocalDateTime;

import com.example.consultasmedicas.appointment.Appointment;
import com.example.consultasmedicas.common.Local;
import com.example.consultasmedicas.patient.Patient;

public interface DoctorAppointmentService {
    public List<Appointment> listarConsultas();

    public Appointment criarConsulta(Doctor doctor, Patient patient, LocalDateTime dataHora, Local local);

    public void cancelarConsulta(Appointment consulta);

    public void reagendarConsulta(Appointment consulta, LocalDateTime novaDataHora);
}
