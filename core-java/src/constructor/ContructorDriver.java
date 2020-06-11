package constructor;

import domain.Human;

public class ContructorDriver {
    public static void main(String[] args) {
        // Compile time polymorphism
        ContructorDriver cd = new ContructorDriver();

        int a = 10;
        cd.changeValue(a);
        System.out.println(a);


        Human human = new Human("Peter","44444",40,5);
        System.out.println(human);
        System.out.println("Before "+ human.getName());
        cd.changeValue(human);
        System.out.println("After "+ human.getName());

    }

    // is java pass by value or pass by reference....
    public void changeValue(int a){
        a = 50;
        System.out.println(a);
    }

    public void changeValue(Human human) {
        System.out.println(human.getName());
        human.setName("Changed Name");
    }
}
