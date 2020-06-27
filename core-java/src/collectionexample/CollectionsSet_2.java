package collectionexample;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsSet_2 {
    public static void main(String[] args) {

        Set<String> nameSet = new TreeSet<>();// new HashSet<>();
//        List<String> nameSet = new ArrayList<>();
        nameSet.add("Peter");
        nameSet.add("Ann");
        nameSet.add("Ann");
        nameSet.add("Dan");
        nameSet.add("Zen");

        System.out.println(nameSet);

    }

}
