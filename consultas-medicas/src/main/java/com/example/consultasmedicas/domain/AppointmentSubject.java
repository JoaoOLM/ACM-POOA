package com.example.consultasmedicas.domain;

import java.util.List;

public abstract class AppointmentSubject {

    // relacionamentos
    protected List<User> Observers;

    // métodos
    public void attach(User user) {
        this.Observers.add(user);
    }

    public void dettach(User user) {
        this.Observers.remove(user);
    }

}
