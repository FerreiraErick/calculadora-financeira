/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package br.com.services;

import br.com.domains.IncomeCalculateParameters;
import br.com.domains.TimeUnitEnum;

public class FixedIncomesTableService {

    public void calculate(IncomeCalculateParameters incomeCalculateParameters){

        var investingTime = incomeCalculateParameters.getInvestingTime();
        var timeUnit = incomeCalculateParameters.getTimeUnit();
        var incomeTax = getIncomeTax(incomeCalculateParameters, timeUnit);
        var amount = incomeCalculateParameters.getStartAmount();

        for(int n = 1; n <= investingTime; n++){
            System.out.println(compoundInterests(amount, incomeTax, n));
            amount+=(incomeCalculateParameters.getMonthlyAmount() * (1%n));
        }

    }

    private Float compoundInterests(Float amount, Float incomeTax,int n) {
        return Double.valueOf(amount * Math.pow((1 + incomeTax), n)).floatValue();
    }

    private static Float getIncomeTax(IncomeCalculateParameters incomeCalculateParameters, TimeUnitEnum timeUnit) {
        return timeUnit == TimeUnitEnum.YEARLY ?
                incomeCalculateParameters.getIncomeTax() : (incomeCalculateParameters.getIncomeTax() / 12);
    }

}
