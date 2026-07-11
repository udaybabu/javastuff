package com.example.javastuff.class6;

public class OperatorsInJava {
    /*
    1.Arithmetic Operators
    2.Unary Operators
    3.Relational Operators
    4.Conditional Operators
    5.Assignment Operators
     */
    public  static  void  main(String[] args){
        arithmeticOperators_handler();
        unaryOperators_handler();
        relationalOperators_Handler();
        conditionalOperators_Handler();
        assignmentOperators_Handler();
    }

    private static  void  arithmeticOperators_handler() {
        int a = 20;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
    private static  void  unaryOperators_handler(){
        /*
          ++(Increment)
          --(Decrement)
         */
        int k = 0;
        System.out.println("pre increment:"+ ++k); //pre increment
        System.out.println("post increment:"+ k++); //post increment
        System.out.println("value of:"+ k);
        System.out.println("pre decrement:"+ --k); //pre decrement
        System.out.println("post decrement:"+ k--); //post decrement
        System.out.println("value of:"+ k);
    }
    private static  void  relationalOperators_Handler(){
        /*
        ==(equal to)
        !=(not equal to)
        >(grater than)
        <(less than)
        >=(grater than or equal to)
        <=(less than or equal to)
         */
        int i = 10;
        int j = 20;
        System.out.println("Relational Operators");
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println(i>j);
        System.out.println(i<j);
        System.out.println(i>=j);
        System.out.println(i<=j);
    }
    private static  void  conditionalOperators_Handler() {
        /*
         &&(Conditional AND)
         ||(Conditional OR)
         */
        int i = 10;
        int j = 20;
        System.out.println("Conditional Operators");
        System.out.println("Conditional AND:"+ (i<j && i!=j));
        System.out.println("Conditional OR:"+ (i>j || i==j));

    }
    private static  void  assignmentOperators_Handler() {
        /*
         =
         +=
         -=
         *=
         /=
         %=
         */
        int i = 5;
        System.out.println("Assignment Operators");
        System.out.println("i *=5:" + (i *= 5));
    }

}
