package br.com.calculadora.controller;


import br.com.calculadora.domain.IncomeCalculateParameters;
import br.com.calculadora.domain.RowData;
import br.com.calculadora.service.FixedIncomesTableService;

import java.util.List;

public class IncomeTaxesController {

    private final FixedIncomesTableService fixedIncomesTableService = new FixedIncomesTableService();

    public List<RowData> calculateTaxes(IncomeCalculateParameters parameters){
        return fixedIncomesTableService.calculate(parameters);
    }

}
