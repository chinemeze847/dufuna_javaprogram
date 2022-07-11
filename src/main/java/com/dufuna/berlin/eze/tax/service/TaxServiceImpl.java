package com.dufuna.berlin.eze.tax.service;

import com.dufuna.berlin.eze.tax.model.TaxBracket;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TaxServiceImpl implements TaxService{

    TaxBracket bracket = new TaxBracket();

    @Override
    public double calculateTax(int income)
    {
        double tax = 0.00;

        if(income <= bracket.HIGH_LIMIT_2)
        {
            return bracket.HIGH_LIMIT_2 * bracket.RATE_1;
        }else if(income <= bracket.HIGH_LIMIT_3)
        {
            tax = (bracket.HIGH_LIMIT_2 -bracket.LOW_LIMIT_2) * bracket.RATE_2;
        }
        else if (income <= bracket.HIGH_LIMIT_4)
        {
            tax = ((bracket.HIGH_LIMIT_2 -bracket.LOW_LIMIT_2) * bracket.RATE_2)
                    + ((bracket.HIGH_LIMIT_3 -bracket.LOW_LIMIT_3) * bracket.RATE_3);
        }else
        {
            tax = ((bracket.HIGH_LIMIT_2 -bracket.LOW_LIMIT_2) * bracket.RATE_2)
                    + ((bracket.HIGH_LIMIT_3 -bracket.LOW_LIMIT_3) * bracket.RATE_3)
                    +((bracket.HIGH_LIMIT_4 -bracket.LOW_LIMIT_4) * bracket.RATE_4);
        }
       return tax;
    }
}
