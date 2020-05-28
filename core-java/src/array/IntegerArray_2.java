package array;

public class IntegerArray_2 {
    public static void main(String[] args) {
        int peterAge = 34;
        int samAge = 33;

//        int ageArray[] = new int[5]; // create an array and initialized the array
        int ageArray[] = {peterAge,samAge,50}; // created and assigned the values also

        System.out.println("Length of the array is "+ ageArray.length); // property
        System.out.println(ageArray[0]);
        System.out.println(peterAge);

//        ageArrays[5] = 50; // compile time error...
        ageArray[5] = 50; // runtime exception...
//        ageArray[3] = 45.5f;
        double age1 = 55.5f;
        System.out.println(ageArray[3]); // 0 1 2 ....
        // ArrayIndexOutOfBoundsException
    }
}
