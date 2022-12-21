package br.com.controllers;

import br.com.domains.IncomeCalculateParameters;
import br.com.domains.RowData;
import br.com.services.FixedIncomesTableService;

import java.util.List;

public class IncomeTaxesController {

    private final FixedIncomesTableService fixedIncomesTableService = new FixedIncomesTableService();

    public List<RowData> calculateTaxes(IncomeCalculateParameters parameters){
        return fixedIncomesTableService.calculate(parameters);
    }

}
