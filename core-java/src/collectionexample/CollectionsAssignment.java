package collectionexample;

import java.util.*;


public class CollectionsAssignment {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Anne");
        names.add("John");
        names.add("Sam");
        System.out.println(names.contains("John"));
        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        //
        /*
        Create a Human Class
           have two properties name and age
        create a list of Human--> list.add(new Human("Peter",34));

        list.add(new Human("Peter",34));
        list.add(new Human("Jonh",33));

        //sort it using name and print the output...
        // sort it using age and print the output....

        // Comparator // Comparable Interface...
        // Collections.sort() and use the lambda expresssion to do it...
         */


    }

}
