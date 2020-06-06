package classes_example;

public class FunctionExample {
    public static void main(String[] args) {
        int value[] = {1,2,3,4,5,6,7,8,9,11,22,44,66};

        int a = 10;
        int b = 20;
        // add two number , divide by 10
        // and then get the value and search the array...

        int result_1 = a + b;
        int div_result_1 = result_1/10;
        ///logic 4
        // logic 5....
        System.out.println("Div Result ="+ div_result_1);
        System.out.println(value[div_result_1]);

        int c = 50;
        int d = 40;

        int result_2 = c + d;
        int div_result_2 = result_2/10;
        ///logic 4
        // logic 5....
        System.out.println("Div Result ="+ div_result_2);
        System.out.println(value[div_result_2]);


    }
}
