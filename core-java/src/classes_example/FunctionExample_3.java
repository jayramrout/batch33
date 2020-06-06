package classes_example;

public class FunctionExample_3 {

    public static void main(String[] args) {

        FunctionExample_3 f = new FunctionExample_3();
        int first_value = f.add(10,3);

        first_value = new FunctionExample_3().add(10,3);

        // 30,40,50
        int second_value = add(30,40,50);

        int third_value = add(30,40,50,"60");
    }


    /*@Override
    public String toString() {
        return super.toString();
    }*/

    /*
     * method OverLoading...
     */
    public int add(int a , int b){
        return a+b;
    }

    public static int add(int a , int b, int c){
        return a+b+c;
    }

    public static void add(int a , int b, int c, int x){

    }

    public static int add(int a , int b, int c, String value){
        return a+b+c+Integer.parseInt(value);
    }

}
