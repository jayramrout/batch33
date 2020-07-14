package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadProgram {
    public static void main(String[] args) {

        System.out.println("Start");

        System.out.println("Continue.....");
        System.out.println(Thread.currentThread().getName());

        Horse horse1 = new Horse("Cheeta");
        horse1.setPriority(Thread.MAX_PRIORITY);
        horse1.start(); // 5 seconds to execute...

        Horse horse2 = new Horse("Tiger");
        horse2.start(); // 5 seconds to excute.

        System.out.println("End"); // 10 seconds...
    }

    public static  void callMe(){

    }
}
