package inheritance;

import domain.Human;

public class InheritanceDriver {
    public static void main(String[] args) {
        Human xs = new Student("890-777-7676");
        xs.setName("Peter");
//        xs.setRollno(33333);
        xs.setFavoriteSports("Volleyball");

        xs.basicBehaviour();

        Human p = new Professor("787-989-999");
        p.basicBehaviour();

//          Student x = new Human("890-777-7676");
//          Human x = new Student("890-777-7676");

//        Professor p = new Student("787-989-88");

//        Human xy = new Human("343434"); // abstract class...
        // for an abstract class , you cannot create an instance of that class...

    }



}
