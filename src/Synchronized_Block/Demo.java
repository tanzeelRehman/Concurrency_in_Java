package Synchronized_Block;

public class Demo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        MyThread t1 = new MyThread("Person A", printer);
        MyThread t2 = new MyThread("Person B", printer);

        t1.start();
        t2.start();

        // wait for threads to end
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}