package br.com.domains;

public class RowData {

    private Integer row;
    private Float taxesAmount;
    private Float grossValue;
    private Float netValue;

    public Float getTaxesAmount() {
        return taxesAmount;
    }

    public void setTaxesAmount(Float taxesAmount) {
        this.taxesAmount = taxesAmount;
    }

    public Float getGrossValue() {
        return grossValue;
    }

    public void setGrossValue(Float grossValue) {
        this.grossValue = grossValue;
    }

    public Float getNetValue() {
        return netValue;
    }

    public void setNetValue(Float netValue) {
        this.netValue = netValue;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "RowData{" +
                "row=" + row +
                ", taxesAmount=" + taxesAmount +
                ", grossValue=" + grossValue +
                ", netValue=" + netValue +
                '}';
    }
}
