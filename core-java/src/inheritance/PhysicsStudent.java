package inheritance;

import domain.Human;

public class PhysicsStudent extends Student implements LearningMath {

    public PhysicsStudent(String ssn){
        super(ssn);
    }

    @Override
    public void mathSolving() {
        if(getGrade() == "5" && getFavoriteSports() != null){
            System.out.println("He is a real GEM");
            System.out.println("He/She is very good at solving math problems..");
        }else {
            System.out.println("He/She is very good at solving math problems..");
        }

    }
}
