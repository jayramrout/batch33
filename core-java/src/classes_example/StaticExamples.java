package classes_example;

public class StaticExamples {
    // DriverClassForFunction.main(args)
    public static void main(String[] args){
        Laptop l1 = new Laptop();
        l1.name = "ONE";
        l1.count++;
        System.out.println("l1.count "+ l1.count +" l1.name "+ l1.name);

        Laptop l2 = new Laptop();
        l2.name = "TWO";
        l2.count++;
        System.out.println("l2.count "+ l2.count +" l2.name "+ l2.name);

        Laptop.count = 500;
        System.out.println(Laptop.count);

        System.out.println("l1.count "+ l1.count +" l1.name "+ l1.name);
    }


}
