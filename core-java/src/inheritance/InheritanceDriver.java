package inheritance;

import domain.Human;

public class InheritanceDriver {
    public static void main(String[] args) {
        Student student = new Student("890-777-7676");
        student.setName("Peter");
        student.setRollno(33333);
        student.setFavoriteSports("Volleyball");

//        Student x = new Human("890-777-7676");

            Human x = new Student("890-777-7676");

//        Professor p = new Student("787-989-88");

        Human xy = new Human("343434"); // abstract class...

    }



}
