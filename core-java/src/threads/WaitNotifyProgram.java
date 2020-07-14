package threads;

public class WaitNotifyProgram {

    public static void main(String[] args) {
       Calculator calculator = new Calculator();
       calculator.start();
        // wait..for the child...
        synchronized (calculator){
            System.out.println("Waiting for the calculator to complete..");
            try {
                calculator.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(calculator.getTotal());
    }
}

class Calculator extends Thread {
    private int total;
    public void run(){
        synchronized (this){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int i = 0 ; i < 5 ; i++){
                total = total + 1;
            }
            notify();
        }
    }
    public int getTotal(){
        return total;
    }
}
