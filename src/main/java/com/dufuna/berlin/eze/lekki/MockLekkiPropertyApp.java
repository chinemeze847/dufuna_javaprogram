package com.dufuna.berlin.eze.lekki;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;
import com.dufuna.berlin.eze.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.eze.lekki.service.MockLekkiPropertyService;
import net.bytebuddy.utility.RandomString;

public class MockLekkiPropertyApp
{
    public static void main(String[] args)
    {
        LekkiPropertyService service = new MockLekkiPropertyService();

        String[] addresses = {"lekki","lagos","jos","rivers","canada"};
        String[] types = {"flat","bungalow","duplex","storey building","one storey"};

//        //instantiating the properties
//        for(int i=0 ; i<5; i++){
//            LekkiProperty property = new LekkiProperty(i,addresses[i],types[i]);
//            service.saveProperty(property);
//
//            //getting one property
//            System.out.println(service.getProperty(i));
//        }

        String str = RandomString.make(30);
        //returning all properties
        System.out.println(str);
    }
}
