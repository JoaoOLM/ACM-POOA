package com.example.consultasmedicas.factory;

import com.example.consultasmedicas.domain.Patient;
import com.example.consultasmedicas.domain.User;

public class PatientFactory extends UserFactory {
    @Override
    public User createUser() {
        return new Patient();
    }
}