package com.dufuna.berlin.eze.tax;


import com.dufuna.berlin.eze.tax.service.TaxService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class TaxCalculatorApp {

    public static void main(String[] args) {
        SpringApplication.run(TaxCalculatorApp.class, args);
    }
}
