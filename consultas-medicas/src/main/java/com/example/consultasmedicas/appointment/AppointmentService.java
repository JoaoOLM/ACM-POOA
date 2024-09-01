package com.example.consultasmedicas.appointment;

import com.example.consultasmedicas.doctor.DoctorAppointmentService;
import com.example.consultasmedicas.patient.PatientAppointmentService;

class AppointmentService implements PatientAppointmentService, DoctorAppointmentService {
    private static AppointmentService instance;

    private AppointmentService();

    public static AppointmentService getInstance() {
        if (instance == null)
            instance = new AppointmentService();

        return instance;
    }

}
