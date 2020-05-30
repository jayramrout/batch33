package array;

public class ArrayMultiDimension {
    public static void main(String[] args) {
        String peterName = "Peter";
        String peterAge = "30";
        String peterDetail[] = new String[2];
        peterDetail[0] = peterName;
        peterDetail[1] = peterAge;

        String bobName = "Bob";
        String bobAge = "35";

        String bobDetail[] = {bobName, bobAge};

        String samDetail[] = {"Sam","27"};
        // 2Dimension array..
        String [][]personDetails = new String[3][2];
        personDetails[0][0] = peterName;
        personDetails[0][1] = peterAge;

        personDetails[1][0] = bobName;
        personDetails[1][1] = bobAge;

        personDetails[2][0] = samDetail[0];
        personDetails[2][1] = samDetail[1];



    }
}
