package classes_example;

public class DriverClass_Reference {
    public static void main(String[] args) {

//        double height = 10.10;
        // Singleton design pattern... always you would create one object only...
        Television sony = new Television(); // super class... inheritance...
        sony.name = "SomName";
        sony.brand = "Sony";

        Television sony2 = new Television();
        sony2.name = "SomName";
        sony2.brand = "Sony";

        System.out.println(sony == sony2); // reference false

        Television sony_duplicateRef = sony;

        System.out.println(sony == sony_duplicateRef); // true

        // functions /// constructor...

    }
}
