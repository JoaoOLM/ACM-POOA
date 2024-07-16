package com.example.consultasmedicas.client;

import java.time.LocalDate;

import com.example.consultasmedicas.domain.User;
import com.example.consultasmedicas.factory.*;

public class UserRegistrationClient {
    public static void main(String[] args) {
        UserFactory userFactory = new PatientFactory();
        User newUser = userFactory.createUser();
        
        newUser.setNome("João da Silva");
        newUser.setCpf("123.456.789-00");
        newUser.setDataNascimento(LocalDate.of(1990, 1, 1));
        newUser.setTelefone("99999-9999");
        newUser.setEmail("joao.silva@example.com");
        newUser.setEndereco("Rua das Flores, 123");
        newUser.setSenha("Senha@123");

        newUser.realizarCadastro();
    }
}