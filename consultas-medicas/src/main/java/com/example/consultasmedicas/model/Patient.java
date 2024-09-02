package com.example.consultasmedicas.model;

import java.time.LocalDate;

public class Patient extends User {

    // Métodos

    public Patient(Long id, String nome, String cpf, LocalDate dataNascimento, String telefone, String email,
            String endereco) {
        super(id, nome, cpf, dataNascimento, telefone, email, endereco);
    }

    @Override
    public void notificarAlteracaoConsulta(String msg) {
        System.out.println("Houve alteração na consulta " + this.getNome() + "\n" + msg);
    }

}
