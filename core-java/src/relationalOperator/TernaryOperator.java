package relationalOperator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you age..");
        int value = scanner.nextInt();
        boolean isOld = value > 60;

        /*if(isOld) {
            System.out.println("I am Old");
        }else {
            System.out.println("I am pretty Young");
        }*/
        /*if(true){
            if(true){

            }
        }*/
        // 70
        System.out.println(isOld ? "I am Old" : "I am pretty Young");
        // nested ternary operator...
        System.out.println(isOld ? (value < 75 ? "I am Old": "I am very old ...") : "I am pretty Young");

    }
}
