package com.example.javastuff.class5;

public class DifferentTypeofPrintStatements {

    public  static void main(String[] args){
        DifferentTypeofPrintStatements differentTypeofPrintStatements = new DifferentTypeofPrintStatements();
        differentTypeofPrintStatements.differentTypeofPrintStatements_Handler();
    }

    private void differentTypeofPrintStatements_Handler(){
        //print, printf, println
        System.out.println("Hello Uday");
        System.out.print("How are you");
        System.out.printf("Name is:%s \n", "Udaykumar");
        System.err.printf("The current year is:%d and current mont is:%s",2026,"JULY");
    }
}
