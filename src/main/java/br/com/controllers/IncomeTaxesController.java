package br.com.controllers;

import br.com.domains.IncomeCalculateParameters;

public class IncomeTaxesController {

    public void calculateTaxes(IncomeCalculateParameters parameters){
        System.out.println(parameters.toString());
    }

}
