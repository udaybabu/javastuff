package com.example.javastuff.class1;

import com.example.javastuff.JavastuffApplication;
import org.springframework.boot.SpringApplication;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(JavastuffApplication.class, args);
        Main main = new Main();
        main.actionHandler_ClassInJava();
    }
    private void actionHandler_ClassInJava(){
        ClassInJava classInJava = new ClassInJava("Piler");
        ClassInJava.place = "Piler";
        ClassInJava.staticMethodHandler();
        System.out.println(classInJava.age);
        classInJava.nonStaticMethodHandler();
    }
}
