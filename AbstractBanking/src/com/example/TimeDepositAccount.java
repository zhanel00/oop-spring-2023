package com.example;

import java.util.Date;

public class TimeDepositAccount extends Account {
    public TimeDepositAccount(double balance, Date maturityDate) {
        super(balance);
        this.balance = balance;
        this.maturityDate = maturityDate;
    }
    // time deposit account specific code
    private final Date maturityDate;
    @Override
    public String getDescription() {
        return "Time Deposit Account " + maturityDate;
    }
    @Override
    public boolean withdraw(double amount) {
        return false;
    }
}