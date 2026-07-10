package com.example.javastuff.class2;

import com.example.javastuff.JavastuffApplication;
import com.example.javastuff.class1.Main;
import org.springframework.boot.SpringApplication;

public class DataTypes {
    public static void main(String[] args) {
        DataTypes dataTypes = new DataTypes();
        dataTypes.actionHandler_PrimitiveDataTypesInJava();
    }
    private void  actionHandler_PrimitiveDataTypesInJava() {
        //This is number types
        byte b = 10;
        System.out.println("Byte size:"+Byte.SIZE+"Byts");
        System.out.println("Byte minimum value:"+Byte.MIN_VALUE);
        System.out.println("Byte maximum value:"+Byte.MAX_VALUE);

        short s = 20;
        System.out.println("Short size:"+Short.SIZE+"Byts");
        System.out.println("Short minimum value:"+Short.MIN_VALUE);
        System.out.println("Short maximum value:"+Short.MAX_VALUE);

        int i = 20;
        System.out.println("Int size:"+Integer.SIZE+"Byts");
        System.out.println("Int minimum value:"+Integer.MIN_VALUE);
        System.out.println("Int maximum value:"+Integer.MAX_VALUE);

        long l = 20;
        System.out.println("Long size:"+Long.SIZE+"Byts");
        System.out.println("Long minimum value:"+Long.MIN_VALUE);
        System.out.println("Long maximum value:"+Long.MAX_VALUE);

        float f = 123000.0F;
        System.out.println("Float size:"+Float.SIZE+"Byts");
        System.out.println("Float minimum value:"+Float.MIN_VALUE);
        System.out.println("Float maximum value:"+Float.MAX_VALUE);

        double d = 7349369389D;
        System.out.println("Double size:"+Double.SIZE+"Byts");
        System.out.println("Double minimum value:"+Double.MIN_VALUE);
        System.out.println("Double maximum value:"+Double.MAX_VALUE);

        //This is not num
        char c = 'h';
        System.out.println("Character size: " + Character.SIZE + "Byts");
        boolean bool = true;
        System.out.println("Boolean size: Not defined in Java");

    }
}
