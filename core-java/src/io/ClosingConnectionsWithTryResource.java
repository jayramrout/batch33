package io;

import java.io.*;

public class ClosingConnectionsWithTryResource {
    public static void main(String[] args){
        String fileName =  "C:\\Users\\jrout\\Development\\Github\\batch33\\core-java\\src\\misc\\MathUtilDriver.java";
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))){
            int val;
            while((val = reader.read()) != -1){
                System.out.print((char)val);
            }
        }catch (IOException io){
            io.printStackTrace();
        }

    }
}
