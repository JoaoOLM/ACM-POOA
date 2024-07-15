package com.example.consultasmedicas.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Appointment {
    // Atributos
    private Long id;
    private LocalDate data;
    private LocalTime hora;
    private String status;
    private double valor;
    private String anotacoes;

    // Relacionamentos
    private Patient responsavel;
    private Patient paciente;
    private Doctor medico;
    private Local local;
    private Rating avaliacao;
    private List<Service> servicos;

    // Métodos
    public void cancelarConsulta() {
        
    }

    public void fazerAnotacoes() {
        
    }
}
