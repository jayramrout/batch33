package collectionexample;

import inheritance.PhysicsStudent;

import java.util.*;


public class CollectionsMap {
    public static void main(String[] args) {
        //Map...
        // key --> value
        // Name --> Phone

        Map<String,Integer> phoneDirectory = new HashMap<>();
        phoneDirectory.put("Steve",Integer.valueOf(12356789));
        phoneDirectory.put("Peter",Integer.valueOf(12356999));
        phoneDirectory.put("John",Integer.valueOf(77777777));
        phoneDirectory.put("Rosy",7676765);

        System.out.println(phoneDirectory);

        List<String> teachers = new ArrayList<>();
        teachers.add("Teacher_1");
        teachers.add("Teacher_2");
        teachers.add("Teacher_3");
        teachers.add("Teacher_4");

        List<String> teachers_11 = new ArrayList<>();
        teachers_11.add("Teacher_11");
        teachers_11.add("Teacher_22");
        teachers_11.add("Teacher_33");
        teachers_11.add("Teacher_44");


//        Map<String, List<PhysicsStudent>> teacherMap = new HashMap<>();

//        Map<String, List<String>> teacherMap = new HashMap<>();
        Map<String, List<String>> teacherMap = new HashMap<>();
        teacherMap.put("St.JohnSchool",teachers); // 3
        teacherMap.put("Xavier",teachers_11);
        teacherMap.put("Xavier",teachers_11);
        teacherMap.put("Xavier",teachers_11);
        teacherMap.put("Xavier33",teachers_11); // 9
        teacherMap.put("Xavier",teachers_11);
        teacherMap.put("Xavier",teachers_11);
        teacherMap.put("Xavier",teachers_11);
        teacherMap.put("Xavier66",teachers_11); // 10
        teacherMap.put("Xavier",teachers_11);


        teacherMap.put("St.JohnSchool", new ArrayList<>());
        System.out.println(teacherMap);


        System.out.println(teacherMap.keySet());
        teacherMap.get("Xavier66"); // 10

        System.out.println(teacherMap.get("Xavier"));

        // figure out how to loop all the key value pair...

    }

}
