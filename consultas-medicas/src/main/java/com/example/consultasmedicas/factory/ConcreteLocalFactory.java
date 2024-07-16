package com.example.consultasmedicas.factory;

import com.example.consultasmedicas.domain.Local;

public class ConcreteLocalFactory implements LocalFactory {
    @Override
    public Local createLocal() {
        return new Local();
    }
}