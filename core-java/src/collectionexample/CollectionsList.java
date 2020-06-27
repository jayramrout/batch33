package collectionexample;

import inheritance.PhysicsStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsList {
    public static void main(String[] args) {

        List<Integer> ageList = new ArrayList<>();
        ageList.add(1);
        ageList.add(2);
        ageList.add(3);
        ageList.add(4);
        ageList.add(5);
        ageList.add(Integer.valueOf("6"));
        ageList.add(Integer.valueOf("7"));
        ageList.add(Integer.valueOf("8"));

        // print everything...
        System.out.println(ageList);
        ageList.add(3,4);
        //after adding in between
        System.out.println(ageList);

        // get me a particular index..
        System.out.println(ageList.get(2));

        System.out.println("Size = "+ ageList.size());

        for(int i = 0; i < ageList.size(); i++){
            System.out.print(ageList.get(i)+"-->"); // remove extra arrow...
        }
        System.out.println("");
        for(int age: ageList) {
            System.out.print(age+"--*");
            CollectionsList.printMe(age);
        }
        System.out.println("forEach");
        ageList.forEach(System.out::println);
        ageList.forEach(CollectionsList::printMe);

        System.out.println("\nUsing Lambda expression...");
        ageList.forEach(age -> System.out.print(age));

        // how to i find something out of the collections...
        System.out.println("Even Ages...");
        List<Integer> evenAgeGreaterThan5 = new ArrayList<>();
        for(int age: ageList){
            if(age % 2 == 0 && age > 5) {
                System.out.println("Even Age "+ age+" ");
                evenAgeGreaterThan5.add(age);
            }
        }

        System.out.println(evenAgeGreaterThan5);

        // stream api....
        long count = ageList.stream()
                .filter(age -> age % 2 == 0)
                .count();

        System.out.println("total count = "+ count);

        Predicate<Integer> isEven = (age -> age % 2 == 0);
        List<Integer> collect = ageList.stream()
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
