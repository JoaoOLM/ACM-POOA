package com.example.consultasmedicas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.consultasmedicas.interfaces.AppointmentSubscriber;

public abstract class User implements AppointmentSubscriber {
    // Atributos
    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private String endereco;
    private List<HealthCarePlan> convenios;

    public User(Long id, String nome, String cpf, LocalDate dataNascimento, String telefone, String email,
            String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.convenios = new ArrayList<HealthCarePlan>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<HealthCarePlan> getConvenios() {
        return convenios;
    }

    public void adicionarConvenio(HealthCarePlan convenio) {
        convenios.add(convenio);
        System.out.println(convenio.getName() + " foi adicionado aos seus convênios.");
    }

    public void removerConvenio(HealthCarePlan convenio) {
        convenios.remove(convenio);
        System.out.println(convenio.getName() + " foi removido dos seus convênios.");
    }

}
