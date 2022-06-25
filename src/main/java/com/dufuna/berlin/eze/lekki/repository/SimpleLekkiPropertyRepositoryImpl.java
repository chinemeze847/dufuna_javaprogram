package com.dufuna.berlin.eze.lekki.repository;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository
{
    Map<Integer, LekkiProperty> properties = new HashMap<>();

    @Override
    public void save(LekkiProperty property) {
          properties.put(property.getPropertyId(),property);
    }

    @Override
    public LekkiProperty findById(int propertyId) {
        for(Map.Entry<Integer,LekkiProperty> prop : properties.entrySet()){
            if(prop.getKey().equals(propertyId))
                return prop.getValue();
        }
        return null;
    }

    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<LekkiProperty>(properties.values());
    }

    @Override
    public void update(int propertyId,LekkiProperty property)
    {
        for(Map.Entry<Integer,LekkiProperty> prop : properties.entrySet())
        {
            if(propertyId == prop.getKey())
            {
                properties.put(propertyId,property);
            }
        }
    }
}
