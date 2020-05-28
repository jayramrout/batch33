package array;

public class IntegerArray {
    public static void main(String[] args) {
        int peterAge = 34; // premitives...
        int samAge = 33;

        int ageArray[] = new int[5];
        ageArray[0] = peterAge;
        ageArray[1] = samAge;
//        ageArray[2];
        ageArray[3] = 50;
//        ageArray[4];

        System.out.println("ageArray.length " +ageArray.length);

        System.out.println(ageArray[0]);
        System.out.println(ageArray[3]);

        System.out.println("ageArray[2] "+ ageArray[2]);
        System.out.println("ageArray[4] "+ ageArray[4]);


    }
}
