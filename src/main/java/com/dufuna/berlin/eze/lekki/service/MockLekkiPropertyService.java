package com.dufuna.berlin.eze.lekki.service;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService
{
    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MocklekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MocklekkiPropertyService.saveProperty called");
        return null;
    }
}
