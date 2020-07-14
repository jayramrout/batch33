package threads;
// extends Thread
// implements Runnable

//public class Horse extends Thread {
public class Horse extends Thread {
    public Horse(String name){
        super.setName(name);
    }

    @Override
    public void run() {
        runFast();
    }

    public void runFast(){
        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName()+ " running.."+ i + "  "+ Thread.currentThread().getName());
        }
    }
}
