package com.example.javastuff.class1;

public class ClassInJava {
    static {
        System.out.println("This is static block");
    }

    {
        System.out.println("This is non static block");
    }

    ClassInJava(String place) {
        System.out.println("This is constractor:" +place);
    }

    String name = "Uday";
    int age = 30;
    boolean isActive = true;
    static String place;

    public void nonStaticMethodHandler() {
        System.out.println("This is non static method");
    }

    public  static void  staticMethodHandler() {
        System.out.println("This is static method");
    }

}
