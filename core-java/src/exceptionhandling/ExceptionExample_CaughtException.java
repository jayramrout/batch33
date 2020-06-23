package exceptionhandling;

import java.util.Scanner;

public class ExceptionExample_CaughtException {
    public static void main(String[] args) {

        String numberArray[] = {"1","2","3","4","5","SIX"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first  number :"); // 10
        int num = scanner.nextInt();

        System.out.println("Enter division  number :"); // 5
        int div = scanner.nextInt();
        int i = 0;
        try {
            i = computeResult(num, div, numberArray);
        } catch (MyOwnException | DivisionByHundredException exp) {
            exp.printStackTrace();
        }

        int myFinalResult = i/2;

        System.out.println("myFinalResult "+ myFinalResult);
        System.out.println("Exiting out of the program...");
    }

    /*public static int computeResult(int num, int div, String numberArray[]) throws RuntimeException {
        if(div == 0) { // 5
            throw new IllegalArgumentException("Cannot divide a number by zero...");
        }

        int finalResult = num/div; // 10/5 = 2 // ArithmeticException
        String strVal = numberArray[finalResult]; // NumberFormatException
        int i = Integer.parseInt(strVal); // ArrayIndexOutOfBoundsException
        return i;
    }*/

    public static int computeResult(int num, int div, String numberArray[]) throws MyOwnException, DivisionByHundredException {
        if(div == 0) { // 5
            throw new MyOwnException("Cannot divide a number by zero...");
        }

        if(div == 100) { // 5
            throw new DivisionByHundredException("Please donot pass value 100 for division...");
        }
        int finalResult = num/div; // 10/5 = 2 // ArithmeticException
        String strVal = numberArray[finalResult]; // NumberFormatException
        int i = Integer.parseInt(strVal); // ArrayIndexOutOfBoundsException
        return i;
    }

}
