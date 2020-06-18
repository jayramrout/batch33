package inheritance;

import domain.Human;


public class Student extends Human implements Swimming{

    private String schoolName;
    private int rollno;
    private String grade;

    public Student(String ssn){
        super(ssn);
    }
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void basicBehaviour() {
//        super.basicBehaviour();
        System.out.println("Being a student , you should read for atleast 4 hours...");

    }

    @Override
    public void speakingSkills() {
        System.out.println("I speak atleast least 5 language...including spanish");
    }


    public void allRoundSkills(){
        if(getFavoriteSports() != null && grade!= null && grade.equals("5")){
            System.out.println("This is a all rounder student.");
        }else {
            System.out.println("This is a standard student...");
        }
    }

    @Override
    public void swim() {

    }
}
