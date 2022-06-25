package com.dufuna.berlin.eze.lekki;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;
import com.dufuna.berlin.eze.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.eze.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp
{
    public static void main(String[] args)
    {
        LekkiProperty property = new LekkiProperty();
        LekkiPropertyService service = new MockLekkiPropertyService();
        service.saveProperty(property);
        service.getProperty();
    }
}
