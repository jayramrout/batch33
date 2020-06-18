package inheritance;

import domain.Human;

public class InheritanceDriver_instanceof_5 {
    public static void main(String[] args) {

        Swimming professor = new Professor("787-989-999");
        printSwimDetails(professor);

        Swimming pet = new Pet();
        printSwimDetails(pet);

    }

    public static void printSwimDetails(Swimming swimming){
        swimming.swim();

    }

}
