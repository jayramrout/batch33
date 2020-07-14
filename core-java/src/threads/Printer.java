package threads;
// extends Thread
// implements Runnable
public class Printer implements Runnable {
    private String printerName;

    public Printer(String printerName){
        this.printerName = printerName;
    }

    @Override
    public synchronized void run() {
        /*synchronized (){

        }*/

        for(int i = 0; i < 5; i++){
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println("Printing for "+ Thread.currentThread().getName() + " "+ i);
        }
    }
}
