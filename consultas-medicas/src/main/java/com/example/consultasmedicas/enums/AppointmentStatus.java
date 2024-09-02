package com.example.consultasmedicas.enums;

public enum AppointmentStatus {
    SCHEDULED(0),
    CANCELED(1);

    private int status;

    AppointmentStatus(int i) {
        status = i;
    }

    public String toString() {
        switch (status) {
            case 0:
                return "Agendado";
            case 1:
                return "Cancelado";
        }
        return "";
    }

}
