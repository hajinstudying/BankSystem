package com.javalab.sec02;

import java.util.List;

public class Bank {
    private double bankBlance;



    public double getBankBlance() {
        return bankBlance;
    }

    public void setBankBlance(double bankBlance) {
        this.bankBlance = bankBlance;
    }

    // 현재 은행 잔고 ( 입금되있는 계좌들의 총합 )
    public double currentBlance(List<Account> accounts) {
        double totalBlacne = 0;
        for (Account account : accounts) {
            totalBlacne += account.getAcBalance();
        }
        return totalBlacne;
    }


    @Override
    public String toString() {
        return "현재 은행 잔고 : " + bankBlance;
    }
}



