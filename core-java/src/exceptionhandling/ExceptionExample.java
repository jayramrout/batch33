package exceptionhandling;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        String numberArray[] = {"1","2","3","4","5"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first  number :\n"); // 10
        int num = scanner.nextInt();

        System.out.println("Enter division  number :\n"); // 5
        int div = scanner.nextInt();

        int finalResult = num/div; // 10/5 = 2 // ArithmeticException

        // get some information from the array...
        int i = 0;

        try{
            i = Integer.parseInt(numberArray[finalResult]); // ArrayIndexOutOfBoundsException
        }catch (Exception exp){
            exp.printStackTrace();
            i = 8;
        }

        int myFinalResult = i/2;

        System.out.println("myFinalResult "+ myFinalResult);

        System.out.println("Exiting out of the program...");


    }
}
