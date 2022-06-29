package com.dufuna.berlin.eze.lekki.repository;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SimpleLekkiPropertyRepositoryImplTest {

    @SuppressWarnings({})
    private SimpleLekkiPropertyRepository repository = new SimpleLekkiPropertyRepositoryImpl();

    @Test
    void saveTest() {
        //creating a property
        LekkiProperty property1 = new LekkiProperty(1, "lagos", "Flat");


        //saving the property
        LekkiProperty propTest = repository.save(property1);

        //checking whether the property saved actually equals the first property retrieved
        assertEquals(repository.findById(1),property1);
    }

    @Test
    void findByIdTest()
    {
        //Instantiation new properties
        LekkiProperty property1 = new LekkiProperty(2,"Nnewi","Duplex");
        LekkiProperty property2 = new LekkiProperty(3,"Jos","storey building");

        //saving this properties to repository
        repository.save(property1);
        repository.save(property2);

        //Test whether the findById returns property2
        assertEquals(repository.findById(2),property1);
        assertEquals(repository.findById(3),property2);
    }

    @Test
    void findAllPropertiesTest()
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
        repository.save(property1);
        repository.save(property2);
        repository.save(property3);

        //test the find all method
        assertEquals(listOfProperties,repository.findAll());
    }

    @Test
    void update()
    {
        //creating a property
        LekkiProperty property1 = new LekkiProperty(7,"Egypt","Flat");
        LekkiProperty property2 = new LekkiProperty(7, "France","Duplex");

        //adding the property1 to repository
        repository.save(property1);

        //updating the id of repository  with property2
        repository.update(7,property2);

        //check if the property was properly updated to property2
        assertEquals(repository.findById(7),property2);
    }
}