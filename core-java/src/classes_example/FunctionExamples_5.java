package classes_example;

public class FunctionExamples_5 {
    // DriverClassForFunction.main(args)
    public static void main(String[] args){
        Laptop lt = createLT("ONE", "Apple", "White");
        Laptop lt1 = createLT("TWO", "Sony", "Black");

    }


    public static Laptop createLT(String name, String brand, String color){
        Laptop lt = new Laptop();
        lt.name = "Aaa";
        lt.brand = "Bbb";
        lt.color = "Ccc";

        return lt;
    }
}
