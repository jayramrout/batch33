package classes_example;

public class DriverClass_Room {
    public static void main(String[] args) {

    Room livingRoom = new Room(); // object or instance

//    String name = new String("LivingRoom"); // you can use new String also to create a string object.
//    String name = "LivingRoom"; // you can use new String also to create a string object.

    livingRoom.name = "LivingRoom";

    // option 1
    livingRoom.laptop = new Laptop();

    //option 2
    Laptop ltop = new Laptop();
    ltop.brand = "Apple";

    livingRoom.laptop = ltop;
    livingRoom.television = new Television();

    }
}
