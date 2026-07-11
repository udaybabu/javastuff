package com.example.javastuff.class3;

public class VariablesInJava {
    /*1)Global Variables
             a)Instance Variables(Non-Static Fields)
             b)Class Variables(Static Fields)
          2)Local Variables
             a)Local Variables
             b)Parameters  */

    String name = "Udaykumar"; // this is instance variable
    static String place = "Piler"; // This is class variables
//Datatype variableName = variableValue;
// Define & Initialisation

    public static void main(String[] args) {

        System.out.println(VariablesInJava.place);

        int pincode; //this is local variable
        //pincode = 517192;
        pincode = 517193;
        System.out.println(pincode);

        VariablesInJava variablesInJava = new VariablesInJava();
        variablesInJava.paramVariablesAction(30);
        System.out.println(variablesInJava.name);
    }

    private  void paramVariablesAction(int age) {
        age = 100;
        System.out.println(age);
    }

}
