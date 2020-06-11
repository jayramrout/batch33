package misc;

public class Recursion {
    // how to find factorial of a number...
    // 3 --> 3*2*1
    // 4 -> 4*3*2*1

    public static void main(String[] args) {
        int factorial = Factorial.factorial(4);
        System.out.println(factorial);
    }
}

class Factorial {

    public static int factorial(int value) {
        int finalValue = 0;
        if(value == 0)
            return 1;

        finalValue = value * factorial(value - 1);
        return finalValue;
    }
}

/*
mainFolder
    a.txt
    folder1
        folder2
            c.txt
            d.txt
        b.txt
*/

