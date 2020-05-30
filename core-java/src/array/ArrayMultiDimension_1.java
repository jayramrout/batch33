package array;

public class ArrayMultiDimension_1 {
    public static void main(String[] args) {
        String peterName = "Peter";
        String peterAge = "30";
        String peterDetail[] = new String[2];
        peterDetail[0] = peterName;
        peterDetail[1] = peterAge;

        String bobName = "Bob";
        String bobAge = "35";

        String bobDetail[] = {bobName, bobAge};

//        String samDetail[] = {"Sam","27"};
        // 2Dimension array..


        String [][]personDetails = {peterDetail,bobDetail,{"Sam","27"}};
//        personDetails[0] // ?

        for (int i = 0 ; i< personDetails.length; i++) {
//            personDetails[i] // what will this give me back...
            /*for(){

            }*/
        }
        // how to loop these array...
        // for loop..
        // enhanced for loop...
        // while
        // do-while loop as well...
        // how to i loop these 2D array and print all the names and age...

        /*
            Peter Age is 30
            Bob Age is 35
            Sam Age is 27
         */

        // if any age is >= 35 then print...you are eligible for some hospital treatment...

    }
}
