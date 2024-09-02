package com.example.consultasmedicas.services.appointment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.consultasmedicas.enums.AppointmentStatus;
import com.example.consultasmedicas.interfaces.AppointmentAlteration;
import com.example.consultasmedicas.model.Appointment;
import com.example.consultasmedicas.model.Doctor;
import com.example.consultasmedicas.model.Local;
import com.example.consultasmedicas.model.Patient;
import com.example.consultasmedicas.model.User;

public class AppointmentService {
    private static AppointmentService instance;
    private List<Appointment> consultas;
    private AppointmentAlteration alteracaoConsulta;

    private AppointmentService() {
        consultas = new ArrayList<Appointment>();
    }

    public static AppointmentService getInstance() {
        if (instance == null)
            instance = new AppointmentService();

        return instance;
    }

    public Appointment criarConsulta(Doctor medico, Patient paciente, LocalDateTime dataHora, Local local, long id,
            double valor) {
        Appointment novaConsulta = new Appointment(id, valor, dataHora, paciente, medico, local);
        alteracaoConsulta = StatusAlteration.getInstance();

        consultas.add(novaConsulta);
        notificarAlteracaoConsulta(novaConsulta);

        return novaConsulta;
    }

    public void cancelarConsulta(Long idConsulta) {
        Appointment consulta = procurarConsulta(idConsulta);
        alteracaoConsulta = StatusAlteration.getInstance();
        consulta.setStatus(AppointmentStatus.CANCELED);

        notificarAlteracaoConsulta(consulta);
    }

    public void reagendarConsulta(Appointment consulta, LocalDateTime novaDataHora) {
        alteracaoConsulta = DateTimeAlteration.getInstance();
        consulta.setDataHora(novaDataHora);

        notificarAlteracaoConsulta(consulta);
    }

    public List<Appointment> listarConsultas(User usuario) {
        List<Appointment> usuarioConsultas = new ArrayList<Appointment>();

        for (Appointment consulta : consultas) {
            if (usuarioEstaNaConsulta(usuario, consulta))
                usuarioConsultas.add(consulta);
        }

        return usuarioConsultas;
    }

    public Appointment procurarConsulta(Long idConsulta) throws NullPointerException {
        for (Appointment consulta : consultas) {
            if (consulta.getId() == idConsulta)
                return consulta;
        }

        throw new NullPointerException("Consulta não encontrada");
    }

    private boolean usuarioEstaNaConsulta(User usuario, Appointment consulta) {
        return (consulta.getMedico().getId() == usuario.getId() && consulta.getMedico().getNome() == usuario.getNome())
                || (consulta.getPaciente().getId() == usuario.getId()
                        && consulta.getPaciente().getNome() == usuario.getNome());
    }

    private void notificarAlteracaoConsulta(Appointment consulta) {
        consulta.notificarSubscribers(alteracaoConsulta.getText(consulta));
    }
}
