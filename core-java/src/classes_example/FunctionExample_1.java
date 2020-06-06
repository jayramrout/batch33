package classes_example;

public class FunctionExample_1 {
    public static void main(String[] args) {
        calculateResult_1(10,20);

        int c = 50;
        int d = 40;


//        int value = calculateResult_1(c,d); // This is not OK as it does not return anything..
        calculateResult_1(c,d);

        // substract/ divide by 2 and then add it with e
        int subResult = calculateSubstraction(c,d);
        int e = 100;

        int finalResult = subResult + e;
        System.out.println(finalResult);

        /*
            If it returns something..but you don't capture..its OK
         */
        calculateSubstraction(70,50);

    }

    /*
    // add two number , divide by 10
    // and then get the value and search the array...
     */

    public static void calculateResult_1(int a , int b){
        int value[] = {234,2,3,456,5,6,7,8,9,11,22,44,66};
        int result_1 = a + b;
        int div_result_1 = result_1/10; // 3

        System.out.println("Div Result ="+ div_result_1);
        System.out.println(value[div_result_1]);
    }

    public static int calculateSubstraction(int a , int b){
        int result = (a - b)/2;
        int value[] = {234,2,3,456,5,6,7,8,9,11,22,44,66};
        //...
        System.out.println("Subsctraction result ="+ result);
        int i = value[result];

        System.out.println("Result is ="+ i);
        return i;
    }
}
