package collectionexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsSet {
    public static void main(String[] args) {

        Set<Integer> ageSet = new HashSet<>();
        ageSet.add(1);
        ageSet.add(2);
        ageSet.add(3);
        ageSet.add(4);
        ageSet.add(4);
        ageSet.add(5);
        ageSet.add(Integer.valueOf("6"));
        ageSet.add(Integer.valueOf("7"));
        ageSet.add(Integer.valueOf("8"));

        // print everything...
        System.out.println(ageSet);


        System.out.println("");
        for(int age: ageSet) {
            System.out.print(age+"--*");
            CollectionsSet.printMe(age);
        }
        System.out.println("forEach");
        ageSet.forEach(System.out::println);
        ageSet.forEach(CollectionsSet::printMe);

        System.out.println("\nUsing Lambda expression...");
        ageSet.forEach(age -> System.out.print(age));

        // how to i find something out of the collections...
        System.out.println("Even Ages...");
        List<Integer> evenAgeGreaterThan5 = new ArrayList<>();
        for(int age: ageSet){
            if(age % 2 == 0 && age > 5) {
                System.out.println("Even Age "+ age+" ");
                evenAgeGreaterThan5.add(age);
            }
        }

        System.out.println(evenAgeGreaterThan5);

        // stream api....
        long count = ageSet.stream()
                .filter(age -> age % 2 == 0)
                .count();

        System.out.println("total count = "+ count);

        Predicate<Integer> isEven = (age -> age % 2 == 0);
        List<Integer> collect = ageSet.stream()
//              .filter(age -> age % 2 == 0)
                .filter(isEven)
                .filter(age -> age > 5)
                .collect(Collectors.toList());

        System.out.println("From Stream filter "+ collect);
    }

    public static void printMe(int val){
        System.out.println(val);
    }
}
