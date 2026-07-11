package com.example.javastuff.class4;

public class Bank {
    static  double currentAmount = 1200;
    public  static void  greetCustomer(){
        System.out.println("Welcome to the bank application");
    }
    public void depositAction(int amount) {
       currentAmount += amount;
    }
    public void withdrawAction(int amount){
        currentAmount -= amount;
    }
    public static double getCurrentBalanceAction(){
       // System.out.println("Current balance is:" +currentAmount);
        return  currentAmount;
    }

}
