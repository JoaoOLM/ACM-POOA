package com.example.consultasmedicas.domain;

import java.time.LocalDate;

public abstract class User {
    // Atributos
    protected Long id;
    protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;
    protected String telefone;
    protected String email;
    protected String endereco;
    protected String senha;
    protected String foto;
    protected AppointmentSubject state;

    // Relacionamentos 

    // Métodos
    public abstract void realizarCadastro();

    public abstract void alterarDados();

    public void recuperarSenha() {

    }

    public void enviarMensagem() {

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void update(AppointmentSubject appointmentSubject){
        this.state = appointmentSubject;
    }

}
