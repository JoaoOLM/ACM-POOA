package com.example.consultasmedicas.client;

import com.example.consultasmedicas.domain.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class DoctorAppointmentScheduler {
    public static void main(String[] args) {
        // Criação dos serviços
        Service consultaBasica = new Service(1L, "Consulta Básica", 100.0, "Consulta inicial com o médico");
        Service exameSangue = new Service(2L, "Exame de Sangue", 50.0,  "Coleta e análise de sangue");

        // Criação de um médico e definição dos serviços oferecidos
        Doctor medico = new Doctor();
        medico.setId(1L);
        medico.setNome("Dr. Carlos Oliveira");
        medico.adicionarServico(consultaBasica);
        medico.adicionarServico(exameSangue);

        // Criação de um paciente
        Patient paciente = new Patient();
        paciente.setId(2L);
        paciente.setNome("João da Silva");

        // Criação de um local
        Local local = new Local();
        local.setId(1L);
        local.setNome("Clínica São Lucas");
        local.setEndereco("Rua das Flores, 123");

        // Criação de uma consulta com serviços
        List<Service> servicos = new ArrayList<>();
        servicos.add(consultaBasica);
        servicos.add(exameSangue);

        Appointment consulta = medico.criarConsulta(paciente, LocalDate.of(2024, 7, 20), LocalTime.of(14, 0), local, servicos);
    }
}
