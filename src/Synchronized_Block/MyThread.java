package Synchronized_Block;

public class MyThread extends Thread {
    private String threadName;
    private Printer  printer;

    MyThread(String name,  Printer printer) {
        super(name);
        threadName = name;
        this.printer = printer;
    }

    public void run() {
        System.out.println(threadName+" starts printing a document");
        synchronized(printer) {
            printer.print();
        }
        System.out.println(threadName + " is exiting.");
    }
}
