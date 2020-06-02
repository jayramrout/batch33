package array;

public class IntegerArray_loop {
    public static void main(String[] args) {
        float distances[] = new float[50];
        distances[0] = 45.5f;
        distances[2] = 43.5f;
        distances[3] = 100.5f;
        distances[4] = 100.5f;
        distances[4] = 200.5f; // Override....
        distances[5] = 100.5f;
        distances[6] = 100.5f;
        distances[7] = 100.5f;
        // if i try to access the distances[1] then i would get 0.0
        // boolean array ? false
        String name = "";
        String names[] = new String[10];
//        Student students[] = new Student[40];

        /*System.out.println(distances[0]);
        System.out.println(distances[1]);
        System.out.println(distances[2]);*/

        // Looping thru the array...

        // for loop
        // while loop
        // do while loop
        int a = 10;
        System.out.println(a);
        a++;
        System.out.println(a);

        for(int index = 0; index < 10; index++) {
            System.out.println("distances["+index+"] " + distances[index]);
        }

    }
}
