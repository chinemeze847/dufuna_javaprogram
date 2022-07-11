package com.dufuna.berlin.eze.tax.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaxResponse
{
    @JsonProperty
    private int income;

    @JsonProperty
    private double tax;
}
