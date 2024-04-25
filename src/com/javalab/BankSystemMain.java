package com.javalab;

import java.util.Scanner;

public class BankSystemMain  {
    public static void main(String[] args) {
        BankDatabase db = BankDatabase.getInstance(); // 데이터베이스 객체 생성
        Bank bank = new Bank(); // 은행 객체 생성 (은행잔고)
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {

            System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("번호를 입력해주세요 1~4");
            System.out.println("1. 고객 정보 출력");
            System.out.println("2. 은행 잔고 확인");
            System.out.println("3. 거래 내역 확인");
            System.out.println("4. 직접 입금 및 출금");
            System.out.println("5. 프로그램 종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            int Num = scanner.nextInt();
            switch (Num){
                case 1 :
                    for (Customer customer : db.customers) {
                        System.out.println(customer);
                    }
                    break;

                case 2 :
                    System.out.println(bank.currentBlance(db.accounts));
                    break;

                case 3 :
                    for( Transaction transaction : db.transactions){
                        System.out.println(transaction);
                    }
                    break;

                case 4 :
                    System.out.println(" 번호를 입력해주세요");
                    System.out.println("1. 입금  2. 출금");
                    int transType = scanner.nextInt();
                    System.out.println("계좌번호를 입력해주세요");
                    int accountNum = scanner.nextInt();
                    Account inAccount = null;
                    for(Account account : db.accounts) {
                        if (accountNum == account.getAccountNum()) {
                            inAccount = account;
                            break;
                        }
                    }
                    if(inAccount == null){
                        System.out.println("잘못입력하셨습니다.");
                        break;
                    }
                    System.out.println("거래 금액을 입력하십시요");
                    int amount = scanner.nextInt();
                    if(transType == 1){
                        inAccount.saveMoney(amount);
                    } else if(transType ==2){
                        inAccount.withdraw(amount);
                    } else {
                        System.out.println("잘못된 입력입니다");
                    }
                    break;


                case 5:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                }

            } // END OF Switch
        } // end of while


    } //end of main


