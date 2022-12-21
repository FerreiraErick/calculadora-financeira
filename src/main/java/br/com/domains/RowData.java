package br.com.domains;

public class RowData {

    private Integer investingTime;
    private Double accumulatedAmount;
    private Double taxesAmount;
    private Double grossValue;
    private Double netValue;

    public Integer getInvestingTime() {
        return investingTime;
    }

    public void setInvestingTime(Integer investingTime) {
        this.investingTime = investingTime;
    }

    public Double getAccumulatedAmount() {
        return accumulatedAmount;
    }

    public void setAccumulatedAmount(Double accumulatedAmount) {
        this.accumulatedAmount = accumulatedAmount;
    }

    public Double getTaxesAmount() {
        return taxesAmount;
    }

    public void setTaxesAmount(Double taxesAmount) {
        this.taxesAmount = taxesAmount;
    }

    public Double getGrossValue() {
        return grossValue;
    }

    public void setGrossValue(Double grossValue) {
        this.grossValue = grossValue;
    }

    public Double getNetValue() {
        return netValue;
    }

    public void setNetValue(Double netValue) {
        this.netValue = netValue;
    }
}
