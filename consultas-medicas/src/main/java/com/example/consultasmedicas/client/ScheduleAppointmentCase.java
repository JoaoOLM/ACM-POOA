package com.example.consultasmedicas.client;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.example.consultasmedicas.model.Availability;
import com.example.consultasmedicas.model.Doctor;
import com.example.consultasmedicas.model.Local;
import com.example.consultasmedicas.model.Patient;
import com.example.consultasmedicas.services.DoctorService;
import com.example.consultasmedicas.services.UserFactory;
import com.example.consultasmedicas.services.appointment.AppointmentService;

public class ScheduleAppointmentCase {
    public static void main(String[] args) {
        UserFactory userFactory = UserFactory.getInstance();
        DoctorService doctorService = DoctorService.getInstance();
        AppointmentService consultaService = AppointmentService.getInstance();

        System.out.println("-=-=- Criando médicos -=-=-=-");

        userFactory.criarMedico(1L, "Clodoaldo da Silva", "12345678901", LocalDate.of(1970, 9, 22), "11999999999",
                "clodoaldo@emai.com", "Rua dos Bobos, 0", "Ortodentista", "130433");
        userFactory.criarMedico(2L, "Eduardo Friton", "12345676501", LocalDate.of(1952, 5, 31), "11999991399",
                "eduardo@emai.com", "Rua dos Eucaliptos, 313", "Cardiologista", "122433");
        userFactory.criarMedico(3L, "Julia Friton", "12345676502", LocalDate.of(1960, 1, 31), "11999991455",
                "julia@emai.com", "Rua dos Eucaliptos, 313", "Nefrologia", "113433");
        Doctor catherine = userFactory.criarMedico(4L, "Catherine Marcon", "12123767650", LocalDate.of(1980, 2, 28),
                "11945291455",
                "catherine@emai.com", "Rua dos Pinheiros, 404", "Nefrologia", "120000");

        System.out.println("-=-=- Adicionando disponibilidade -=-=-");
        catherine.adicionarDisponibilidade(new Availability(DayOfWeek.MONDAY, LocalTime.of(8, 0), LocalTime.of(16, 0)));
        catherine
                .adicionarDisponibilidade(new Availability(DayOfWeek.TUESDAY, LocalTime.of(8, 0), LocalTime.of(16, 0)));
        catherine.adicionarDisponibilidade(new Availability(DayOfWeek.FRIDAY, LocalTime.of(8, 0), LocalTime.of(16, 0)));

        System.out.println("-=-=- Adicionando local -=-=-");
        catherine.adicionarLocal(new Local(1L, "Clínica Santa Helena", "Rua das Arrueiras, 24", "11964247842"));

        System.out.println("-=-=- Criando paciente -=-=-=-");
        Patient pacienteVitor = userFactory.criarPaciente(5L, "Vitor Recoaro", "123456023934", LocalDate.of(2000, 5, 2),
                "11972947772",
                "vitor@email.com", "Rua das Acácias, 64");

        System.out.println("-=-=- Procurando nefrologistas -=-=-");
        for (Doctor medico : doctorService.listarMedicos("Nefrologia")) {
            System.out.println("Id: " + medico.getId() + " - " + medico.toString());
        }

        System.out.println("-=-=- Selecionando Catherine -=-=-");
        catherine = doctorService.procurarMedico(4l);

        System.out.println("-=-=- Disponibilidade de Catherine -=-=-");
        for (Availability disponibilidade : catherine.getDisponibilidades()) {
            System.out.println(disponibilidade.toString());
        }

        System.out.println("-=-=- Locais atendidos por Catherine -=-=-");
        for (Local local : catherine.getLocaisAtendidos()) {
            System.out.println(local.toString());
        }

        System.out.println(
                "-=-=- Agendando consulta terça feira, as 12h na clínica Santa Helena com a Dra. Catherine -=-=-");
        consultaService.criarConsulta(catherine, pacienteVitor, LocalDateTime.of(2024, 9, 3, 12, 0),
                catherine.getLocaisAtendidos().get(0), 0L, 500.0);
    }
}
