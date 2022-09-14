package com.practicas.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemos {
    public static void show(){
        FileReader reader=null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");

        } catch (IOException | ParseException e) {
            System.out.println("Could not read data");
        }finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Could not read data");
                }
            }
        }
        System.out.println("File opened");
        System.out.println("There is no file");

    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
