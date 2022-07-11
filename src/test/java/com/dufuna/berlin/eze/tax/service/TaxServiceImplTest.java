package com.dufuna.berlin.eze.tax.service;

import com.dufuna.berlin.eze.lekki.model.LekkiProperty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the service implimentation
 */
class TaxServiceImplTest {

    private TaxService service = new TaxServiceImpl();

    /**
     * This method Test limits below 37000
     */
    @Test
    void calculateTaxTestBelowLimit2()
    {
        int income = 25000;
        double expectedTax = 0.00;
        assertEquals(expectedTax,service.calculateTax(income));
    }

    /**
     * This method test limits below 90000
     */
    @Test
    void calculateTaxTextBelowLimit3()
    {
        int income = 80000;
        double expectedTax = 3571.81;
        assertEquals(expectedTax,service.calculateTax(income));
    }

    /**
     * This method test limits below 180000
     */
    @Test
    void calculateTaxTextBelowLimit4()
    {
        int income = 120000;
        double expectedTax = 20796.485;
        assertEquals(expectedTax,service.calculateTax(income));
    }

    /**
     * This method test limits above 180000
     */
    @Test
    void calculateTaxAboveLimit4()
    {
        int income = 190000;
        double expectedTax = 54096.115;
        assertEquals(expectedTax,service.calculateTax(income));
    }

}