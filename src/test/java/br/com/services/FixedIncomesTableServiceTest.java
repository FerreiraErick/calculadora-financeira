package br.com.services;


import br.com.domains.IncomeCalculateParameters;
import br.com.domains.TimeUnitEnum;
import org.junit.jupiter.api.Test;

public class FixedIncomesTableServiceTest {

    private final FixedIncomesTableService fixedIncomesTableService = new FixedIncomesTableService();

    @Test
    void should_test_calculate(){

        IncomeCalculateParameters incomeCalculateParameters = new IncomeCalculateParameters();
        incomeCalculateParameters.setTimeUnit(TimeUnitEnum.YEARLY);
        incomeCalculateParameters.setStartAmount(1000.00F);
        incomeCalculateParameters.setMonthlyAmount(100.00F);
        incomeCalculateParameters.setIncomeTax(13.75F);
        incomeCalculateParameters.setDiscountTaxes(3F);
        incomeCalculateParameters.setInvestingTime(12);

        fixedIncomesTableService.calculate(incomeCalculateParameters).forEach(System.out::println);

    }
}
