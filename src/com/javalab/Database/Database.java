package com.javalab.Database;

import com.javalab.domain.Account;
import com.javalab.domain.Bank;
import com.javalab.domain.Customer;
import com.javalab.domain.Transaction;

import java.util.ArrayList;

public class Database {
    //고객 클래스 리스트
    ArrayList<Customer> customers = new ArrayList<>();
    //계좌 클래스 리스트
    ArrayList<Account> accounts = new ArrayList<>();
    //거래내역 클래스 리스트
    ArrayList<Transaction> transactions = new ArrayList<>();
    //은행 클래스 리스트
    ArrayList<Bank> banks = new ArrayList<>();

    //기본 생성자
    public Database() {
        initializeData();   //데이터 생성작업을 별도의 메소드로 분리
    }

    //데이터 생성 메소드
    public void initializeData() {
        //고객 리스트 초기화
        customers.add(new Customer(1, "홍길동"));
        customers.add(new Customer(2, "김유진"));
        customers.add(new Customer(3, "강감찬"));
        //계좌 리스트 초기화
        accounts.add(new Account("1231231231231", 1000, 1234)); //account String형으로 변경
        accounts.add(new Account("4004004004000", 1000, 1234));
        accounts.add(new Account("3560598023696", 1000, 1234));
        //은행 리스트 초기화
        //거래내역 리스트 초기화
    }

    //getter setter

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Bank> getBanks() {
        return banks;
    }

    public void setBanks(ArrayList<Bank> banks) {
        this.banks = banks;
    }
}
