package constructor;

import domain.Human;

public class SetterGetterDriver {
    public static void main(String[] args) {
        Human human = null;//new Human("333-45-5678");
        human.setName("Peter");
        System.out.println(human); // printing a reference...

        Human john = null;//new Human("John","234-55-678");
        System.out.println(john);
    }
}
