package classes_example;

public class FunctionExamples_4 {
    // DriverClassForFunction.main(args)
    public static void main(String[] args){
        FunctionExamples_4 f = new FunctionExamples_4();
        Laptop l1 = f.createLaptop("ONE","Apple","White");
        Laptop l2 = f.createLaptop("TWO","SONY","Black");

        System.out.println(l1.price);

        Laptop l3 = new Laptop();
        int age = 10;
    }

    public Laptop createLaptop(String name, String brand, String color){
        Laptop laptop = new Laptop();
        laptop.name = name;
        laptop.brand = brand;
        laptop.color = color;

        return laptop;
    }

    public int add(int a , int b){
        //
        //
        //

        return a+b;
    }



}
