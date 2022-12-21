package br.com.domains;

public class IncomeCalculateParameters {

    private Float incomeTax;
    private Float startAmount;
    private Float monthlyAmount;
    private Float discountTaxes;
    private Integer investingTime;
    private TimeUnitEnum timeUnit;


    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Float getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(Float incomeTax) {
        this.incomeTax = incomeTax;
    }

    public Float getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(Float startAmount) {
        this.startAmount = startAmount;
    }

    public Float getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(Float monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public Float getDiscountTaxes() {
        return discountTaxes;
    }

    public void setDiscountTaxes(Float discountTaxes) {
        this.discountTaxes = discountTaxes;
    }

    public Integer getInvestingTime() {
        return investingTime;
    }

    public void setInvestingTime(Integer investingTime) {
        this.investingTime = investingTime;
    }
}
