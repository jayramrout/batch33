package inheritance;

import domain.Human;

public class InheritanceDriver_3 {
    public static void main(String[] args) {
        Human human = new Student("890-777-7676");
        human.speakingSkills();

        human = new Professor("890-777-7777");
        human.speakingSkills();

    }



}
