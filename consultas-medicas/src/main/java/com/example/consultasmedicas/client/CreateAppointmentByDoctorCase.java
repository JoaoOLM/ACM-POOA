package com.example.consultasmedicas.client;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.example.consultasmedicas.model.Appointment;
import com.example.consultasmedicas.model.Availability;
import com.example.consultasmedicas.model.Doctor;
import com.example.consultasmedicas.model.Local;
import com.example.consultasmedicas.model.Patient;
import com.example.consultasmedicas.services.UserFactory;
import com.example.consultasmedicas.services.appointment.AppointmentService;

public class CreateAppointmentByDoctorCase {
    public static void main(String[] args) {
        UserFactory userFactory = UserFactory.getInstance();
        AppointmentService consultaService = AppointmentService.getInstance();

        System.out.println("-=-=- Criando médicos e paciente -=-=-");

        Doctor clodoaldo = userFactory.criarMedico(1L, "Clodoaldo da Silva", "12345678901", LocalDate.of(1970, 9, 22), "11999999999",
                "clodoaldo@emai.com", "Rua dos Bobos, 0", "Ortodentista", "130433");
        Patient pacienteCarlos = userFactory.criarPaciente(6L, "Carlos Santos", "123456023934", LocalDate.of(1985, 8, 14), 
                "11982947772", "carlos@email.com", "Rua dos Pinheiros, 78");

        System.out.println("-=-=- Adicionando disponibilidade e locais para Clodoaldo -=-=-");

        clodoaldo.adicionarDisponibilidade(new Availability(DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(15, 0)));
        clodoaldo.adicionarDisponibilidade(new Availability(DayOfWeek.WEDNESDAY, LocalTime.of(10, 0), LocalTime.of(18, 0)));

        clodoaldo.adicionarLocal(new Local(2L, "Clínica Sorriso", "Av. das Flores, 101", "11987654321"));

        System.out.println("-=-=- Agendando consulta segunda-feira, às 10h na Clínica Sorriso com Dr. Clodoaldo -=-=-");

        consultaService.criarConsulta(clodoaldo, pacienteCarlos, LocalDateTime.of(2024, 9, 4, 10, 0),
                clodoaldo.getLocaisAtendidos().get(0), 0L, 300.0);

        System.out.println("-=-=- Consultas agendadas para Clodoaldo -=-=-");

        List<Appointment> consultasClodoaldo = consultaService.listarConsultas(clodoaldo);
        System.out.println("Consultas marcadas para Clodoaldo: ");
        for (Appointment consulta : consultasClodoaldo) {
            System.out.println(consulta.toString());
        }
    }
}
