package com.dufuna.berlin.eze.tax;


import com.dufuna.berlin.eze.tax.service.TaxService;
import com.dufuna.berlin.eze.tax.service.TaxServiceImpl;

public class TaxCalculatorApp {
    public static void main(String[] args)
    {
        TaxService service = new TaxServiceImpl();
        System.out.println(service.calculateTax(90000));
        System.out.println(service.calculateTax(120000));
        System.out.println(service.calculateTax(190000));
    }

}
