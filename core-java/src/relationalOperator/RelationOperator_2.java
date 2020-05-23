package relationalOperator;

public class RelationOperator_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean isAEqualB = (a == b); // false
        int c = 30;
        int d = 40;
        // derive // drive
        boolean isTrue = (c < d); // true
//        System.out.println((isAEqualB || isTrue));


        System.out.println((isAEqualB && isTrue));
        boolean shouldTakeDecision = (isAEqualB || isTrue);
        System.out.println("shouldTakeDecision "+ shouldTakeDecision);

        boolean isTheShopOpen = true;

        if (!shouldTakeDecision && isTheShopOpen || (true || false))
            System.out.println("I am in a good position to take decision...");
        else
            System.out.println("I am not going to take Decision !!!!!");


        if (!shouldTakeDecision){
            System.out.println("I am in a good position to take decision...");
            System.out.println("Now i am going to make a diff......");
            if(true){

            }else {

            }
        }



    }
}
