package com.dufuna.berlin.eze.lekki.repository;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implements the repository interface methods
 */
public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository
{
    public Map<Integer, LekkiProperty> properties = new HashMap<>();

    /**
     * Saves a property
     * @param property to be saved
     * @return the property saved
     */
    @Override
    public LekkiProperty save(LekkiProperty property) {
          return properties.put(property.getPropertyId(),property);
    }

    /**
     * Finds a property given its Id
     * @param propertyId of the property
     * @return the property
     */
    @Override
    public LekkiProperty findById(int propertyId) {
       return properties.get(propertyId);
    }

    /**
     * finds all the properties
     * @return all properties
     */
    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<LekkiProperty>(properties.values());
    }

    /**
     * updates a property with specific Id
     * @param propertyId of the property to update
     * @param property that updates
     */
    @Override
    public void update(int propertyId,LekkiProperty property)
    {
        properties.put(propertyId,property);
    }
}
