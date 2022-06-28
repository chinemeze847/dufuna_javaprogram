package com.dufuna.berlin.eze.lekki;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;
import com.dufuna.berlin.eze.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.eze.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp
{
    public static void main(String[] args)
    {
        LekkiPropertyService service = new MockLekkiPropertyService();

        //instantiating the properties
        LekkiProperty property1 = new LekkiProperty(1,"lago","bed room flat");
        LekkiProperty property2 = new LekkiProperty(2, "China","bungalow");
        LekkiProperty property3 = new LekkiProperty(3, "Zuri","Duplex");

        //saving the properties
        service.saveProperty(property1);
        service.saveProperty(property2);
        service.saveProperty(property3);

        //returning all properties
        System.out.println(service.getAllProperties());
    }
}
