package com.dufuna.berlin.eze.lekki.service;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;
import com.dufuna.berlin.eze.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.eze.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService
{

    SimpleLekkiPropertyRepository repository = new SimpleLekkiPropertyRepositoryImpl();

    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        return repository.save(property);
    }

    @Override
    public LekkiProperty getProperty(int propertyId) {
        return repository.findById(propertyId);
    }

    @Override
    public List<LekkiProperty> getAllProperties()
    {
        return repository.findAll();
    }
}
