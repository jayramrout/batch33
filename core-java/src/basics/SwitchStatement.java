package basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 6");

        int monthN = scanner.nextInt(); // April
        if (monthN < 0 || monthN > 5) {
            System.err.println("Wrong entry...");
        } else {

            /*if(monthN == 1) {      // 1 min
                System.out.println("Jan");
            }else if(monthN == 2) {
                System.out.println("Feb");
            }else if(monthN == 3){
                System.out.println("March");
            }else if(monthN == 4){
                System.out.println("April");
            }else if(monthN == 5){
                System.out.println("May");
            }*/

            switch (monthN){
                case 1:{
                    System.out.println("Jan");break;
                }
                case 2:{
                    System.out.println("Feb"); break;
                }
                case 3:{
                    System.out.println("March");
                    break;
                }
                case 4:{
                    System.out.println("April");
                    break;
                }
                case 5:{
                    System.out.println("May");
                    break;
                }
                default:
                    System.out.println("Wrong entry...");
            }
        }

        System.out.println("This is my last line in the code...");
    }
}
