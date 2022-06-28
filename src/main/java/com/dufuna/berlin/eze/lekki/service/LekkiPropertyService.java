package com.dufuna.berlin.eze.lekki.service;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService
{
    LekkiProperty saveProperty(LekkiProperty property);
    LekkiProperty getProperty(int propertyId);
    List<LekkiProperty> getAllProperties();
}
