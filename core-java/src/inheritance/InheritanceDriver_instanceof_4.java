package inheritance;

import domain.Human;

public class InheritanceDriver_instanceof_4 {
    public static void main(String[] args) {

        Student student = new Student("890-777-7676");
        student.setName("Peter");
        student.setFavoriteSports("Volleyball");
        student.setGrade("5");
        printDetails(student);

        System.out.println(System.lineSeparator());

        Professor professor = new Professor("787-989-999");
        professor.setMastersDegree(new String[]{"Physics","Astro Physics"});
        professor.setFavoriteSports("Poll");
        printDetails(professor);

    }

    public static void printDetails(Human ref) {
        ref.basicBehaviour();
        System.out.println(String.format("Name in UpperCase %s , Sports in Lowercase %s", ref.getName() , ref.getFavoriteSports()));
        ref.taxCalcualtion();

        if(ref instanceof Professor){
            Professor professor = (Professor)ref;
            professor.teachingSkills();
        }else if (ref instanceof Student ) {
            Student student = (Student)ref;
            student.allRoundSkills();
        }
    }

    /*public static void printCustomDetailsP(Professor ref) {
        ref.basicBehaviour();
        System.out.println(String.format("Name in UpperCase %s , Sports in Lowercase %s", ref.getName() , ref.getFavoriteSports()));
        ref.taxCalcualtion();
        ref.teachingSkills();

    }

    public static void printCustomDetailsS(Student ref) {
        ref.basicBehaviour();
        System.out.println(String.format("Name in UpperCase %s , Sports in Lowercase %s", ref.getName() , ref.getFavoriteSports()));
        ref.taxCalcualtion();
        ref.allRoundSkills();
    }*/

}
