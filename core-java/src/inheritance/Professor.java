package inheritance;

import domain.Human;

public class Professor extends Human implements Hiking , LearningMath, Swimming {

    private String[] mastersDegree;
    private String[] visitingProf;
    private float salary;
    private Pet pet;

    public Professor(String ssn) {
        super(ssn);
    }

//    public Student[] favoriteStudent;

    public String[] getMastersDegree() {
        return mastersDegree;
    }

    public void setMastersDegree(String[] mastersDegree) {
        this.mastersDegree = mastersDegree;
    }

    public String[] getVisitingProf() {
        return visitingProf;
    }

    public void setVisitingProf(String[] visitingProf) {
        this.visitingProf = visitingProf;
    }

    @Override
    public void speakingSkills() {
        System.out.println("I speak atleast least 6 language...including spanish/french");
    }

    public void teachingSkills(){
        if(mastersDegree != null && mastersDegree.length >= 2) {
            System.out.println("This professor should be a very intelligent professor...");
        }else {
            System.out.println("This professor is good in teaching...");
        }
    }

    @Override
    public void hiking() {
        System.out.println("all the professors have a good hiking skills....");
    }

    @Override
    public void mathSolving() {
        System.out.println("This professor has a good math skills...");
    }

    @Override
    public void swim() {
        System.out.println("Prof has good swimming habit...");
    }
}
