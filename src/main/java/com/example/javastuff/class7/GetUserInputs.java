package com.example.javastuff.class7;

import java.util.Scanner;

public class GetUserInputs {
    public  static  void  main(String[] args){
        GetUserInputs getUserInputs = new GetUserInputs();
        getUserInputs.getUserInputsHandler();
    }

    private  void getUserInputsHandler(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        System.out.println("Name is:"+name);
        System.out.println("Please enter age:");
        int age = scanner.nextInt();
        System.out.printf("Age is:%d",age);
        scanner.close();
    }
}
