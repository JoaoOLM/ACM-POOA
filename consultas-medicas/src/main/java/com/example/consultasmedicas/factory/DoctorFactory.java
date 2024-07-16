package com.example.consultasmedicas.factory;

import com.example.consultasmedicas.domain.Doctor;
import com.example.consultasmedicas.domain.User;

public class DoctorFactory extends UserFactory {
    @Override
    public User createUser() {
        return new Doctor();
    }
}