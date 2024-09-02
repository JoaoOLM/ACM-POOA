package com.example.consultasmedicas.services;

import java.time.LocalDate;

import com.example.consultasmedicas.model.Doctor;
import com.example.consultasmedicas.model.Patient;

public class UserFactory {
    private PatientService patientService = PatientService.getInstance();
    private DoctorService doctorService = DoctorService.getInstance();

    public Doctor criarMedico(Long id, String nome, String cpf, LocalDate nasc, String telefone, String email,
            String endereco, String formacao, String crm) {
        Doctor medico = new Doctor(id, nome, cpf, nasc, telefone, email, endereco, crm, formacao);

        doctorService.adicionarMedico(medico);

        return medico;
    }

    public Patient criarPaciente(Long id, String nome, String cpf, LocalDate nasc, String telefone, String email,
            String endereco) {
        Patient paciente = new Patient(id, nome, cpf, nasc, telefone, email, endereco);

        patientService.adicionarPaciente(paciente);

        return paciente;
    }
}
