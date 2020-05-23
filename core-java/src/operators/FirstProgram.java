package operators;

public class FirstProgram {
    public static void main(String[] args) {
        //increment
        System.out.println("*******INCREMENT*********");
        int age = 10;
        System.out.println(age);
        age++;
        System.out.println(age);

        System.out.println("*******DECREMENT*********");
        //decrement
        int housePrice = 100;
        System.out.println(housePrice);
        housePrice--; // minus one
        System.out.println(housePrice);

        String name = "John";

        // Additional Assignement
        System.out.println("*******Additional Assignement*********");
        System.out.println(housePrice);
//        housePrice = housePrice + 10;
        housePrice +=  10;
        System.out.println("Huge increment value "+ housePrice);
        System.out.println("5" + housePrice);
        System.out.println("Peter"+" Pan");

        System.out.println("10%3 = "+ 10%3);

    }
}
