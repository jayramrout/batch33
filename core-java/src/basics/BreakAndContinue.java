package basics;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {

        int ages[] = {3,4,5,33,44,8,78,77,100};
















        // looping..iterating...
        for(int age: ages) {
            if(age == 33) {
                System.out.println("this bag has an  age what i m looking out for...");
                break;
            }
        }

        System.out.println(System.lineSeparator());
        for(int age: ages) {
            if(age == 33) continue;
            System.out.println(age);
        }

        System.out.println("************");
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println("");
        }

        System.out.println("&&&&&&&&&&&&&&&");

        int n = 1;
        do {
            if(n == 5)
                continue;
            System.out.println("n = " + n);
            n++;
        } while( n < 10 );

    }
}
