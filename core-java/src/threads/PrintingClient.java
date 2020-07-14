package threads;

public class PrintingClient {
    public static void main(String[] args) {

        Printer printer = new Printer("HP Printer");

        Computer computer1 = new Computer(printer,"Peter");
        Computer computer2 = new Computer(printer,"Pan");
        Computer computer3 = new Computer(printer, "San");

        computer1.start();
        computer2.start();
        computer3.start();
    }
}
