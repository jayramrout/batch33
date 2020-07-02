package io;

import java.io.*;

public class ClosingConnections {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\jrout\\Development\\Github\\batch33\\core-java\\src\\misc\\MathUtilDriver.java";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File(fileName)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            int val;
            while ((val = reader.read()) != -1) {
                System.out.print((char) val);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
