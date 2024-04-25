package com.javalab.sec02;

import java.util.ArrayList;
import java.util.List;

public class BankDatabase {
    // 데이터베이스 객체
    private static BankDatabase db;


    public static BankDatabase getInstance() {
        if (db == null) {
            db = new BankDatabase();
        }
        return db;
    }




    //고객 클래스 리스트
    ArrayList<Customer> customers = new ArrayList<>();
    //계좌 클래스 리스트
    ArrayList<Account> accounts = new ArrayList<>();
    //거래내역 클래스 리스트
    ArrayList<Transaction> transactions = new ArrayList<>();
    //은행 클래스 리스트
    ArrayList<Bank> banks = new ArrayList<>();


    // 거래내역 배열 추가 메소드
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }



    public BankDatabase() {
        //계좌 클래스 예시
        Account account1 = new Account(30329040,5600);
        Account account2 = new Account(88452120,8700);
        Account account3 = new Account(51210142,9800);
        Account account4 = new Account(69121210,6700);
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);







        // 고객 데이터 예시.
        Customer customer1 = new Customer(1001,"홍길동",8054,account3);
        Customer customer2 = new Customer(1002,"김철수",2580,account1);
        Customer customer3 = new Customer(1004,"김기동",6572,account2);
        Customer customer4 = new Customer(1004,"김운찬",5542,account4);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);




        // 거래 내역 예시.
        Transaction trans1 = new Transaction("2024년-03월-21일 11시39분25초",account1,"save",5000);
        Transaction trans2 = new Transaction("2024년-03월-21일 11시39분25초",account1,"withdraw",3000);
        Transaction trans3 = new Transaction("2024년-03월-21일 11시39분25초",account1,"save",2000);
        Transaction trans4 = new Transaction("2024년-03월-21일 11시39분25초",account1,"save",5000);
        Transaction trans5 = new Transaction("2024년-03월-21일 11시39분25초",account1,"save",1500);
        transactions.add(trans1);
        transactions.add(trans2);
        transactions.add(trans3);
        transactions.add(trans4);
        transactions.add(trans5);








    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction); // 거래 내역을 리스트에 추가
    }

















}
