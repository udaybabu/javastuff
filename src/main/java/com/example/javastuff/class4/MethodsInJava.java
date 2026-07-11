package com.example.javastuff.class4;

public class MethodsInJava {
    //Syntax for writing a method
    /*accessModifier  staticOrNonStatic returnType methodName(parameters) throws ExceptionList {
    method body
      return value
    }*/
    public static void main(String[] args) {
        MethodsInJava methodsInJava = new MethodsInJava();
        methodsInJava.methodsInJava_Handler();
    }

    private void methodsInJava_Handler(){
        Bank.greetCustomer();
        Bank bank = new Bank();
        bank.depositAction(300);
        System.out.println("Balance:"+Bank.currentAmount);
        bank.withdrawAction(200);
        System.out.println("Balance:"+Bank.getCurrentBalanceAction());
    }


}
