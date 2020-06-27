package io;

import inheritance.PhysicsStudent;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        String fileName =  "C:\\Users\\jroutt\\Development\\Github\\batch33\\core-java\\src\\misc\\MathUtilDriver.java";
        File file = new File(fileName);

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());


    }
}
