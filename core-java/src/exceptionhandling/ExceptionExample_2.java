package exceptionhandling;

import java.util.Scanner;

public class ExceptionExample_2 {
    public static void main(String[] args) {
        String numberArray[] = {"1","2","3","4","5","SIX"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first  number :\n"); // 10
        int num = scanner.nextInt();

        System.out.println("Enter division  number :\n"); // 5
        int div = scanner.nextInt();

        int i = 0;
        try{
            int finalResult = num/div; // 10/5 = 2 // ArithmeticException
            String strVal = numberArray[finalResult]; // NumberFormatException
            i = Integer.parseInt(strVal); // ArrayIndexOutOfBoundsException
            // somethingException
        }catch (ArithmeticException exp){
            exp.printStackTrace();
            i = 12;
        }catch (ArrayIndexOutOfBoundsException exp){
            exp.printStackTrace();
            i = 8;
        }catch (Exception nfe){
            i = 10;
        }finally {

        }

        int myFinalResult = i/2;

        System.out.println("myFinalResult "+ myFinalResult);

        System.out.println("Exiting out of the program...");


    }
}
