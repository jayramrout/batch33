package inheritance;

import domain.Human;

public class Professor extends Human {

    private String[] mastersDegree;
    private String[] visitingProf;

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
}
