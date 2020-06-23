package exceptionhandling;

import java.util.Scanner;

public class ExceptionExample_MultipleCatch {
    public static void main(String[] args) {
        String numberArray[] = {"1","2","3","4","5","SIX"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first  number :\n"); // 10
        int num = scanner.nextInt();

        System.out.println("Enter division  number :\n"); // 5
        int div = scanner.nextInt();
        int i = 0;

//        int a = 40/0; // uncaught exception..
        try {
            // uncaught exception...
            int finalResult = num/div; // 10/5 = 2 // ArithmeticException
            String strVal = numberArray[finalResult]; // NumberFormatException
            i = Integer.parseInt(strVal); // ArrayIndexOutOfBoundsException
            // somethingException
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException exp){
            exp.printStackTrace();
            i = 12;
        }catch (Exception nfe){
            i = 10;
        }finally {
            System.out.println("This is my finally block...");
        }
        int myFinalResult = i/2;

        System.out.println("myFinalResult "+ myFinalResult);

        System.out.println("Exiting out of the program...");


    }


}
