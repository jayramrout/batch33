package classes_example;

public class Room { // Has-A Relationship
    String name;
    Television television;
    Laptop laptop;

    public Room(){
        System.out.println("I am calling the constructor...");
    }


    public Room(String color){

    }
}

// Create a house and have all possible objects...