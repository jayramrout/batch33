package relationalOperator;

public class RelationOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean isAEqualB = (a == b); // false

        System.out.println("(10 == 20) isAEqualB "+ isAEqualB);
        System.out.println("(10 != 20) isAEqualB "+ (a != b));

        // boolean true false

        int c = 30;
        int d = 40;

        boolean isTrue = (c < d); // true
        System.out.println("isTrue ="+ isTrue);

        System.out.println((isAEqualB && isTrue));
        System.out.println("isAEqualB "+ isAEqualB);
        System.out.println((!isAEqualB && isTrue));


        System.out.println((!isAEqualB && isTrue));

        // if a school has more than 50 students : true
        // and if the school has more than 25 students whose height
        // is more than 6 feet.. : false

        // then that school can participate for a competion.



    }
}
