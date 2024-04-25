package com.javalab.Database;

import com.javalab.domain.Customer;

import java.util.ArrayList;

public class Database {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        //id/이름/주민번호/계좌/잔액/비밀번호
        customers.add(new Customer(1,"홍길동","930712-1123654","356-0598-0236-97", 5000,1234));
        customers.add(new Customer(2,"김길동","990265-1256845","489-1234-4567-98", 10000,4561));
        customers.add(new Customer(3,"이길동","981565-2023045","789-4561-0123-54", 200000,7895));
        customers.add(new Customer(4,"서길동","205156-3545098","159-1564-4568-56", 3000000,1112));
        customers.add(new Customer(5,"윤길동","991245-2487095","123-4567-8978-87", 60000000,5954));
        customers.add(new Customer(6,"심길동","215645-4651023","987-6541-3156-54", 120000000,7877));
    }
}
