package Binary_Semaphore;

import java.util.concurrent.Semaphore;

public class BinarySemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        MyThread thread1 = new MyThread(semaphore,"T1");
        MyThread thread2 = new MyThread(semaphore,"T2");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count: "+ MyResource.cout);
    }
}
