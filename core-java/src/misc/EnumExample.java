package misc;

public class EnumExample {

    public static void main(String[] args) {
        printTheDay("");
//        orderCoffee("x large");
        orderCoffee(Coffee.SMALL);
    }


    public static void printTheDay(String day){
        System.out.println("Today is "+ day);
    }


    /*public static void orderCoffee(String options){

        if(options.equals("small")){
            System.out.println("Small Coffee isready");
        }else if(options.equals("medium")){
            System.out.println("Medium Coffee isready");
        }else if(options.equals("large")){
            System.out.println("Large Coffee isready");
        }

    }*/

    public static void orderCoffee(Coffee options){

        if(options.equals(Coffee.SMALL)){
            System.out.println("Small Coffee isready");
        }else if(options.equals(Coffee.MEDIUM)){
            System.out.println("Medium Coffee isready");
        }else if(options.equals(Coffee.LARGE)){
            System.out.println("Large Coffee isready");
        }

    }
}

enum Coffee {
    SMALL, MEDIUM, LARGE
}


