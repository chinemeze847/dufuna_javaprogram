package com.dufuna.berlin.eze.lekki.repository;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository
{
    void save(LekkiProperty property);
    LekkiProperty findById(int propertyId);
    List<LekkiProperty> findAll();
    void update(int propertyId, LekkiProperty property);
}
