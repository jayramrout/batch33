package inheritance;

import domain.Human;

public class InheritanceDriver_2 {
    public static void main(String[] args) {

        Human human = null;
        InheritanceDriver_2 ref = new InheritanceDriver_2();
        human = new Student("890-777-7676");
        human.setName("Peter");
        human.setFavoriteSports("Volleyball");
        ref.printCustomDetails(human);

        human = new Professor("787-989-999");
        human.setFavoriteSports("Poll");
        ref.printCustomDetails(human);
    }

    public void printCustomDetails(Human ref) {
        ref.basicBehaviour();
        System.out.println(String.format("Name in UpperCase %s , Sports in Lowercase %s", ref.getName() , ref.getFavoriteSports()));
        ref.taxCalcualtion();

    }

}
