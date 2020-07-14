package threads;

public class Computer extends Thread {

    private Printer printer;
    String computerName;
    public Computer(Printer printer, String computerName){
        super.setName(computerName);
        this.printer = printer;
        this.computerName = computerName;
    }

    @Override
    public void run() {
        new Thread(printer, computerName).start();
    }
}
