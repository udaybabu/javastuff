package com.example.javastuff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavastuffApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavastuffApplication.class, args);
        JavastuffApplication javastuffApplication = new JavastuffApplication();
        javastuffApplication.actionHandler_ClassInJava();
	}
    private void actionHandler_ClassInJava(){
        ClassInJava classInJava = new ClassInJava();
        ClassInJava.place = "Piler";
        ClassInJava.staticMethodHandler();
        System.out.println(classInJava.age);
        classInJava.nonStaticMethodHandler();
    }
}
