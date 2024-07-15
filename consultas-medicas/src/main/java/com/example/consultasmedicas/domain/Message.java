package com.example.consultasmedicas.domain;

import java.util.Date;

public class Message {
    // Atributos
    private Long id;
    private String conteudo;
    private Date dataEnvio;

    // Relacionamentos
    private User remetente;
    private User destinatario;

    // Métodos
    public void enviar() {
        
    }
    
}
