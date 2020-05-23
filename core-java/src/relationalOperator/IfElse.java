package relationalOperator;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 6");

        int monthNumber = scanner.nextInt(); // April
        if (monthNumber < 0 || monthNumber > 5) {
            System.out.println("Wrong entry...");
        } else {

            if(monthNumber == 1) {      // 1 min
                System.out.println("Jan");
            }else if(monthNumber == 2) {
                System.out.println("Feb");
            }else if(monthNumber == 3){
                System.out.println("March");
            }else if(monthNumber == 4){
                System.out.println("April");
            }else if(monthNumber == 5){
                System.out.println("May");
            }

        }

        System.out.println("This is my last line in the code...");
    }
}
