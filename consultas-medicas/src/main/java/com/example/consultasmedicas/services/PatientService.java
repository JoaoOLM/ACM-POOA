package com.example.consultasmedicas.services;

import java.util.ArrayList;
import java.util.List;

import com.example.consultasmedicas.model.Patient;

public class PatientService {
    private static PatientService instance;
    private List<Patient> pacientes;

    private PatientService() {
        pacientes = new ArrayList<Patient>();
    }

    public static PatientService getInstance() {
        if (instance == null)
            instance = new PatientService();

        return instance;
    }

    public void adicionarPaciente(Patient paciente) {
        pacientes.add(paciente);
    }

    public List<Patient> listarPacientes(String filtro) {
        if (filtro == null)
            return pacientes;

        List<Patient> pacientesFiltrados = new ArrayList<Patient>();

        for (Patient paciente : pacientes) {
            if (verificarPacienteComFiltro(paciente, filtro))
                pacientesFiltrados.add(paciente);
        }

        return pacientesFiltrados;
    }

    private boolean verificarPacienteComFiltro(Patient paciente, String filtro) {
        return paciente.getNome().contains(filtro) || paciente.getCpf().contains(filtro)
                || paciente.getEmail().contains(filtro);
    }

    public Patient procurarPaciente(Long idPaciente) {
        for (Patient paciente : pacientes) {
            if (paciente.getId() == idPaciente)
                return paciente;
        }

        throw new NullPointerException("Paciente não encontrada");
    }
}
