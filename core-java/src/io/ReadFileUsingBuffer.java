package io;

import java.io.*;

public class ReadFileUsingBuffer {
    public static void main(String[] args) throws Exception {
        String fileName =  "C:\\Users\\jrout\\Development\\Github\\batch33\\core-java\\src\\misc\\MathUtilDriver.java";
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(new FileWriter("newFile.txt"));

        int a = 'a';
        int A = 'A';
        int space = ' ';


        System.out.println("a =" + a);
        System.out.println("A =" + A);
        System.out.println("Space =" + space);

        System.out.println();
        int val;
        while((val = reader.read()) != -1){
            System.out.print((char)val);
            writer.write(val);
        }


        // Read a file and write to a diff file..with a new name..

//        FileInputStream   .doc , .pdf .txt
//        FileOutputStream .doc , .pdf .txt

//        FileReader  -- txt .java
        // FileWriter -- txt .java .php


        // Use a fileReader and writer to copy a .pdf file from one location to another...
        // Use a fileInputStreamd and outputstream to copy a .pdf file from one location to another...
        // after that try opening up the same copied...

    }
}
