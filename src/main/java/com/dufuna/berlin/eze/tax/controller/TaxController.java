package com.dufuna.berlin.eze.tax.controller;

import com.dufuna.berlin.eze.tax.dto.TaxResponse;
import com.dufuna.berlin.eze.tax.service.TaxService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 *My controller class that handles clients request
 */

@RestController
@RequestMapping("/tax")
@Slf4j
public class TaxController
{
    /**
     * pure abstraction
     */
    @Autowired
    private TaxService service;

    /**
     * The endpoint that handles the clients income request param
     * @param income entered by users
     * @return the tax to be paid
     */
    @PostMapping("/{income}")
    public ResponseEntity<TaxResponse> calculateTax(@PathVariable int income, HttpServletRequest request)
    {
        double tax = service.calculateTax(income);

        String name = request.getParameter("name");
        String level = request.getParameter("level");

        log.info("my name is {} and am in level {}",name,level);

        //Using the builder pattern to build my response object
        TaxResponse response = TaxResponse.builder()
                .income(income)
                .tax(tax)
                .build();

        TaxResponse reponse = new TaxResponse(income,tax);

        return ResponseEntity.ok(response);
    }
}
