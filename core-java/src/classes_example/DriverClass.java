package classes_example;

public class DriverClass {
    public static void main(String[] args) {
        new Laptop(); // garbage collection...
        Laptop apple;
        apple = new Laptop();
        apple.name = "Catalina"; // instance variable
        apple.brand = "Apple";
        apple.color = "White";
        apple.price = 2000;

        System.out.println(apple.name);
        System.out.println(apple.price);

        Laptop sony = new Laptop();
        sony.name = "SomName";
        sony.brand = "Sony";
        sony.color = "Black";
        sony.price = 1300;

        System.out.println(sony.name);
        System.out.println(sony.price);
        apple.name = "Apple1";

    }
}
