package array;

public class IntegerArray_loop_While {
    public static void main(String[] args) {
        String names[] = new String[5];
        names[0] = "Peter";
        names[1] = "Bob";
        names[2] = "Smith";
        names[3] = "Jagan";
        names[4] = "Randy";

        // Tradional
        for(int index = 0; index < names.length; index++) {
            System.out.println("names["+index+"] " + names[index]);
        }
        System.out.println("************");

        // Enhanced for loop
        for(String x : names) {
            System.out.println(x);
        }
        System.out.println("+++++++++++++++++");

        // while loop
        int i = 0;
        while(i < names.length){
            System.out.println(names[i]);
            i++;
        }

        // do-while loop...
        do {
            // first do something...
        }while (true);
    }
}
