package com.example.consultasmedicas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
    // Atributos
    private String CRM;
    private String formacao;

    // Relacionamentos
    private List<Availability> disponibilidades;
    private List<Speciality> especialidades;
    private List<Local> locaisAtendidos;

    // Métodos
    public Doctor(Long id, String nome, String cpf, LocalDate dataNascimento, String telefone, String email,
            String endereco, String crm, String formacao) {
        super(id, nome, cpf, dataNascimento, telefone, email, endereco);
        this.CRM = crm;
        this.formacao = formacao;
        this.disponibilidades = new ArrayList<Availability>();
        this.especialidades = new ArrayList<Speciality>();
        this.locaisAtendidos = new ArrayList<Local>();
    }

    public String getCRM() {
        return CRM;
    }

    public String getFormacao() {
        return formacao;
    }

    public void adicionarDisponibilidade(Availability disponibilidade) {
        disponibilidades.add(disponibilidade);
        System.out.println(disponibilidade.toString() + " foi adicionado as suas disponibilidades");
    }

    public void removerDisponibilidade(Availability disponibilidade) {
        disponibilidades.remove(disponibilidade);
        System.out.println(disponibilidade.toString() + " foi removido das suas disponibilidades");
    }

    public void adicionarEspecialidade(Speciality especialidade) {
        especialidades.add(especialidade);
        System.out.println(especialidade.getNome() + " foi adicionado as suas especialidades");
    }

    public void removerEspecialidade(Speciality especialidade) {
        especialidades.remove(especialidade);
        System.out.println(especialidade.getNome() + " foi removido as suas especialidades");
    }

    public void adicionarLocal(Local local) {
        locaisAtendidos.add(local);
        System.out.println(local.getNome() + " foi adicionado aos suas locais atendidos");
    }

    public void removerLocal(Local local) {
        locaisAtendidos.remove(local);
        System.out.println(local.getNome() + " foi removido aos suas locais atendidos");
    }

    @Override
    public void notificarAlteracaoConsulta(String msg) {
        System.out.println("Houve alteração na consulta Dr. " + this.getNome() + "\n" + msg);
    }
}