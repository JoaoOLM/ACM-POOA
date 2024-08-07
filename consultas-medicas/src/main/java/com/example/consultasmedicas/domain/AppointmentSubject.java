package com.example.consultasmedicas.domain;

import java.util.List;

public abstract class AppointmentSubject {

    // relacionamentos
    private List<User> Observers;

    // métodos
    public void attach(User user) {
        this.Observers.add(user);
    }

    public void dettach(User user) {
        this.Observers.remove(user);
    }

    public void notificar() {
        for (User user:this.Observers){
            user.update(this);
        }
    }
}
