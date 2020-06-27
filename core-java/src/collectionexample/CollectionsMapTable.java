package collectionexample;

import java.util.*;


public class CollectionsMapTable {
    public static void main(String[] args) {

//        Map<String,Integer> phoneDirectory = new Hashtable<>(); // synchronized .. slow in performance
        Map<String,Integer> phoneDirectory = new HashMap<>(); // non-synchronized
        phoneDirectory.put("Steve",Integer.valueOf(12356789));
        phoneDirectory.put("Peter",null);

        System.out.println(phoneDirectory);
    }

}
