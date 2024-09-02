package com.example.consultasmedicas.services;

import java.util.ArrayList;
import java.util.List;

import com.example.consultasmedicas.model.Doctor;

public class DoctorService {
    private static DoctorService instance;
    private List<Doctor> medicos;

    private DoctorService() {
        medicos = new ArrayList<Doctor>();
    }

    public static DoctorService getInstance() {
        if (instance == null)
            instance = new DoctorService();

        return instance;
    }

    public void adicionarMedico(Doctor medico) {
        medicos.add(medico);
    }

    public List<Doctor> listarMedicos(String filtro) {
        if (filtro == null)
            return medicos;

        List<Doctor> medicosFiltrados = new ArrayList<Doctor>();

        for (Doctor medico : medicos) {
            if (verificarMedicoComFiltro(medico, filtro))
                medicosFiltrados.add(medico);
        }

        return medicosFiltrados;
    }

    private boolean verificarMedicoComFiltro(Doctor medico, String filtro) {
        return medico.getNome().contains(filtro) || medico.getCpf().contains(filtro)
                || medico.getEmail().contains(filtro) || medico.getFormacao().contains(filtro)
                || medico.getCRM().contains(filtro);
    }

    public Doctor procurarMedico(Long idMedico) {
        for (Doctor medico : medicos) {
            if (medico.getId() == idMedico)
                return medico;
        }

        throw new NullPointerException("Medico não encontrada");
    }
}
