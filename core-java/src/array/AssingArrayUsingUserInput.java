package array;

import java.util.Scanner;

public class AssingArrayUsingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the array size...");

        int size = scanner.nextInt();
        String names[] = new String[size];

        for(int i = 0 ; i < names.length; i++) {
            System.out.println("Enter name "+ i);
            names[i] = scanner.next();
        }

        for(String name: names){
            System.out.println(name);
        }

    }
}
