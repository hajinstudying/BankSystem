package com.javalab.Database;

import com.javalab.domain.Account;
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

    //기본 생성자
    public Database() {
        initializeData();   //데이터 생성작업을 별도의 메소드로 분리
    }

    //데이터 생성 메소드
    public void initializeData() {
        //고객 리스트 초기화
        Customer customer1 = new Customer(1, "홍길동");
        Customer customer2 = new Customer(2, "강감찬");
        Customer customer3 = new Customer(3, "나고객");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        //계좌 리스트 초기화
        Account account1 = new Account("1231231231231", 1000, customer1, 1234);
        Account account2 = new Account("4004004004000", 5000, customer2, 1234);
        Account account3 = new Account("3560598023696", 20000, customer3, 1234);

        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
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
}
