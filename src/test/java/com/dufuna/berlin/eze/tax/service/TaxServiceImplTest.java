package com.dufuna.berlin.eze.tax.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxServiceImplTest {

    private TaxService service = new TaxServiceImpl();
    @Test
    void calculateTaxTestBelowLimit2()
    {
        int income = 25000;
        double expectedTax = 0.00;
        assertEquals(expectedTax,service.calculateTax(income));
    }

    @Test
    void calculateTaxTextBelowLimit3()
    {
        int income = 80000;
        double expectedTax = 3571.81;
        assertEquals(expectedTax,service.calculateTax(income));
    }

    @Test
    void calculateTaxTextBelowLimit4()
    {
        int income = 120000;
        double expectedTax = 20796.485;
        assertEquals(expectedTax,service.calculateTax(income));
    }

    @Test
    void calculateTaxAboveLimit4()
    {
        int income = 190000;
        double expectedTax = 54096.115;
        assertEquals(expectedTax,service.calculateTax(income));
    }
}