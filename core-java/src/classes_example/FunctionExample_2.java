package classes_example;

public class FunctionExample_2 {

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.name = "Something";
        System.out.println(laptop.name);

        FunctionExample_2 functionExample_2 = new FunctionExample_2();
        functionExample_2.calculateResult_1(10,20);

        calculateResult_1(10,20);

    }

   public static void calculateResult_1(int a , int b){
        int value[] = {234,2,3,456,5,6,7,8,9,11,22,44,66};
        int result_1 = a + b;
        int div_result_1 = result_1/10; // 3

        System.out.println("Div Result ="+ div_result_1);
        System.out.println(value[div_result_1]);
    }


}
