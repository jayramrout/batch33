package classes_example;

import domain.Human;

public class FunctionExamples_5 {
    // DriverClassForFunction.main(args)
    public static void main(String[] args){
        Laptop lt = createLT("ONE", "Apple", "White");
        Laptop lt1 = createLT("TWO", "Sony", "Black");

        int a = 10;
        Integer aa = new Integer(10); // wrapper Type
        Laptop lt2 = new Laptop();


        Room room = new Room();

    }


    public static Laptop createLT(String name, String brand, String color){
        Laptop lt = new Laptop();
        lt.name = "Aaa";
        lt.brand = "Bbb";
        lt.color = "Ccc";

        return lt;
    }
}
