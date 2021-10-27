package com.company;
abstract class Bank{
    abstract void getBalance();
        }
class BankA extends Bank{
    public int balance=100;
    public void getBalance(){
        System.out.println("Welcome to Bank A, Your balance is"+balance);
    }
}
class BankB extends Bank{
    public int balance=150;
    public void getBalance(){
        System.out.println("Welcome to Bank B, Your balance is"+balance);
    }

}
class BankC extends Bank{
    public int balance=200;
    public void getBalance(){
        System.out.println("Welcome to Bank C, Your balance is"+balance);
    }

}
public class BankClass {
    public static void main(String[] args) {
        BankA b1=new BankA();
        b1.getBalance();
        BankB b2=new BankB();
        b2.getBalance();
        BankC b3=new BankC();
        b3.getBalance();
    }
}
