package collectionexample;

import inheritance.PhysicsStudent;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        int ages[] = {1,2,3,4,5};


        List ageList = new ArrayList<>();
        // Set
        // Map
        // Collections
        // Streaming
        // Filters
        // Predicate
        // Comsumers

        ageList.add(1);
        ageList.add(2);
        ageList.add(3);
        ageList.add(4);
        ageList.add(5);

        System.out.println(ageList);

        ageList.add(6);
        ageList.add("Hello");
        ageList.add(new PhysicsStudent("55555"));

        System.out.println(ageList);

    }
}
