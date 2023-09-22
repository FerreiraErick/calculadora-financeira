/*
 * Erick Victor Ferreira
 * São Paulo, 21/12/2022 12:01
 */

package br.com.calculadora.service;

import br.com.calculadora.domain.IncomeCalculateParameters;
import br.com.calculadora.domain.RowData;

import java.util.ArrayList;
import java.util.List;

public class FixedIncomesTableService {

    public List<RowData> calculate(IncomeCalculateParameters incomeCalculateParameters){

        var investingTime = incomeCalculateParameters.getInvestingTime();
        var incomeTax = incomeCalculateParameters.getPercentIncomeTax();
        var amount = incomeCalculateParameters.getStartAmount();

        var rowDataList = new ArrayList<RowData>();

        for(int n = 1; n <= investingTime; n++){

            var rowData = new RowData();

            rowData.setRow(n);
            rowData.setGrossValue(compoundInterests(amount, incomeTax, n));
            rowData.setTaxesAmount(incomeCalculateParameters.getDiscountTaxes());
            rowData.setNetValue(applyTaxes(rowData.getGrossValue(), incomeCalculateParameters));
            amount+=incomeCalculateParameters.getMonthlyAmount();

            rowDataList.add(rowData);

        }

        return rowDataList;
    }

    private Float applyTaxes(Float amount, IncomeCalculateParameters incomeCalculateParameters) {
        return amount - (amount * incomeCalculateParameters.getPercentDiscountFee());
    }

    private Float compoundInterests(Float amount, Float incomeTax,int n) {
        Float C = (float) Math.pow((1 + incomeTax), n);
        return amount * C;
    }


}
