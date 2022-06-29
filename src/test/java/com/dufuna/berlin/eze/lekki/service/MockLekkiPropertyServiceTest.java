package com.dufuna.berlin.eze.lekki.service;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;
import com.dufuna.berlin.eze.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.eze.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MockLekkiPropertyServiceTest {

    @SuppressWarnings({})
    private LekkiPropertyService service = new MockLekkiPropertyService();

    @Test
    void savePropertyTest()
    {
        //creating a property
        LekkiProperty property1 = new LekkiProperty(1, "lagos", "Flat");


        //saving the property
        LekkiProperty propTest = service.saveProperty(property1);

        //checking whether the property saved actually equals the first property retrieved
        assertEquals(service.getProperty(1),property1);
    }

    @Test
    void getPropertyTest()
    {
        //Instantiation new properties
        LekkiProperty property1 = new LekkiProperty(2,"Nnewi","Duplex");
        LekkiProperty property2 = new LekkiProperty(3,"Jos","storey building");

        //saving this properties to repository
        service.saveProperty(property1);
        service.saveProperty(property2);

        //Test whether the findById returns property2
        assertEquals(service.getProperty(2),property1);
        assertEquals(service.getProperty(3),property2);
    }

    @Test
    void getAllPropertiesTest()
    {
        //Instantiating property
        LekkiProperty property1 = new LekkiProperty(4,"Egypt","Flat");
        LekkiProperty property2 = new LekkiProperty(5,"Canada","Building");
        LekkiProperty property3 = new LekkiProperty(6,"Angola","Duplex");

        //create a list of properties
        List<LekkiProperty> listOfProperties = new ArrayList<>();

        //Add the properties to a list
        listOfProperties.add(property1);
        listOfProperties.add(property2);
        listOfProperties.add(property3);

        //saving properties
        service.saveProperty(property1);
        service.saveProperty(property2);
        service.saveProperty(property3);

        //test the find all method
        assertEquals(listOfProperties,service.getAllProperties());
    }
}