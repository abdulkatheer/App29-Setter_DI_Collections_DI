package org.katheer.bean;

import java.util.Iterator;
import java.util.List;

public class Passbook {
    private String name;
    private String accNo;
    private String accType;
    private List<Transaction> transactions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void showAccountDetails() {
        System.out.println("Account Details");
        System.out.println("---------------");
        System.out.println("Name    : " + this.getName());
        System.out.println("Acc No  : " + this.getAccNo());
        System.out.println("Acc Type: " + this.getAccType());
        System.out.println("Transactions:");
        Iterator<Transaction> itr = transactions.iterator();
        System.out.println(String.format("%-11s%-10s%-10s", "Date", "Type", "Amount"));
        while(itr.hasNext()) {
            Transaction t = itr.next();
            t.getTransactionDetail();
        }
    }
}
