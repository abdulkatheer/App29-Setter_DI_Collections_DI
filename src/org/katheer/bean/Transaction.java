package org.katheer.bean;

public class Transaction {
    private String type;
    private int amount;
    private String date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void getTransactionDetail() {
        System.out.println(String.format("%-11s%-10s%-10s", this.getDate(), this.getType(), this.getAmount()));
    }
}
